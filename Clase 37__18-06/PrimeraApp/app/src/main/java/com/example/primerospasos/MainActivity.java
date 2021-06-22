package com.example.primerospasos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mostrarMensaje(View v){
        Toast.makeText(this, "Pinchila", Toast.LENGTH_LONG).show();
    }

    public void mensajeElBoton(){
        Toast.makeText(this, "aprestaste EL botón", Toast.LENGTH_LONG).show();
    }
}