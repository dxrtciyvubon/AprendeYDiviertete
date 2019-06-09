package com.example.kidsapp;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class verduras extends AppCompatActivity {

    private ImageView fondo;
    private ImageButton uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, diez, once, doce, trece;
    MediaPlayer sonidouno, sonidodos, sonidotres, sonidocuatro, sonidocinco, sonidoseis, sonidosiete, sonidoocho, sonidonueve,
            sonidodiez, sonidoonce, sonidodoce, sonidotrece;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verduras);

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
        sonidodos = MediaPlayer.create(this, R.raw.manzana);
        sonidotres = MediaPlayer.create(this, R.raw.manzana);
        sonidocuatro = MediaPlayer.create(this, R.raw.manzana);
        sonidocinco = MediaPlayer.create(this, R.raw.manzana);
        sonidoseis = MediaPlayer.create(this, R.raw.manzana);
        sonidosiete = MediaPlayer.create(this, R.raw.manzana);
        sonidoocho = MediaPlayer.create(this, R.raw.manzana);
        sonidonueve = MediaPlayer.create(this, R.raw.manzana);
        sonidodiez = MediaPlayer.create(this, R.raw.manzana);
        sonidoonce = MediaPlayer.create(this, R.raw.manzana);
        sonidodoce = MediaPlayer.create(this, R.raw.manzana);
        sonidotrece = MediaPlayer.create(this, R.raw.manzana);

        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidouno.start();
                fondo.setImageResource(R.drawable.brocoli);
            }
        });
        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidouno.start();
                fondo.setImageResource(R.drawable.cebolla2);
            }
        });
        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidouno.start();
                fondo.setImageResource(R.drawable.apio);
            }
        });
        cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidouno.start();
                fondo.setImageResource(R.drawable.champinion);
            }
        });
        cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidocinco.start();
                fondo.setImageResource(R.drawable.repollo);
            }
        });
        seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidoseis.start();
                fondo.setImageResource(R.drawable.chicharo);
            }
        });
        siete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidosiete.start();
                fondo.setImageResource(R.drawable.lechuga);
            }
        });
        ocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidoocho.start();
                fondo.setImageResource(R.drawable.elote);
            }
        });
        nueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidonueve.start();
                fondo.setImageResource(R.drawable.papa);
            }
        });
        diez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidodiez.start();
                fondo.setImageResource(R.drawable.pepino);
            }
        });
        once.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidoonce.start();
                fondo.setImageResource(R.drawable.pimiento);
            }
        });
        doce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidodoce.start();
                fondo.setImageResource(R.drawable.rabano);
            }
        });
        trece.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidotrece.start();
                fondo.setImageResource(R.drawable.tomate);
            }
        });

    }

    public void click(View view) {
        fondo.setImageResource(R.drawable.brocoli);
        fondo.setImageResource(R.drawable.cebolla2);
        fondo.setImageResource(R.drawable.apio);
        fondo.setImageResource(R.drawable.champinion);
        fondo.setImageResource(R.drawable.repollo);
        fondo.setImageResource(R.drawable.chicharo);
        fondo.setImageResource(R.drawable.lechuga);
        fondo.setImageResource(R.drawable.elote);
        fondo.setImageResource(R.drawable.papa);
        fondo.setImageResource(R.drawable.pepino);
        fondo.setImageResource(R.drawable.pimiento);
        fondo.setImageResource(R.drawable.rabano);
        fondo.setImageResource(R.drawable.tomate);

    }

    private void setUpActionBar() {
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setTitle("verduras");
        }

    }
}
