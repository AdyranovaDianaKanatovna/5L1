package com.example.a5l1.presenter;

import com.example.a5l1.model.CounterModel;
import com.example.a5l1.view.CounterContracts;

public class CounterPresenter implements CounterContracts.CounterPresenter {
    CounterModel counterModel = new CounterModel();
    CounterContracts.CounterView counterView;

    @Override
    public void increment() {
        counterModel.increment();
        counterView.updateText(counterModel.getCount());
        if (counterModel.getCount()== counterModel.getToastNumber()){
            counterView.seeToast(counterModel.getToastNumber());
        }
        if (counterModel.getCount()== counterModel.getColorNumber()){
            counterView.colorText(counterModel.getColorNumber());
        }
       }


    @Override
    public void decrement() {
        counterModel.decrement();
        counterView.updateText(counterModel.getCount());
        if (counterModel.getCount()== counterModel.getColorNumber()){
            counterView.seeToast(counterModel.getToastNumber());
        }
        if (counterModel.getCount()==counterModel.getColorNumber()){
            counterView.colorText(counterModel.getColorNumber());
        }

    }
    
    @Override
    public void attachCounterView(CounterContracts.CounterView view) {
        counterView = view;
    }
}
