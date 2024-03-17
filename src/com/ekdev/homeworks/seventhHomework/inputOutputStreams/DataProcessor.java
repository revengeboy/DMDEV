package com.ekdev.homeworks.seventhHomework.inputOutputStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataProcessor {

    public static List<String> removeListItem(List<String> stringList, int itemToRemove) {
        List<String> list = new ArrayList<>(stringList);
        list.remove(itemToRemove - 1);
        return list;
    }

    public static List<String> expectedDataToWrite(List<String> firstData, List<String> secondData) {
        if (firstData.size() == secondData.size()) {
            String[] firstDataArray = firstData.toArray(new String[0]);
            String[] secondDataArray = secondData.toArray(new String[0]);
            String[] ids = new String[secondData.size()];
            String[] names = new String[secondData.size()];
            String[] prices = new String[secondData.size()];
            String[] expectedData = new String[secondData.size()];
            String[] expectedDataWithTitle = new String[expectedData.length + 1];
            expectedDataWithTitle[0] = "ID,NAME,PRICE";
            for (int i = 0; i < secondDataArray.length; i++) {
                String[] lineToArray = secondDataArray[i].split(",");
                String id = lineToArray[0];
                String name = lineToArray[1];
                ids[i] = id;
                names[i] = name;
            }
            for (int i = 0; i < firstDataArray.length; i++) {
                String[] lineToArray = firstDataArray[i].split(",");
                String price = lineToArray[1];
                prices[i] = price;
            }
            for (int i = 0; i < ids.length; i++) {
                String expectedLine = String.join(",", ids[i], names[i], prices[i]);
                expectedData[i] = expectedLine;
            }
            System.arraycopy(expectedData, 0, expectedDataWithTitle, 1, expectedData.length);
            return Arrays.asList(expectedDataWithTitle);
        } else {
            throw new RuntimeException("Указано разное количество предметов в файлах");
        }
    }
}
