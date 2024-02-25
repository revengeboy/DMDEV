package com.ekdev.homeworks.fourthHomework.inheritance.utils;

import com.ekdev.homeworks.fourthHomework.inheritance.cosmos.CosmosObject;
import com.ekdev.homeworks.fourthHomework.inheritance.cosmos.Star;

public final class SpaceUtils {

    public static double getGravitation(CosmosObject firstCosmosObject, CosmosObject secondCosmosObject, int distance) {
        return (firstCosmosObject.getDiameter() + secondCosmosObject.getDiameter()) * distance;
    }

    public static boolean isStar(CosmosObject cosmosObject) {
        return cosmosObject instanceof Star;
    }

    private SpaceUtils() {
    }
}
