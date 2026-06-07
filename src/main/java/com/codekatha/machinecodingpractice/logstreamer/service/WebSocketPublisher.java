package com.codekatha.machinecodingpractice.logstreamer.service;

import org.springframework.stereotype.Service;

@Service
public class WebSocketPublisher {
    public void publish(String content) {
        System.out.print(content);
    }
}
