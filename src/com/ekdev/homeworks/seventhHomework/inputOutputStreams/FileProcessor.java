package com.ekdev.homeworks.seventhHomework.inputOutputStreams;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileProcessor {

    public static List<String> readFileLines(Path path) {
        try {
            return Files.readAllLines(path, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeFileLines(Path path, List<String> linesList) {
        try {
            Files.write(path, linesList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
