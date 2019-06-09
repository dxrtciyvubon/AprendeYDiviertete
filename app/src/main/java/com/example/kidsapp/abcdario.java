package com.example.kidsapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class abcdario extends AppCompatActivity {

    private ImageView fondo;
    private ImageButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18,btn19,btn20,btn21,btn22,btn23,btn24,btn25,btn26,btn27;
    MediaPlayer mp1,mp2,mp3,mp4,mp5,mp6,mp7,mp8,mp9,mp10,mp11,mp12,mp13,mp14,mp15,mp16,mp17,mp18,mp19,mp20,mp21,mp22,mp23,mp24,mp25,mp26,mp27;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abcdario);


        fondo=(ImageView) findViewById(R.id.imageView3);
        btn1=(ImageButton)findViewById(R.id.imbnum1);
        btn2=(ImageButton)findViewById(R.id.imbnum2);
        btn3=(ImageButton)findViewById(R.id.imbnum3);
        btn4=(ImageButton)findViewById(R.id.imbnum4);
        btn5=(ImageButton)findViewById(R.id.imbnum5);
        btn6=(ImageButton)findViewById(R.id.imbnum6);
        btn7=(ImageButton)findViewById(R.id.imbnum7);
        btn8=(ImageButton)findViewById(R.id.imbnum8);
        btn9=(ImageButton)findViewById(R.id.imbnum9);
        btn10=(ImageButton)findViewById(R.id.imbnum10);
        btn11=(ImageButton)findViewById(R.id.imbnum11);
        btn12=(ImageButton)findViewById(R.id.imbnum12);
        btn13=(ImageButton)findViewById(R.id.imbnum13);
        btn14=(ImageButton)findViewById(R.id.imbnum14);
        btn15=(ImageButton)findViewById(R.id.imbnum15);
        btn16=(ImageButton)findViewById(R.id.imbnum16);
        btn17=(ImageButton)findViewById(R.id.imbnum17);
        btn18=(ImageButton)findViewById(R.id.imbnum18);
        btn19=(ImageButton)findViewById(R.id.imbnum19);
        btn20=(ImageButton)findViewById(R.id.imbnum20);
        btn21=(ImageButton)findViewById(R.id.imbnum21);
        btn22=(ImageButton)findViewById(R.id.imbnum22);
        btn23=(ImageButton)findViewById(R.id.imbnum23);
        btn24=(ImageButton)findViewById(R.id.imbnum24);
        btn25=(ImageButton)findViewById(R.id.imbnum25);
        btn26=(ImageButton)findViewById(R.id.imbnum26);
        btn27=(ImageButton)findViewById(R.id.imbnum27);




        mp1=MediaPlayer.create(this,R.raw.count);
        mp2=MediaPlayer.create(this,R.raw.count);
        mp3=MediaPlayer.create(this,R.raw.count);
        mp4=MediaPlayer.create(this,R.raw.count);
        mp5=MediaPlayer.create(this,R.raw.count);
        mp6=MediaPlayer.create(this,R.raw.count);
        mp7=MediaPlayer.create(this,R.raw.count);
        mp8=MediaPlayer.create(this,R.raw.count);
        mp9=MediaPlayer.create(this,R.raw.count);
        mp10=MediaPlayer.create(this,R.raw.count);
        mp11=MediaPlayer.create(this,R.raw.count);
        mp12=MediaPlayer.create(this,R.raw.count);
        mp13=MediaPlayer.create(this,R.raw.count);
        mp14=MediaPlayer.create(this,R.raw.count);
        mp15=MediaPlayer.create(this,R.raw.count);
        mp16=MediaPlayer.create(this,R.raw.count);
        mp17=MediaPlayer.create(this,R.raw.count);
        mp18=MediaPlayer.create(this,R.raw.count);
        mp19=MediaPlayer.create(this,R.raw.count);
        mp20=MediaPlayer.create(this,R.raw.count);
        mp21=MediaPlayer.create(this,R.raw.count);
        mp22=MediaPlayer.create(this,R.raw.count);
        mp23=MediaPlayer.create(this,R.raw.count);
        mp24=MediaPlayer.create(this,R.raw.count);
        mp25=MediaPlayer.create(this,R.raw.count);
        mp26=MediaPlayer.create(this,R.raw.count);
        mp27=MediaPlayer.create(this,R.raw.count);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp1.start();
                fondo.setImageResource(R.drawable.a);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp2.start();
                fondo.setImageResource(R.drawable.b);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp3.start();
                fondo.setImageResource(R.drawable.c);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp4.start();
                fondo.setImageResource(R.drawable.d);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp5.start();
                fondo.setImageResource(R.drawable.e);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp6.start();
                fondo.setImageResource(R.drawable.f);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp7.start();
                fondo.setImageResource(R.drawable.g);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp8.start();
                fondo.setImageResource(R.drawable.h);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp9.start();
                fondo.setImageResource(R.drawable.i);
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp10.start();
                fondo.setImageResource(R.drawable.j);
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp11.start();
                fondo.setImageResource(R.drawable.k);
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp12.start();
                fondo.setImageResource(R.drawable.l);
            }
        });
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp13.start();
                fondo.setImageResource(R.drawable.m);
            }
        });
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp14.start();
                fondo.setImageResource(R.drawable.n);
            }
        });
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp15.start();
                fondo.setImageResource(R.drawable.n);
            }
        });
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp16.start();
                fondo.setImageResource(R.drawable.o);
            }
        });
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp17.start();
                fondo.setImageResource(R.drawable.p);
            }
        });
        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp18.start();
                fondo.setImageResource(R.drawable.q);
            }
        });
        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp19.start();
                fondo.setImageResource(R.drawable.r);
            }
        });
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp20.start();
                fondo.setImageResource(R.drawable.s);
            }
        });
        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp21.start();
                fondo.setImageResource(R.drawable.t);
            }
        });
        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp22.start();
                fondo.setImageResource(R.drawable.u);
            }
        });
        btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp23.start();
                fondo.setImageResource(R.drawable.v);
            }
        });
        btn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp24.start();
                fondo.setImageResource(R.drawable.w);
            }
        });
        btn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp25.start();
                fondo.setImageResource(R.drawable.x);
            }
        });
        btn26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp26.start();
                fondo.setImageResource(R.drawable.y);
            }
        });
        btn27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp27.start();
                fondo.setImageResource(R.drawable.z);
            }
        });
    }
    public void click(View view){
        fondo.setImageResource(R.drawable.a);
        fondo.setImageResource(R.drawable.b);
        fondo.setImageResource(R.drawable.c);
        fondo.setImageResource(R.drawable.d);
        fondo.setImageResource(R.drawable.e);
        fondo.setImageResource(R.drawable.f);
        fondo.setImageResource(R.drawable.g);
        fondo.setImageResource(R.drawable.h);
        fondo.setImageResource(R.drawable.i);
        fondo.setImageResource(R.drawable.j);
        fondo.setImageResource(R.drawable.k);
        fondo.setImageResource(R.drawable.l);
        fondo.setImageResource(R.drawable.m);
        fondo.setImageResource(R.drawable.n);
        fondo.setImageResource(R.drawable.n);
        fondo.setImageResource(R.drawable.o);
        fondo.setImageResource(R.drawable.p);
        fondo.setImageResource(R.drawable.q);
        fondo.setImageResource(R.drawable.r);
        fondo.setImageResource(R.drawable.s);
        fondo.setImageResource(R.drawable.t);
        fondo.setImageResource(R.drawable.u);
        fondo.setImageResource(R.drawable.v);
        fondo.setImageResource(R.drawable.w);
        fondo.setImageResource(R.drawable.x);
        fondo.setImageResource(R.drawable.y);
        fondo.setImageResource(R.drawable.z);
    }
}
