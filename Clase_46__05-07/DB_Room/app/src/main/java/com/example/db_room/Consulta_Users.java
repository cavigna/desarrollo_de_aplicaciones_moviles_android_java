package com.example.db_room;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.widget.Adapter;

public class Consulta_Users extends AppCompatActivity {
    Adapter db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consulta_users);

        // Instanciamos la base de datos
        //db = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "user").build();
    }
}