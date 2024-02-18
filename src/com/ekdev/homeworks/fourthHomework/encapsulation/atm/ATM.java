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
        System.out.println();
        if (isEnoughMoneyInATM(amount)) {
            withDrawProcess(amount);
            return true;
        } else {
            return false;
        }
    }

    public void withDrawProcess(int amount) {
        int i = amount % 50;
        if (amount == calculateAllMoneyInATM()) {
            withDrawAllMoney();
        } else if (amount > getFiftyBanknoteSum()) {
            int amountAfterAllFifties = withDrawAllFifties(amount);
            int y = amountAfterAllFifties % 20;
            if (amountAfterAllFifties > getTwentyBanknoteSum()) {
                int amountAfterAllTwenties = withDrawAllTwenties(amountAfterAllFifties);
                if (amountAfterAllTwenties % 10 == 0 && amountAfterAllTwenties < getTenBanknoteSum()) {
                    withDrawTens(amountAfterAllTwenties);
                }
            } else if (y == 0 && amountAfterAllFifties < getTwentyBanknoteSum()) {
                withDrawTwenties(amountAfterAllFifties);
            } else if (y != 0 && amountAfterAllFifties < getTwentyBanknoteSum()) {
                int amountAfterTwenty = withDrawTwenties(amountAfterAllFifties);
                if (amountAfterTwenty % 10 == 0 && amountAfterTwenty < getTenBanknoteSum()) {
                    withDrawTens(amountAfterTwenty);
                }
            }
        } else if (i == 0 && amount < getFiftyBanknoteSum()) {
            withDrawFifties(amount);
        } else if (i != 0 && amount < getFiftyBanknoteSum()) {
            int amountAfterFifty = withDrawFifties(amount);
            int y = amountAfterFifty % 20;
            if (amountAfterFifty > getTwentyBanknoteSum()) {
                int amountAfterAllTwenties = withDrawAllTwenties(amountAfterFifty);
                if (amountAfterAllTwenties % 10 == 0 && amountAfterAllTwenties < getTenBanknoteSum()) {
                    withDrawTens(amountAfterAllTwenties);
                }
            } else if (y == 0 && amountAfterFifty < getTwentyBanknoteSum()) {
                withDrawTwenties(amountAfterFifty);
            } else if (y != 0 && amountAfterFifty < getTwentyBanknoteSum()) {
                int amountAfterTwenty = withDrawTwenties(amountAfterFifty);
                if (amountAfterTwenty % 10 == 0 && amountAfterTwenty < getTenBanknoteSum()) {
                    withDrawTens(amountAfterTwenty);
                }
            }
        }
    }

    private int withDrawFifties(int amount) {
        int fiftyAmountToWithdraw = amount / 50;
        System.out.println("Банкомат выдал купюры по 50 количеством: " + fiftyAmountToWithdraw);
        setFiftyBanknoteAmount(getFiftyBanknoteAmount() - fiftyAmountToWithdraw);
        return amount - 50 * fiftyAmountToWithdraw;
    }

    private int withDrawAllFifties(int amount) {
        System.out.println("Банкомат выдал все купюры по 50 количеством: " + getFiftyBanknoteAmount());
        int amountAfterAllFifties = amount - getFiftyBanknoteSum();
        setFiftyBanknoteAmount(0);
        return amountAfterAllFifties;
    }

    private int withDrawTwenties(int amount) {
        int twentyAmountToWithdraw = amount / 20;
        System.out.println("Банкомат выдал купюры по 20 количеством: " + twentyAmountToWithdraw);
        setTwentyBanknoteAmount(getTwentyBanknoteAmount() - twentyAmountToWithdraw);
        return amount - 20 * twentyAmountToWithdraw;
    }

    private int withDrawAllTwenties(int amount) {
        System.out.println("Банкомат выдал все купюры по 20 количеством: " + getTenBanknoteAmount());
        int amountAfterAllTwenties = amount - getTwentyBanknoteSum();
        setTwentyBanknoteAmount(0);
        return amountAfterAllTwenties;
    }

    private void withDrawTens(int amount) {
        int tenAmountToWithdraw = amount / 10;
        System.out.println("Банкомат выдал купюры по 10 количеством: " + tenAmountToWithdraw);
        setTenBanknoteAmount(getTenBanknoteAmount() - tenAmountToWithdraw);
    }

    private void withDrawAllMoney() {
        System.out.println("Банкомат выдает всю сумму!");
        System.out.println("Банкомат выдал купюры по 50 количеством: " + getFiftyBanknoteAmount());
        System.out.println("Банкомат выдал купюры по 20 количеством: " + getTwentyBanknoteAmount());
        System.out.println("Банкомат выдал купюры по 10 количеством: " + getTenBanknoteAmount());
        setFiftyBanknoteAmount(0);
        setTwentyBanknoteAmount(0);
        setTenBanknoteAmount(0);
    }

    private boolean isEnoughMoneyInATM(int amount) {
        int allMoneyInATM = calculateAllMoneyInATM();
        printInfoAboutMoneyInATM(allMoneyInATM);
        return amount <= allMoneyInATM;
    }

    private void printInfoAboutMoneyInATM(int allMoney) {
        System.out.println("Сумма в банкомате: " + allMoney);
        System.out.println("Количество купюр по 50: " + getFiftyBanknoteAmount());
        System.out.println("Количество купюр по 20: " + getTwentyBanknoteAmount());
        System.out.println("Количество купюр по 10: " + getTenBanknoteAmount());
        System.out.println();
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
