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
            while (mage.getCrystalsAmount() <= 500) {
                mage.updateCrystalsCount(getCrystalsFromPlanet());
                waitNextLaunch();
                System.out.println();
                System.out.println(mage.getName() + " mage collected " + mage.getCrystalsAmount() + " of crystals");
            }
            System.exit(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private int getCrystalsFromPlanet() {
        int crystalsToCollectFromPlanet = RandomNumbers.getRandomInt(MIN_CRYSTALS_PER_ROCKET, MAX_CRYSTALS_PER_ROCKET);
        synchronized (planet.getLock()) {
            int crystalsAmountGrown = planet.getCrystalsAmount();
            if (crystalsAmountGrown < crystalsToCollectFromPlanet) {
                System.out.printf("\nCrystals amount %s mage rocket too low, we leave planet with empty rocket",
                        mage.getName());
                System.out.printf("\nAmount of crystals grown: %d", crystalsAmountGrown);
                System.out.printf("\n%s mage rocket expected at least: %d\n", mage.getName(),
                        crystalsToCollectFromPlanet);
            } else {
                planet.updateCrystalsCountAtPlanet(crystalsToCollectFromPlanet);
            }
        }
        return crystalsToCollectFromPlanet;
    }

    private void waitNextLaunch() throws InterruptedException {
        synchronized (midnight.getLock()) {
            midnight.getLock().wait();
        }
    }
}
