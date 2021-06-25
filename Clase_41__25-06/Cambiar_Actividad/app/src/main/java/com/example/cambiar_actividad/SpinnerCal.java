package com.example.cambiar_actividad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class SpinnerCal extends AppCompatActivity {
    private TextView resultado, operador;
    private EditText num1, num2;
    private android.widget.Spinner spinner;
    private String[] operaciones = {"Sumar", "Restar", "Multiplicar", "Dividir"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sipnner);

        resultado = findViewById(R.id.resultado);
        operador = findViewById(R.id.operador);

        num1 = findViewById(R.id.numeroUno);
        num2 = findViewById(R.id.numeroDos);

        spinner = findViewById(R.id.spinner);
        ArrayAdapter<String> adaptador = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, operaciones);
        spinner.setAdapter(adaptador);
    }

    public void calculo(View view) {
        double n1 = Double.parseDouble(num1.getText().toString());
        double n2 = Double.parseDouble(num2.getText().toString());
        double res;
        String op = spinner.getSelectedItem().toString();

        if (op.equals("Sumar")) {
            res = n1 + n2;
            operador.setText(" + ");
            resultado.setText(Double.toString(res));
        } else if (op.equals("Restar")) {
            res = n1 - n2;
            operador.setText(" - ");
            resultado.setText(Double.toString(res));
        } else if (op.equals("Multiplicar")) {
            res = n1 * n2;
            operador.setText(" * ");
            resultado.setText(Double.toString(res));
        } else if (op.equals("Dividir")) {
            res = n2 != 0 ? (n1 / n2) : 0;
            operador.setText(" / ");
            resultado.setText(Double.toString(res));
        }

    }

    public void back(View view) {
        Intent volver = new Intent(this, MainActivity.class);
        startActivity(volver);
    }
}