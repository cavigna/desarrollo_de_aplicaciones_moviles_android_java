package com.example.cambiar_actividad;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.text.DecimalFormat;

public class Switch extends AppCompatActivity {
    private EditText num1, num2;
    private TextView operador, resultado;
    private android.widget.Switch suma, resta, mult, div;
    private double n1,n2, resul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch);

        num1 = (EditText) findViewById(R.id.numeroUno);
        num2 = (EditText) findViewById(R.id.numeroDos);

        operador = (TextView) findViewById(R.id.operador);
        resultado = (TextView) findViewById(R.id.resultado);

        suma = (android.widget.Switch) findViewById(R.id.suma);
        resta = (android.widget.Switch) findViewById(R.id.resta);
        mult = (android.widget.Switch) findViewById(R.id.multi);
        div = (android.widget.Switch) findViewById(R.id.division);
    }


    @SuppressLint("SetTextI18n")
    public void sumar(View view){
        n1 = Double.parseDouble(num1.getText().toString());
        n2 = Double.parseDouble(num2.getText().toString());
        resul = n1+n2;
        operador.setText(" + ");
        resultado.setText(Double.toString(resul));
    }

    public void restar(View view){
        n1 = Double.parseDouble(num1.getText().toString());
        n2 = Double.parseDouble(num2.getText().toString());
        resul = n1-n2;
        operador.setText(" - ");
        resultado.setText(Double.toString(resul));
    }

    public void multiplicar(View view){
        n1 = Double.parseDouble(num1.getText().toString());
        n2 = Double.parseDouble(num2.getText().toString());
        resul = n1*n2;
        operador.setText(" * ");
        resultado.setText(Double.toString(resul));
    }

    public void dividir(View view){
        DecimalFormat format = new DecimalFormat("#.####");
        n1 = Double.parseDouble(num1.getText().toString());
        n2 = Double.parseDouble(num2.getText().toString());
        resul = (n1/n2);
        operador.setText(" / ");
        resultado.setText((format.format(resul)));
    }

    public void back(View view){
        Intent volver = new Intent(this, MainActivity.class);
        startActivity(volver);
    }





}