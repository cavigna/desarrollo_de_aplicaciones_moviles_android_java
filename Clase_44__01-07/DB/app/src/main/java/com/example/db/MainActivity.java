package com.example.db;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private EditText edCodigo, edNombre, edPrecio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getSupportActionBar().hide();
        //AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        edCodigo = findViewById(R.id.codigo);
        edNombre = findViewById(R.id.nombre);
        edPrecio = findViewById(R.id.precio);


    }

    public void limpiar() {
        /* para no repetir tantas veces lo mismo */
        edCodigo.getText().clear();
        edNombre.getText().clear();
        edPrecio.getText().clear();
    }


    public void crear(View view) {
        AdminDB admin = new AdminDB(this, "producto", null, 1);
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

    public void buscar(View view) {
        AdminDB admin = new AdminDB(this, "producto", null, 1);
        SQLiteDatabase base = admin.getWritableDatabase();

        String codigo = edCodigo.getText().toString();

        if (!codigo.isEmpty()) {
            Cursor fila = base.rawQuery("select nombre, precio from  producto where codigo=" + codigo, null);
            if (fila.moveToFirst()) {
                edNombre.setText(fila.getString(0));
                edPrecio.setText(fila.getString(1));
                base.close();
            } else {
                Toast.makeText(this, "No está", Toast.LENGTH_LONG).show();

            }

        } else {
            Toast.makeText(this, "Ingresa el código, gil",
                    Toast.LENGTH_LONG).show();
        }

    }

    public void actualizar(View view) {
        //Snackbar.make(view,"Todavía no esta implementado", Snackbar.LENGTH_SHORT).show();
        AdminDB admin = new AdminDB(this, "producto", null, 1);
        SQLiteDatabase base = admin.getWritableDatabase();

        String codigo = edCodigo.getText().toString();
        String nombre = edNombre.getText().toString();
        String precio = edPrecio.getText().toString();


        if (!codigo.isEmpty() && !nombre.isEmpty() && !precio.isEmpty()) {
            ContentValues modificar = new ContentValues();
            modificar.put("codigo", codigo);
            modificar.put("nombre", nombre);
            modificar.put("precio", precio);
            base.update("producto", modificar, "codigo=" + codigo, null);
            limpiar();
            base.close();
            Snackbar.make(view, "El registro fue modificado!", Snackbar.LENGTH_SHORT).show();

        } else {
            Toast.makeText(this, "Faltan Data papá!", Toast.LENGTH_LONG).show();

        }



    }

    public void eliminar(View view) {

        AdminDB admin = new AdminDB(this, "producto", null, 1);

        SQLiteDatabase base = admin.getWritableDatabase();

        String codigo = edCodigo.getText().toString();

        if (!codigo.isEmpty()) {

            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Estás a punto de borrar un registro!");
            builder.setMessage("Estás Seguro que querés eliminar esto?");
            builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {

                public void onClick(DialogInterface dialog, int which) {
                    base.delete("producto", "codigo=" + codigo, null);
                    limpiar();
                    base.close();


                    dialog.dismiss();
                }
            });


            builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    // I do not need any action here you might
                    dialog.dismiss();
                }
            });

            AlertDialog alert = builder.create();
            alert.show();

        } else {
            Toast.makeText(this, "Faltan Data papá!", Toast.LENGTH_LONG).show();
        }
    }



}
//  Toast.makeText(this,
//                            "Registro borrado",
//                            Toast.LENGTH_LONG).show();
