package com.example.kidsapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class PantallaPrincipal extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_principal);

    }


    public void numeros(View view) {
        Intent numeros = new Intent(this, com.example.kidsapp.numeros.class);
        startActivity(numeros);
    }

    public void vocales(View view) {
        Intent vocales = new Intent(this, com.example.kidsapp.vocales.class);
        startActivity(vocales);
    }

    public void colores(View view) {
        Intent colores = new Intent(this, com.example.kidsapp.colores.class);
        startActivity(colores);
    }

    public void verduras(View view) {
        Intent verduras = new Intent(this, com.example.kidsapp.verduras.class);
        startActivity(verduras);
    }

    public void animales(View view) {
        Intent animales = new Intent(this, com.example.kidsapp.Animales.class);
        startActivity(animales);
    }

    public void abc(View view) {
        Intent abc = new Intent(this, com.example.kidsapp.abcdario.class);
        startActivity(abc);
    }

    public void frutas(View view) {
        Intent frutas = new Intent(this, com.example.kidsapp.frutas.class);
        startActivity(frutas);
    }
}

