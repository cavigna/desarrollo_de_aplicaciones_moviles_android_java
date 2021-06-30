package com.example.random;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}
    }

    public void numeros(View view) {
        Intent soloNum = new Intent(this, Solo_Numeros.class);
        startActivity(soloNum);
    }
}

//    public void next(View view){
//        Intent calculadoraSwitch = new Intent(this, Switch.class);
//        startActivity(calculadoraSwitch);
//    }