package com.example.cambiar_actividad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void next(View view){
        Intent calculadoraSwitch = new Intent(this, Switch.class);
        startActivity(calculadoraSwitch);
    }

    public void spinnerCal(View view){
        Intent calculadoraSpinner = new Intent(this, SpinnerCal.class);
        startActivity(calculadoraSpinner);
    }
}