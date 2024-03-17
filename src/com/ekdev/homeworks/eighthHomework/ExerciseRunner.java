package com.ekdev.homeworks.eighthHomework;

import com.ekdev.homeworks.eighthHomework.model.Midnight;
import com.ekdev.homeworks.eighthHomework.model.mage.Mage;
import com.ekdev.homeworks.eighthHomework.model.planet.Planet;
import com.ekdev.homeworks.eighthHomework.model.rocket.Rocket;

public class ExerciseRunner {

    public static void main(String[] args) throws InterruptedException {
        Midnight midnight = new Midnight();
        Planet planet = new Planet(midnight, 100);
        Mage fireMage = new Mage("Fire");
        Mage airMage = new Mage("Air");
        Rocket fireMageRocket = new Rocket(fireMage, planet, midnight);
        Rocket airMageRocket = new Rocket(airMage, planet, midnight);

        midnight.start();
        planet.start();
        fireMageRocket.start();
        airMageRocket.start();

        midnight.join();
        planet.join();
        fireMageRocket.join();
        airMageRocket.join();

        System.out.println(fireMage.getName() + " mage collected " + fireMage.getCrystalsAmount() + " of crystals");
        System.out.println(airMage.getName() + " mage collected " + airMage.getCrystalsAmount() + " of crystals");
    }
}
