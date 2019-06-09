package com.example.kidsapp;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void frutas(View view) {
        Intent uno= new Intent (this,frutas.class);
        startActivity(uno);
    }

    public void verduras(View view) {
        Intent uno= new Intent (this,verduras.class);
        startActivity(uno);
    }


    }

