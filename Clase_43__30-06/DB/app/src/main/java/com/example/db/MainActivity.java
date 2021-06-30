package com.example.db;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edCodigo, edNombre, edPrecio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edCodigo = findViewById(R.id.codigo);
        edNombre = findViewById(R.id.nombre);
        edPrecio = findViewById(R.id.precio);
    }


    public void crear(View view) {
        AdminDB admin = new AdminDB(this, "Productos", null, 1);
        SQLiteDatabase base = admin.getWritableDatabase();

        String codigo = edCodigo.getText().toString();
        String nombre = edNombre.getText().toString();
        String precio = edPrecio.getText().toString();

        if (!codigo.isEmpty() && !nombre.isEmpty() && !precio.isEmpty()) {
            ContentValues crear = new ContentValues();
            crear.put("codigo", codigo);
            crear.put("nombre", nombre);
            crear.put("precio", precio);
            base.insert("producto", null, crear);
            base.close();
            edCodigo.getText().clear();
            edNombre.getText().clear();
            edPrecio.getText().clear();

            Toast.makeText(this, "producto creado", Toast.LENGTH_LONG).show();

        } else {
            Toast.makeText(this, "Completa todo!! Vago",
                    Toast.LENGTH_LONG).show();
        }
    }
}

///