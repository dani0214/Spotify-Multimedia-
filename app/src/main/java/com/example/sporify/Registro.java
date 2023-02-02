package com.example.sporify;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registro extends AppCompatActivity {

    AdminSQL conexion;
    SQLiteDatabase BaseDatos;
    private Button volver;

    TextView textNombre;
    TextView textPassw;
    TextView textConfirmarPassw;
    TextView textEdad;
    TextView textSexo;
    TextView textEmail;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        conexion=new AdminSQL(this, "reproductor", null, 1);
        BaseDatos = conexion.getWritableDatabase();

        textNombre=findViewById(R.id.textNombre);
        textPassw=findViewById(R.id.textPassw);
        textConfirmarPassw=findViewById(R.id.textConfirmarPassw);
        textEdad=findViewById(R.id.textEdad);
        textEmail=findViewById(R.id.textEmail);
        //textSexo;
        volver=findViewById(R.id.btVolver);
    }

    public boolean validarForm() {
        boolean hayError = false;
        Pattern regexEmail=Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher matcherEmail=regexEmail.matcher(textEmail.getText().toString());



        return hayError;
    }

}