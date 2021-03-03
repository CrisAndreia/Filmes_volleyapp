package com.crispereira.volleyapp.database;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.crispereira.volleyapp.database.Filme;
import com.crispereira.volleyapp.database.FilmeDAO;

@Database(entities = {Filme.class}, version = 1, exportSchema = false)

public abstract class MyDb extends RoomDatabase {
    public abstract FilmeDAO getFilmeDAO();
}