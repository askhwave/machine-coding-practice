package com.codekatha.machinecodingpractice.logstreamer.model;

public record LogChunk(String content, long nextOffset) {
}
