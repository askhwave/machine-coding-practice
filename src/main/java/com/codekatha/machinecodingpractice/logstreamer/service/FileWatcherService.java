package com.codekatha.machinecodingpractice.logstreamer.service;

import com.codekatha.machinecodingpractice.logstreamer.model.LogChunk;
import org.springframework.stereotype.Service;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Service
public class FileWatcherService {
    private long currentOffset = 0;
    private final FileReaderService fileReaderService;
    private final WebSocketPublisher webSocketPublisher;

    private final ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();

    public FileWatcherService(FileReaderService fileReaderService,
            WebSocketPublisher webSocketPublisher) {
        this.fileReaderService = fileReaderService;
        this.webSocketPublisher = webSocketPublisher;
    }

    public void startWatching(String filePath) {
        //System.out.println("Watcher Started");
        scheduler.scheduleAtFixedRate(
                ()->{
                    //System.out.println("Scheduler Running");
                    LogChunk chunk =
                            fileReaderService.readNewContent(filePath,currentOffset);
                    currentOffset = chunk.nextOffset();
                    if (!chunk.content().isEmpty()) {
                        webSocketPublisher.publish(chunk.content());
                    }                },
                0,
                1,
                TimeUnit.SECONDS
        );

    }
}
