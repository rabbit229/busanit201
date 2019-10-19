package com.bnsys.todosample.logic.local;

import androidx.room.RoomDatabase;

public abstract class AppDatabase extends RoomDatabase {

    public abstract UserDao getUserDao();
}
