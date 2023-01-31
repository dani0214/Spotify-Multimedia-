package com.example.sporify;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class AdminSQL extends SQLiteOpenHelper {


    public AdminSQL(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase agendaDB) {
        agendaDB.execSQL("CREATE TABLE IF NOT EXISTS cancion(id int PRIMARY KEY, titulo TEXT, artista TEXT, genero TEXT)");
        agendaDB.execSQL("CREATE TABLE IF NOT EXISTS usuarios(id int PRIMARY KEY, nombre TEXT, passw TEXTS, sexo TEXT, nacimiento TEXT, foto TEXT)");
        agendaDB.execSQL("CREATE TABLE IF NOT EXISTS usuario_cancion(id int PRIMARY KEY, usuario TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}
