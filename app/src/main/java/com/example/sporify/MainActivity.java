package com.example.sporify;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    AdminSQL conexion;
    SQLiteDatabase BaseDatos;
    private Button login;
    private Button registro;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        conexion=new AdminSQL(this, "reproductor", null, 1);
        BaseDatos = conexion.getWritableDatabase();

        login=findViewById(R.id.btLogin);
        registro=findViewById(R.id.btRegistrar);
        registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityRegistro();
            }
        });
    }
    public void ActivityRegistro(){
        Intent registro= new Intent(this, Registro.class);
        startActivity(registro);
    }

}