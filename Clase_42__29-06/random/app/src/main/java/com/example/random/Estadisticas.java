package com.example.random;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Estadisticas extends AppCompatActivity {
    private ArrayList<String> listado = new ArrayList<>();
    private ArrayList<Integer> frecuencia = new ArrayList<>();
    private TextView maxNum, cantMaxNum, minNum, cantMinNum, tiradas;


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estadisticas);

        listado = getIntent().getStringArrayListExtra("listado");

        maxNum = findViewById(R.id.textView10);
        cantMaxNum = findViewById(R.id.textView11);
        minNum = findViewById(R.id.textView14);
        cantMinNum = findViewById(R.id.textView15);
        tiradas = findViewById(R.id.textView17);

        frecuencia.add(Collections.frequency(listado,"2"));
        frecuencia.add(Collections.frequency(listado,"3"));
        frecuencia.add(Collections.frequency(listado,"4"));
        frecuencia.add(Collections.frequency(listado,"5"));
        frecuencia.add(Collections.frequency(listado,"6"));
        frecuencia.add(Collections.frequency(listado,"7"));
        frecuencia.add(Collections.frequency(listado,"8"));
        frecuencia.add(Collections.frequency(listado,"9"));
        frecuencia.add(Collections.frequency(listado,"10"));
        frecuencia.add(Collections.frequency(listado,"11"));
        frecuencia.add(Collections.frequency(listado,"12"));
        Integer maxValue = Collections.max(frecuencia);
        int maxId =  frecuencia.indexOf(maxValue)+2;

        Integer minValue = Collections.min(frecuencia);
        int minId =  frecuencia.indexOf(minValue)+2;

        cantMaxNum.setText(Integer.toString(maxValue));
        maxNum.setText(Integer.toString(maxId));

        minNum.setText(Integer.toString(minId));
        cantMinNum.setText(Integer.toString(minValue));

        tiradas.setText(Integer.toString(listado.size()));

    }




}

