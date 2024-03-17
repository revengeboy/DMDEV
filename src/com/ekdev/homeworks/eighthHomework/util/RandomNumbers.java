package com.ekdev.homeworks.eighthHomework.util;

import java.util.Random;

public final class RandomNumbers {

    public static int getRandomInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
}
