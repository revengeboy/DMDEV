package com.ekdev.homeworks.fourthHomework.encapsulation.atm;

import java.util.Objects;

public class ATM {

    private int tenBanknoteAmount;
    private int twentyBanknoteAmount;
    private int fiftyBanknoteAmount;

    public ATM(int tenBanknoteAmount, int twentyBanknoteAmount, int fiftyBanknoteAmount) {
        this.tenBanknoteAmount = tenBanknoteAmount;
        this.twentyBanknoteAmount = twentyBanknoteAmount;
        this.fiftyBanknoteAmount = fiftyBanknoteAmount;
    }

    public boolean withDraw(int amount) {
        System.out.println("Желаемая сумма: " + amount);
        if (isEnoughMoneyInATM(amount)) {
            withDrawProcess(amount);
            return true;
        } else {
            return false;
        }
    }

    public void withDrawProcess(int amount) {
        int i = amount % 50;
        if (i == 0 && amount < getFiftyBanknoteSum()) {
            System.out.println("Банкомат выдал купюры по 50 количеством: " + amount / 50);
            setFiftyBanknoteAmount(getFiftyBanknoteAmount() - amount / 50);
        } else if (amount > getFiftyBanknoteSum()) {
            int amountAfterFifty = amount - getFiftyBanknoteSum();
            System.out.println("Банкомат выдал все купюры по 50 количеством: " + getFiftyBanknoteAmount());
            setFiftyBanknoteAmount(0);
            int y = amountAfterFifty % 20;
            if (y == 0 && amountAfterFifty < getTwentyBanknoteSum()) {
                System.out.println("Банкомат выдал купюры по 20 количеством: " + amount / 20);
                setTwentyBanknoteAmount(getTwentyBanknoteAmount() - amount / 20);
            } else if (amountAfterFifty > getTwentyBanknoteSum()) {
                int amountAfterTwenty = amountAfterFifty - getTwentyBanknoteSum();
                System.out.println("Банкомат выдал все купюры по 20 количеством: " + getTenBanknoteAmount());
                setTwentyBanknoteAmount(0);
                int z = amountAfterTwenty % 10;
                if (z == 0 && amountAfterTwenty < getTenBanknoteSum()) {
                    System.out.println("Банкомат выдал купюры по 10 количеством: " + i / 10);
                    setTenBanknoteAmount(getTenBanknoteAmount() - amount / 10);
                }
            }
        }
    }

    private boolean isEnoughMoneyInATM(int amount) {
        int allMoneyInATM = calculateAllMoneyInATM();
        printInfoAboutMoneyInATM(allMoneyInATM);
        return amount < allMoneyInATM;
    }

    private void printInfoAboutMoneyInATM(int allMoney) {
        System.out.println("Сумма в банкомате: " + allMoney);
        System.out.println("Количество купюр по 50: " + getFiftyBanknoteAmount());
        System.out.println("Количество купюр по 20: " + getTwentyBanknoteAmount());
        System.out.println("Количество купюр по 10: " + getTenBanknoteAmount());
    }

    private int calculateAllMoneyInATM() {
        return getTenBanknoteSum() + getTwentyBanknoteSum() + getFiftyBanknoteSum();
    }

    private int getTenBanknoteSum() {
        return tenBanknoteAmount * 10;
    }

    private int getTwentyBanknoteSum() {
        return twentyBanknoteAmount * 20;
    }

    private int getFiftyBanknoteSum() {
        return fiftyBanknoteAmount * 50;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ATM atm = (ATM) o;
        return tenBanknoteAmount == atm.tenBanknoteAmount && twentyBanknoteAmount == atm.twentyBanknoteAmount && fiftyBanknoteAmount == atm.fiftyBanknoteAmount;
    }

    @Override
    public String toString() {
        return "ATM{" +
                "tenBanknoteAmount=" + tenBanknoteAmount +
                ", twentyBanknoteAmount=" + twentyBanknoteAmount +
                ", fiftyBanknoteAmount=" + fiftyBanknoteAmount +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(tenBanknoteAmount, twentyBanknoteAmount, fiftyBanknoteAmount);
    }

    public int getTenBanknoteAmount() {
        return tenBanknoteAmount;
    }

    public void setTenBanknoteAmount(int tenBanknoteAmount) {
        this.tenBanknoteAmount = tenBanknoteAmount;
    }

    public int getTwentyBanknoteAmount() {
        return twentyBanknoteAmount;
    }

    public void setTwentyBanknoteAmount(int twentyBanknoteAmount) {
        this.twentyBanknoteAmount = twentyBanknoteAmount;
    }

    public int getFiftyBanknoteAmount() {
        return fiftyBanknoteAmount;
    }

    public void setFiftyBanknoteAmount(int fiftyBanknoteAmount) {
        this.fiftyBanknoteAmount = fiftyBanknoteAmount;
    }
}
