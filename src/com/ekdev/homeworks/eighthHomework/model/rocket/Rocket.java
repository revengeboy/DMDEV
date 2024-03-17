package com.ekdev.homeworks.eighthHomework.model.rocket;

import com.ekdev.homeworks.eighthHomework.model.Midnight;
import com.ekdev.homeworks.eighthHomework.model.mage.Mage;
import com.ekdev.homeworks.eighthHomework.model.planet.Planet;
import com.ekdev.homeworks.eighthHomework.util.RandomNumbers;

public class Rocket extends Thread {

    private final Mage mage;
    private final Planet planet;
    private final Midnight midnight;
    private static final int MIN_CRYSTALS_PER_ROCKET = 2;
    private static final int MAX_CRYSTALS_PER_ROCKET = 5;

    public Rocket(Mage mage, Planet planet, Midnight midnight) {
        this.mage = mage;
        this.planet = planet;
        this.midnight = midnight;
    }

    @Override
    public void run() {
        try {
            if (mage.getCrystalsAmount() < 500) {
                mage.updateCrystalsCount(getCrystalsFromPlanet());
                waitNextLaunch();
            } else {
                System.err.printf("Mage %s has reached 500 crystals!", mage.getName());
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private int getCrystalsFromPlanet() {
        int crystalsCollectedFromPlanet = RandomNumbers.getRandomInt(MIN_CRYSTALS_PER_ROCKET, MAX_CRYSTALS_PER_ROCKET);
        synchronized (planet.getLock()) {
            if (planet.getCrystalsAmount() < crystalsCollectedFromPlanet) {
                System.out.printf("Crystals amount for rocket of %s mage too low, we leave planet with empty rocket",
                        mage.getName());
            } else {
                planet.updateCrystalsCountAtPlanet(crystalsCollectedFromPlanet);
            }
        }
        return crystalsCollectedFromPlanet;
    }

    private void waitNextLaunch() throws InterruptedException {
        synchronized (midnight.getLock()) {
            midnight.getLock().wait();
        }
    }
}
