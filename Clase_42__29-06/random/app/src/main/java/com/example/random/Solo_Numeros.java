package com.example.random;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Solo_Numeros extends AppCompatActivity {
    private TextView res, ultimosN;
    private int n;
    private Random random = new Random();
    private StringBuffer stringNum = new StringBuffer();
    public static ArrayList<String> listaNumeros = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solo_numeros);

        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}

        res = findViewById(R.id.textView);
        ultimosN = findViewById(R.id.ultimosN);
    }

    public void tirar(View view) {
        n = random.nextInt(11) + 2;
        String numCadena = Integer.toString(n);

        res.setText(numCadena);
        listaNumeros.add(numCadena);
        ultimosN.setText(arrayToString(listaNumeros));


    }

    public String arrayToString(ArrayList<String> listado) {
        for (String s : listado) {
            stringNum.append(s).append(" | ");
        }
        return stringNum.length() > 22 ?
                stringNum.toString().substring(stringNum.length() - 19) :
                stringNum.toString();

    }

    public void haciaEstadistica(View view){
        Intent intent = new Intent(this, Estadisticas.class);
        intent.putStringArrayListExtra("listado", listaNumeros);
        startActivity(intent);
    }


}

//package com.example.random;
//
//        import androidx.appcompat.app.AppCompatActivity;
//
//        import android.os.Bundle;
//        import android.view.View;
//        import android.widget.TextView;
//
//        import java.lang.reflect.Array;
//        import java.util.ArrayList;
//        import java.util.Random;
//
//public class Solo_Numeros extends AppCompatActivity {
//    private TextView res, ultimosN;
//    private int n;
//    private Random random = new Random();
//    private StringBuffer listaNum = new StringBuffer();
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_solo_numeros);
//        res = findViewById(R.id.textView);
//        ultimosN = findViewById(R.id.ultimosN);
//    }
//
//    public void tirar(View view) {
//        n = random.nextInt(11) + 2;
//        String numCadena = Integer.toString(n);
//
//        listaNum.append(numCadena);
//        listaNum.append(" ");
//        String prueba = last10(listaNum) ?
//                listaNum.toString().substring(listaNum.length() - 19) : listaNum.toString();
//        ultimosN.setText(prueba);
//        res.setText(numCadena);
//
//    }
//
//    private boolean last10(StringBuffer buffer) {
//        return buffer.length() > 21;
//    }
//
//
//}