package com.company;
import java.io.*;
public abstract class abstructClassplan {

    protected double rate;
    abstract void getRate();

    public void calculateBill(int units){
        System.out.println(units*rate);
    }
}

