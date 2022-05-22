package com.example.a5l1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.a5l1.databinding.ActivityMainBinding;
import com.example.a5l1.model.CounterModel;
import com.example.a5l1.presenter.CounterPresenter;
import com.example.a5l1.view.CounterContracts;

public class MainActivity extends AppCompatActivity implements CounterContracts.CounterView {
    ActivityMainBinding binding;
    CounterPresenter presenter;
    CounterModel counterModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        presenter = Injector.getCounter();
        presenter.attachCounterView(this);
        initClickers();
    }

    private void initClickers() {
        binding.incrementBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                presenter.increment();

            }
        });
        binding.decrementBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.decrement();
            }
        });
    }
   @Override
   public void seeToast(int toastNumber){
       Toast.makeText(this, "Congratulation", Toast.LENGTH_SHORT).show();
   }
   @Override
   public void colorText(int colorNumber){
        binding.counterTv.setTextColor(Color.GREEN);
   }




    @Override
    public void updateText(int count){
        binding.counterTv.setText(String.valueOf(count));
    }

}




