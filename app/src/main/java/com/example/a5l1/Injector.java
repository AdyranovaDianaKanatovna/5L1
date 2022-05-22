package com.example.a5l1;

import com.example.a5l1.model.CounterModel;
import com.example.a5l1.presenter.CounterPresenter;

public class Injector {
    public static CounterPresenter getCounter(){

        return new CounterPresenter();
    }
    public static CounterModel counterModel(){
        return new CounterModel();
    }
}
