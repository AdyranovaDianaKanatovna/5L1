package com.example.a5l1.model;

public class CounterModel {
    public int toastNumber = 10;
    public int colorNumber = 15;

    public int getToastNumber() {
        return toastNumber;
    }

    public int getColorNumber() {
        return colorNumber;
    }

    public int count = 0;

    public void increment() {
        ++count;
    }

    public void decrement() {
        --count;
    }

    public int getCount() {
        return count;
    }
}
