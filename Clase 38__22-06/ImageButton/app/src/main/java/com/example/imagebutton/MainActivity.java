package com.example.imagebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText n1, n2;
    private TextView resultado, operacion;
    private int valorUno, valorDos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = findViewById(R.id.num1);
        n2 = findViewById(R.id.num2);
        resultado = findViewById(R.id.textView4);
        operacion = findViewById(R.id.textView5);


    }

    @SuppressLint("SetTextI18n")
    public void sumar(View v) {
        valorUno = Integer.parseInt(n1.getText().toString());
        valorDos = Integer.parseInt(n2.getText().toString());
        String string1 = n1.getText().toString();
        String string2 = n2.getText().toString();
        resultado.setText(Integer.toString(valorUno + valorDos));
        operacion.setText(string1 + " + " + string2);
    }
    public void restar(View v) {
        valorUno = Integer.parseInt(n1.getText().toString());
        valorDos = Integer.parseInt(n2.getText().toString());
        String string1 = n1.getText().toString();
        String string2 = n2.getText().toString();
        operacion.setText(string1 + " - " + string2);
        resultado.setText(Integer.toString(valorUno - valorDos));
    }
    public void multiplicar(View v) {
        valorUno = Integer.parseInt(n1.getText().toString());
        valorDos = Integer.parseInt(n2.getText().toString());
        String string1 = n1.getText().toString();
        String string2 = n2.getText().toString();
        operacion.setText(string1 + " * " + string2);
        resultado.setText(Integer.toString(valorUno * valorDos));
    }

    public void dividir(View v) {
        valorUno = Integer.parseInt(n1.getText().toString());
        valorDos = Integer.parseInt(n2.getText().toString());
        String string1 = n1.getText().toString();
        String string2 = n2.getText().toString();
        operacion.setText(string1 + " / " + string2);
        resultado.setText(Integer.toString(valorUno / valorDos));
    }




}


