package com.windz.study.test;

abstract public class Employee implements Payable {
    @Override
    public void pay() {
        System.out.println("Employee付钱");
    }
}
