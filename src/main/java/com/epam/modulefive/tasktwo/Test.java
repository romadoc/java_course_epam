package com.epam.modulefive.tasktwo;

public class Test {
    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.buyGoods("milk", 200);
        payment.buyGoods("meat", 400);
        payment.askToPrintCheck();

    }
}
