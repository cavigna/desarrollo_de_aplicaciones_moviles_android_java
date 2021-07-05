package com.example.db_room;



import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.db_room.Interfaces.UserDao;

@Database(entities = {User.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UserDao userDao();
}