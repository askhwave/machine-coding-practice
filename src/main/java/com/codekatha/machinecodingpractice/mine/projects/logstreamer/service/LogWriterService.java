package com.codekatha.machinecodingpractice.mine.projects.logstreamer.service;

import org.springframework.stereotype.Service;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Service
public class LogWriterService {
    private final ScheduledExecutorService writerScheduler =
            Executors.newSingleThreadScheduledExecutor();

    public void appendLog(String filePath, String message){
        try(FileWriter writer = new FileWriter(filePath,true)){
            writer.write(
                    LocalDateTime.now()
                    + " "
                    + message
                    + System.lineSeparator()
            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void generateDummyLogs(String filePath){
        writerScheduler.scheduleAtFixedRate(
                ()->appendLog(filePath,"User login event"),
                0,
                5,
                TimeUnit.SECONDS
        );
    }
}
