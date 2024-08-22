package com.windz.study.test;

abstract public class Contractor implements Payable {
    @Override
    public void pay() {
        System.out.println("Contractor付钱");
    }
}
