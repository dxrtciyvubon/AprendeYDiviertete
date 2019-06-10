package com.example.kidsapp;

import android.media.MediaPlayer;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class colores extends AppCompatActivity {

    MediaPlayer co1;
    MediaPlayer co2;
    MediaPlayer co3;
    MediaPlayer co4;
    MediaPlayer co5;
    MediaPlayer co6;
    MediaPlayer co7;
    MediaPlayer co8;
    MediaPlayer co9;
    MediaPlayer comm;
    MediaPlayer copp;

    private ImageView visor;
    private ImageButton am,na,ro,rj,ne,ve,bl,ca,az,gri,mo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colores);
        setUpActionBar();

        co1= MediaPlayer.create(this,R.raw.amarillo);
        co2= MediaPlayer.create(this,R.raw.azul);
        co3= MediaPlayer.create(this,R.raw.blanco);
        co4= MediaPlayer.create(this,R.raw.rojo);
        co5= MediaPlayer.create(this,R.raw.rosado);
        co6= MediaPlayer.create(this,R.raw.morado);
        co7= MediaPlayer.create(this,R.raw.verde);
        co8= MediaPlayer.create(this,R.raw.cafe);
        co9= MediaPlayer.create(this,R.raw.gris);
        comm= MediaPlayer.create(this,R.raw.anaranjado);
        copp= MediaPlayer.create(this,R.raw.negro);

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

    public  void play1 (View view) { visor.setImageResource(R.drawable.tres);
    co1.start();}

    public  void play2 (View view) { visor.setImageResource(R.drawable.azulito); co2.start();}
    public  void play3 (View view)
    {
        visor.setImageResource(R.drawable.siete);
        co3.start();
    }
    public  void play4 (View view) { visor.setImageResource(R.drawable.rojof);co4.start(); }
    public  void play5 (View view) { visor.setImageResource(R.drawable.rossa); co5.start(); }
    public  void play6 (View view)
    {
        visor.setImageResource(R.drawable.seis);
        co6.start();
    }
    public  void play7 (View view)
    {
        visor.setImageResource(R.drawable.nueve); co7.start();
    }
    public  void play8 (View view)
    {
        visor.setImageResource(R.drawable.ocho);
        co8.start();
    }
    public  void play9 (View view)
    {
        visor.setImageResource(R.drawable.diez);
        co9.start();
    }
    public  void play10 (View view)
    {
        visor.setImageResource(R.drawable.cinco);
        comm.start();
    }
    public  void play11(View view){visor.setImageResource(R.drawable.negro);
        copp.start();
    }
    private void setUpActionBar(){
        ActionBar actionBar= getSupportActionBar();
        if(actionBar !=null){
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setTitle("Colores");
        }
    }
}



