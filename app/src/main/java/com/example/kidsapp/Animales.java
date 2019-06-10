package com.example.kidsapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Animales extends AppCompatActivity {


    
    private ImageView fondo;
    private ImageButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19, btn20;
    MediaPlayer mp, son1, son2, son3, son4, son5, son6, son7, son8, son9, son10, son11, son12, son13, son14, son15, son16, son17, son18, son19 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animales);
        setUpActionBar();

            fondo = (ImageView) findViewById(R.id.img);
            btn1 = (ImageButton) findViewById(R.id.boton1);
            mp = MediaPlayer.create(this, R.raw.caballo);

            btn2 = (ImageButton) findViewById(R.id.boton10);
            son1 = MediaPlayer.create(this, R.raw.gato);

            btn3 = (ImageButton) findViewById(R.id.boton3);
            son2 = MediaPlayer.create(this, R.raw.cochino);

            btn4 = (ImageButton) findViewById(R.id.boton5);
            son3 = MediaPlayer.create(this, R.raw.vaca);

            btn5 = (ImageButton) findViewById(R.id.boton7);
            son4 = MediaPlayer.create(this, R.raw.borrego);

            btn6 = (ImageButton) findViewById(R.id.boton9);
            son5 = MediaPlayer.create(this, R.raw.loro);

            btn7 = (ImageButton) findViewById(R.id.boton2);
            son6 = MediaPlayer.create(this, R.raw.pollito);

            btn8 = (ImageButton) findViewById(R.id.boton8);
            son7 = MediaPlayer.create(this, R.raw.tortuga);

            btn9 = (ImageButton) findViewById(R.id.boton4);
            son8 = MediaPlayer.create(this, R.raw.pato);

            btn10 = (ImageButton) findViewById(R.id.boton16);
            son9 = MediaPlayer.create(this, R.raw.osopanda);

            btn11 = (ImageButton) findViewById(R.id.boton6);
            son10 = MediaPlayer.create(this, R.raw.perro);

            btn12 = (ImageButton) findViewById(R.id.boton14);
            son11 = MediaPlayer.create(this, R.raw.oso);

            btn13 = (ImageButton) findViewById(R.id.boton15);
            son12 = MediaPlayer.create(this, R.raw.leon);

          btn14 = (ImageButton) findViewById(R.id.boton17);
            son13 = MediaPlayer.create(this, R.raw.serpiente);

            btn15 = (ImageButton) findViewById(R.id.boton18);
            son14 = MediaPlayer.create(this, R.raw.mono);

            btn16 = (ImageButton) findViewById(R.id.boton20);
            son15 = MediaPlayer.create(this, R.raw.jirafa);

            btn17 = (ImageButton) findViewById(R.id.boton19);
            son16 = MediaPlayer.create(this, R.raw.tigre);

            btn18 = (ImageButton) findViewById(R.id.boton13);
            son17 = MediaPlayer.create(this, R.raw.ardilla);

            btn19 = (ImageButton) findViewById(R.id.boton12);
            son18 = MediaPlayer.create(this, R.raw.zorro);

            btn20 = (ImageButton) findViewById(R.id.boton11);
            son19 = MediaPlayer.create(this, R.raw.cocodrilo);


            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mp.start();
                    fondo.setImageResource(R.drawable.caballo);
                }
            });

            btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                son1.start();
                fondo.setImageResource(R.drawable.gato);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                son2.start();
                fondo.setImageResource(R.drawable.cochino);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                son3.start();
                fondo.setImageResource(R.drawable.vaca);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                son4.start();
                fondo.setImageResource(R.drawable.cordero);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                son5.start();
                fondo.setImageResource(R.drawable.loro);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                son6.start();
                fondo.setImageResource(R.drawable.pollito);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                son7.start();
                fondo.setImageResource(R.drawable.tortuga);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                son8.start();
                fondo.setImageResource(R.drawable.pato);
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                son9.start();
                fondo.setImageResource(R.drawable.osopanda);
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                son10.start();
                fondo.setImageResource(R.drawable.perro);
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                son11.start();
                fondo.setImageResource(R.drawable.oso);
            }
        });
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                son12.start();
                fondo.setImageResource(R.drawable.leon);
            }
        });
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                son13.start();
                fondo.setImageResource(R.drawable.serpiente);
            }
        });
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                son14.start();
                fondo.setImageResource(R.drawable.mono);
            }
        });
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                son15.start();
                fondo.setImageResource(R.drawable.jirafa);
            }
        });

        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                son16.start();
                fondo.setImageResource(R.drawable.tigre);
            }
        });
        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                son17.start();
                fondo.setImageResource(R.drawable.ardilla);
            }
        });
        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                son18.start();
                fondo.setImageResource(R.drawable.zorro);
            }
        });
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                son19.start();
                fondo.setImageResource(R.drawable.cocdrilo);
            }
        });
        }
        public void click(View view){
        fondo.setImageResource(R.drawable.caballo);
        fondo.setImageResource(R.drawable.gato);
        fondo.setImageResource(R.drawable.cochino);
        fondo.setImageResource(R.drawable.vaca);
        fondo.setImageResource(R.drawable.cordero);
        fondo.setImageResource(R.drawable.loro);
        fondo.setImageResource(R.drawable.pollito);
        fondo.setImageResource(R.drawable.tortuga);
        fondo.setImageResource(R.drawable.pato);
        fondo.setImageResource(R.drawable.osopanda);
        fondo.setImageResource(R.drawable.perro);
        fondo.setImageResource(R.drawable.oso);
        fondo.setImageResource(R.drawable.leon);
        fondo.setImageResource(R.drawable.serpiente);
        fondo.setImageResource(R.drawable.mono);
        fondo.setImageResource(R.drawable.jirafa);
        fondo.setImageResource(R.drawable.tigre);
        fondo.setImageResource(R.drawable.ardilla);
        fondo.setImageResource(R.drawable.zorro);
        }
        private void setUpActionBar(){
            ActionBar actionBar= getSupportActionBar();
            if(actionBar !=null){
                actionBar.setDisplayHomeAsUpEnabled(true);
                actionBar.setTitle("Animales");
            }
        }
    }