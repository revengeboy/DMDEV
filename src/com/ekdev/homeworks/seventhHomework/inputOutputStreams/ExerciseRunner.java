package com.ekdev.homeworks.seventhHomework.inputOutputStreams;

import java.nio.file.Path;
import java.util.List;

public class ExerciseRunner {

    public static void main(String[] args) {
        Path firstPath = Path.of("src", "com", "ekdev", "homeworks", "seventhHomework", "inputOutputStreams",
                "testdata", "idPrice.csv");
        Path secondPath = Path.of("src", "com", "ekdev", "homeworks", "seventhHomework", "inputOutputStreams",
                "testdata", "idNameDesc.csv");
        Path thirdPath = Path.of("src", "com", "ekdev", "homeworks", "seventhHomework", "inputOutputStreams",
                "testdata", "result.csv");
        List<String> firstInitialData = FileProcessor.readFileLines(firstPath);
        List<String> secondInitialData = FileProcessor.readFileLines(secondPath);
        List<String> firstData = DataProcessor.removeListItem(firstInitialData, 1);
        List<String> secondData = DataProcessor.removeListItem(secondInitialData, 1);
        System.out.println(firstData);
        System.out.println(secondData);
        FileProcessor.writeFileLines(thirdPath, DataProcessor.expectedDataToWrite(firstData, secondData));
    }
}
