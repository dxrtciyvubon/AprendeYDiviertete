package com.example.kidsapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class vocales extends AppCompatActivity {

    MediaPlayer a;
    MediaPlayer e;
    MediaPlayer i;
    MediaPlayer o;
    MediaPlayer u;
    private ImageView visor;
    private ImageButton a1,e2,i3,o4,u5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocales);
        visor=(ImageView) findViewById(R.id.visor);
        a1=(ImageButton)findViewById(R.id.a);
        e2=(ImageButton)findViewById(R.id.e);
        i3=(ImageButton)findViewById(R.id.i);
        o4=(ImageButton)findViewById(R.id.o);
        u5=(ImageButton)findViewById(R.id.u);


       a= MediaPlayer.create(this,R.raw.vocal1);
        e= MediaPlayer.create(this,R.raw.vocal1);
        i= MediaPlayer.create(this,R.raw.vocal1);
        o= MediaPlayer.create(this,R.raw.vocal1);
        u= MediaPlayer.create(this,R.raw.vocal1);




    }

    public  void playa (View view)
    {
        a.start();
        visor.setImageResource(R.drawable.a);
    }


    public  void playe (View view){
        e.start();
        visor.setImageResource(R.drawable.e);
    }


public  void playi (View view){
        i.start();
    visor.setImageResource(R.drawable.i);
        }

    public  void playo (View view){

    o.start();
        visor.setImageResource(R.drawable.o);
    }
    public  void playu (View view){

        u.start();
        visor.setImageResource(R.drawable.u);
    }


}


