package com.ekdev.homeworks.eighthHomework.model;

import com.ekdev.homeworks.eighthHomework.model.mage.Mage;

public class Midnight extends Thread {

    private final Object lock = new Object();
    private final Mage mage;
    public static final int MIDNIGHT_HOUR = 24;
    public static int MIDNIGHT_COUNTER = 1;

    @Override
    public void run() {
        synchronized (lock) {
            try {
                while (mage.getCrystalsAmount() <= 500) {
                    System.out.printf("\nMidnight number %s in process", MIDNIGHT_COUNTER);
                    MIDNIGHT_COUNTER++;
                    lock.notifyAll();
                    lock.wait(MIDNIGHT_HOUR);
                }
                System.exit(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        synchronized (lock) {
            lock.notifyAll();
        }
    }

    public Midnight(Mage mage) {
        this.mage = mage;
    }

    public Object getLock() {
        return lock;
    }
}
