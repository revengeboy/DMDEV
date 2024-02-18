package com.ekdev.homeworks.fourthHomework.encapsulation;

import com.ekdev.homeworks.fourthHomework.encapsulation.atm.ATM;

public class TaskRunner {

    public static void main(String[] args) {
        ATM atm = new ATM(0, 0, 0);
        atm.setFiftyBanknoteAmount(5);
        atm.setTwentyBanknoteAmount(5);
        atm.setTenBanknoteAmount(5);
        System.out.println(atm.withDraw(180));
    }
}
