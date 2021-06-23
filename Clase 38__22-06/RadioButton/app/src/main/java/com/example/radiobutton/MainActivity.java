package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText valor1, valor2;
    private RadioButton suma, resta, mult, div;
    private TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valor1 = findViewById(R.id.inputUno);
        valor2 = findViewById(R.id.inputDos);
        suma = findViewById(R.id.suma);
        resta = findViewById(R.id.resta);
        mult = findViewById(R.id.multip);
        div = findViewById(R.id.division);
        resultado = findViewById(R.id.textView);

    }

    public void calcular(View v) {
        int n1 = Integer.parseInt(valor1.getText().toString());
        int n2 = Integer.parseInt(valor2.getText().toString());

        if (suma.isChecked()) {
            resultado.setText(Integer.toString(n1 + n2));
            resultado.setTextColor((n1+n2)>0? Color.GREEN:Color.RED);

        } else if (resta.isChecked()) {
            resultado.setText(Integer.toString(n1 - n2));
            resultado.setTextColor((n1-n2)>0? Color.GREEN:Color.RED);
        } else if (mult.isChecked()) {
            resultado.setText(Integer.toString(n1 * n2));
            resultado.setTextColor(Color.BLACK);
        }else if(div.isChecked()){
            resultado.setText(Integer.toString((n2 != 0) ? (n1 / n2) : 0));

        }
    }
}