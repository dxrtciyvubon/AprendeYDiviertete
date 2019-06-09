package com.example.kidsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class colores extends AppCompatActivity {

    private ImageView visor;
    private ImageButton am,na,ro,rj,ne,ve,bl,ca,az,gri,mo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colores);

        visor=(ImageView) findViewById(R.id.visor);
        am=(ImageButton)findViewById(R.id.amarillo);
        az=(ImageButton)findViewById(R.id.azul);
        rj=(ImageButton)findViewById(R.id.rojo);
        ro=(ImageButton)findViewById(R.id.rosado);
        ve=(ImageButton)findViewById(R.id.verde);
        bl=(ImageButton)findViewById(R.id.blanco);
        ne=(ImageButton)findViewById(R.id.negro);
        mo=(ImageButton)findViewById(R.id.morado);
        gri=(ImageButton)findViewById(R.id.gris);
        na=(ImageButton)findViewById(R.id.naranja);
        ca=(ImageButton)findViewById(R.id.cafe);
    }

    public  void play1 (View view) { visor.setImageResource(R.drawable.tres);}
    public  void play2 (View view) { visor.setImageResource(R.drawable.azulito);}
    public  void play3 (View view)
    {
        visor.setImageResource(R.drawable.siete);
    }
    public  void play4 (View view) { visor.setImageResource(R.drawable.roJo); }
    public  void play5 (View view) { visor.setImageResource(R.drawable.roSa); }
    public  void play6 (View view)
    {
        visor.setImageResource(R.drawable.seis);
    }
    public  void play7 (View view)
    {
        visor.setImageResource(R.drawable.nueve);
    }
    public  void play8 (View view)
    {
        visor.setImageResource(R.drawable.ocho);
    }
    public  void play9 (View view)
    {
        visor.setImageResource(R.drawable.diez);
    }
    public  void play10 (View view)
    {
        visor.setImageResource(R.drawable.cinco);
    }
    public  void play11(View view){visor.setImageResource(R.drawable.negro);
    }
}
