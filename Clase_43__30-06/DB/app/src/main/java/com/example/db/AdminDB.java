package com.example.db;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

public class AdminDB extends SQLiteOpenHelper {


    public AdminDB(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table producto(codigo int primary key, nombre varchar, precio int)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}


//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_admin_db);
//    }


//package com.example.basededatos; //esta clase es creada desde la carpeta que tiene las main activity (app/java/com.example.nombreproyecto), no desde app cpmp pasa con las activity
//
//        import android.content.Context;
//        import android.database.sqlite.SQLiteDatabase;
//        import android.database.sqlite.SQLiteOpenHelper; // <-- luego de crear la clase, hacer un import de esta clase
//
//        import androidx.annotation.Nullable;
//
//public class Admindb extends SQLiteOpenHelper {   //se crea una clase abstract, la cual he
//    clase Admindb
//package com.example.basededatos;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.content.ContentValues;
//import android.database.Cursor;
//import android.database.sqlite.SQLiteDatabase;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.EditText;
//import android.widget.TextView;
//import android.widget.Toast;//