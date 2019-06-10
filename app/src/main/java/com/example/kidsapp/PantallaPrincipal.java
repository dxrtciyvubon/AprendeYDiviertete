package com.example.kidsapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class PantallaPrincipal extends AppCompatActivity {

    ImageButton siguiente1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_principal);

        siguiente1 = (ImageButton)findViewById(R.id.boton6);
        siguiente1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent siguiente = new Intent(PantallaPrincipal.this, Animales.class)   ;

                startActivity(siguiente);
            }
        });
    }
}

