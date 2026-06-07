package com.codekatha.machinecodingpractice.logstreamer.controller;

import com.codekatha.machinecodingpractice.logstreamer.service.FileWatcherService;
import com.codekatha.machinecodingpractice.logstreamer.service.LogWriterService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/logs")
public class LogStreamerController {
    @Value("${log.file.path}")
    private String filePath;

    private final LogWriterService logWriterService;
    private final FileWatcherService fileWatcherService;

    public LogStreamerController(LogWriterService logWriterService, FileWatcherService fileWatcherService) {
        this.logWriterService = logWriterService;
        this.fileWatcherService = fileWatcherService;
    }

    @PostMapping("/start")
    public String start(){
        logWriterService.generateDummyLogs(filePath);
        fileWatcherService.startWatching(filePath);
        return "started";
    }


}
