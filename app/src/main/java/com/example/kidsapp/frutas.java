package com.example.kidsapp;

import android.media.MediaPlayer;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class frutas extends AppCompatActivity {

    private ImageView fondo;
    private ImageButton uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, diez, once, doce, trece;
    MediaPlayer sonidouno, sonidodos, sonidotres, sonidocuatro, sonidocinco, sonidoseis, sonidosiete, sonidoocho, sonidonueve,
            sonidodiez, sonidoonce, sonidodoce, sonidotrece;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frutas);
        setUpActionBar();


        fondo = (ImageView) findViewById(R.id.fondo);
        uno = (ImageButton) findViewById(R.id.uno);
        dos = (ImageButton) findViewById(R.id.dos);
        tres = (ImageButton) findViewById(R.id.tres);
        cuatro = (ImageButton) findViewById(R.id.cuatro);
        cinco = (ImageButton) findViewById(R.id.cinco);
        seis = (ImageButton) findViewById(R.id.seis);
        siete = (ImageButton) findViewById(R.id.siete);
        ocho = (ImageButton) findViewById(R.id.ocho);
        nueve = (ImageButton) findViewById(R.id.nueve);
        diez = (ImageButton) findViewById(R.id.diez);
        once = (ImageButton) findViewById(R.id.once);
        doce = (ImageButton) findViewById(R.id.doce);
        trece = (ImageButton) findViewById(R.id.trece);

        sonidouno = MediaPlayer.create(this, R.raw.manzana);
        sonidodos = MediaPlayer.create(this, R.raw.kiwi);
        sonidotres = MediaPlayer.create(this, R.raw.fresa);
        sonidocuatro = MediaPlayer.create(this, R.raw.sandia);
        sonidocinco = MediaPlayer.create(this, R.raw.limon);
        sonidoseis = MediaPlayer.create(this, R.raw.aguacate);
        sonidosiete = MediaPlayer.create(this, R.raw.durazno);
        sonidoocho = MediaPlayer.create(this, R.raw.coco);
        sonidonueve = MediaPlayer.create(this, R.raw.pinia);
        sonidodiez = MediaPlayer.create(this, R.raw.cereza);
        sonidoonce = MediaPlayer.create(this, R.raw.uva);
        sonidodoce = MediaPlayer.create(this, R.raw.mango);
        sonidotrece = MediaPlayer.create(this, R.raw.platano);


        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidouno.start();
                fondo.setImageResource(R.drawable.manzana);
            }
        });
        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidodos.start();
                fondo.setImageResource(R.drawable.kiwi);
            }
        });
        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidotres.start();
                fondo.setImageResource(R.drawable.fresa);
            }
        });
        cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidocuatro.start();
                fondo.setImageResource(R.drawable.sandia);
            }
        });
        cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidocinco.start();
                fondo.setImageResource(R.drawable.limon);
            }
        });
        seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidoseis.start();
                fondo.setImageResource(R.drawable.aguacate);
            }
        });
        siete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidosiete.start();
                fondo.setImageResource(R.drawable.durazno);
            }
        });
        ocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidoocho.start();
                fondo.setImageResource(R.drawable.coco);
            }
        });
        nueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidonueve.start();
                fondo.setImageResource(R.drawable.pinia);
            }
        });
        diez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidodiez.start();
                fondo.setImageResource(R.drawable.cereza);
            }
        });
        once.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidoonce.start();
                fondo.setImageResource(R.drawable.uva);
            }
        });
        doce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidodoce.start();
                fondo.setImageResource(R.drawable.mango);
            }
        });
        trece.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidotrece.start();
                fondo.setImageResource(R.drawable.platano);
            }
        });

    }

    public void click(View view) {
        fondo.setImageResource(R.drawable.manzana);
        fondo.setImageResource(R.drawable.kiwi);
        fondo.setImageResource(R.drawable.fresa);
        fondo.setImageResource(R.drawable.sandia);
        fondo.setImageResource(R.drawable.limon);
        fondo.setImageResource(R.drawable.aguacate);
        fondo.setImageResource(R.drawable.durazno);
        fondo.setImageResource(R.drawable.coco);
        fondo.setImageResource(R.drawable.pinia);
        fondo.setImageResource(R.drawable.cereza);
        fondo.setImageResource(R.drawable.uva);
        fondo.setImageResource(R.drawable.mango);
        fondo.setImageResource(R.drawable.platano);

    }
    private void setUpActionBar(){
        ActionBar actionBar= getSupportActionBar();
        if(actionBar !=null){
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setTitle("Frutas");
        }
    }


}