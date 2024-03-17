package com.ekdev.homeworks.eighthHomework.model.planet;

import com.ekdev.homeworks.eighthHomework.model.Midnight;
import com.ekdev.homeworks.eighthHomework.util.RandomNumbers;

public class Planet extends Thread {

    private final Object lock = new Object();
    private final Midnight midnight;
    private int crystalsAmount;
    private static final int MIN_CRYSTALS_PER_DAY = 2;
    private static final int MAX_CRYSTALS_PER_DAT = 5;

    public Planet(Midnight midnight, int initialCrystalsAmount) {
        this.midnight = midnight;
        this.crystalsAmount = initialCrystalsAmount;
    }

    @Override
    public void run() {
        try {
            growCrystals();
            waitNextMidnight();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateCrystalsCountAtPlanet(int crystals) {
        crystalsAmount -= crystals;
    }

    public Object getLock() {
        return lock;
    }

    private void growCrystals() {
        int crystalsGrown = RandomNumbers.getRandomInt(MIN_CRYSTALS_PER_DAY, MAX_CRYSTALS_PER_DAT);
        synchronized (this) {
            crystalsAmount += crystalsGrown;
        }
    }

    public int getCrystalsAmount() {
        return crystalsAmount;
    }

    public void setCrystalsAmount(int crystalsAmount) {
        this.crystalsAmount = crystalsAmount;
    }

    private void waitNextMidnight() throws InterruptedException {
        synchronized (midnight.getLock()) {
            midnight.getLock().wait();
        }
    }
}