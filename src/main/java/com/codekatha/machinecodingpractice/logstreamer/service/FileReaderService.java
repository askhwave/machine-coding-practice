package com.codekatha.machinecodingpractice.logstreamer.service;

import com.codekatha.machinecodingpractice.logstreamer.model.LogChunk;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.RandomAccessFile;

@Service
public class FileReaderService {

    public LogChunk readNewContent(String filePath, long offset) {
        try(RandomAccessFile file = new RandomAccessFile(filePath,"r")){
            file.seek(offset);
            StringBuilder content = new StringBuilder();
            String line;

            while((line=file.readLine())!=null){
                content.append(line).append("\n");
            }
            long nextOffset = file.getFilePointer();

            return new LogChunk(content.toString(),nextOffset);
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
