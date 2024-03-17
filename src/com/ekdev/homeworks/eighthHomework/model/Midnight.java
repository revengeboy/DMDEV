package com.ekdev.homeworks.eighthHomework.model;

public class Midnight extends Thread {

    private final Object lock = new Object();
    public static final int MIDNIGHT_HOUR = 24;
    public static int MIDNIGHT_COUNTER = 1;

    @Override
    public void run() {
        synchronized (lock) {
            try {
                System.out.printf("Midnight number %s in process%n", MIDNIGHT_COUNTER);
                MIDNIGHT_COUNTER++;
                lock.notifyAll();
                lock.wait(MIDNIGHT_HOUR);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        synchronized (lock) {
            lock.notifyAll();
        }
    }

    public Object getLock() {
        return lock;
    }
}
