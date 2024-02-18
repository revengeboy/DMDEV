package com.ekdev.homeworks.fourthHomework.inheritance;

import com.ekdev.homeworks.fourthHomework.inheritance.cosmos.*;
import com.ekdev.homeworks.fourthHomework.inheritance.utils.SpaceUtils;

public class TaskRunner {

    public static void main(String[] args) {
        Asteroid asteroid = new Asteroid(20, 34, 120);
        asteroid.tellAboutSize();
        System.out.println();
        Comet comet = new Comet(12, 15, true);
        comet.printHowFastComet();
        System.out.println();
        Planet planet = new Planet(40, 79, true);
        planet.positiveViable();
        System.out.println();
        Star star = new Star(190, 74, true);
        star.radiating();
        star.dangerouslyExplosive();
        System.out.println();
        Satellite satellite = new Satellite(20, 13, 999);
        satellite.dangerouslyExplosive();
        satellite.printHowOldSatellite();
        System.out.println();
        System.out.println("Является ли звездой - " + SpaceUtils.isStar(star));
        System.out.println("Является ли звездой - " + SpaceUtils.isStar(planet));
        System.out.println();
        System.out.println("Гравитация: " + SpaceUtils.getGravitation(planet, star, 9000));
    }
}
