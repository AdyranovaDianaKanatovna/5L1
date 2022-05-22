package com.example.a5l1.view;

public class CounterContracts {
    public interface CounterView{
        void updateText(int count);
       void seeToast(int toastNumber);
        void colorText(int colorNumber);
    }
    public interface CounterPresenter{
        void increment();
        void decrement();
        void attachCounterView(CounterView view);
    }
}
