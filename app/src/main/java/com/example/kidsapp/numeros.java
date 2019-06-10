package com.example.kidsapp;

import android.media.MediaPlayer;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class numeros extends AppCompatActivity {

    private ImageView fondo;
    private ImageButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18,btn19,btn20;
    MediaPlayer mp1,mp2,mp3,mp4,mp5,mp6,mp7,mp8,mp9,mp10,mp11,mp12,mp13,mp14,mp15,mp16,mp17,mp18,mp19,mp20;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.numeros);
        setUpActionBar();


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




        mp1=MediaPlayer.create(this,R.raw.uno);
        mp2=MediaPlayer.create(this,R.raw.dos);
        mp3=MediaPlayer.create(this,R.raw.tres);
        mp4=MediaPlayer.create(this,R.raw.cuatro);
        mp5=MediaPlayer.create(this,R.raw.cinco);
        mp6=MediaPlayer.create(this,R.raw.seis);
        mp7=MediaPlayer.create(this,R.raw.siete);
        mp8=MediaPlayer.create(this,R.raw.ocho);
        mp9=MediaPlayer.create(this,R.raw.nueve);
        mp10=MediaPlayer.create(this,R.raw.diez);
        mp11=MediaPlayer.create(this,R.raw.once);
        mp12=MediaPlayer.create(this,R.raw.doce);
        mp13=MediaPlayer.create(this,R.raw.trece);
        mp14=MediaPlayer.create(this,R.raw.catorce);
        mp15=MediaPlayer.create(this,R.raw.quince);
        mp16=MediaPlayer.create(this,R.raw.diezyseis);
        mp17=MediaPlayer.create(this,R.raw.diezysiete);
        mp18=MediaPlayer.create(this,R.raw.diezyocho);
        mp19=MediaPlayer.create(this,R.raw.diezynueve);
        mp20=MediaPlayer.create(this,R.raw.veinte);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp1.start();
                fondo.setImageResource(R.drawable.uno);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp2.start();
                fondo.setImageResource(R.drawable.dos);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp3.start();
                fondo.setImageResource(R.drawable.tressss);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp4.start();
                fondo.setImageResource(R.drawable.cuatro);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp5.start();
                fondo.setImageResource(R.drawable.cincooooo);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp6.start();
                fondo.setImageResource(R.drawable.seissss);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp7.start();
                fondo.setImageResource(R.drawable.sieteeee);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp8.start();
                fondo.setImageResource(R.drawable.ochoooo);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp9.start();
                fondo.setImageResource(R.drawable.nueveeee);
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp10.start();
                fondo.setImageResource(R.drawable.diezzzz);
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp11.start();
                fondo.setImageResource(R.drawable.onceeeee);
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp12.start();
                fondo.setImageResource(R.drawable.doce);
            }
        });
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp13.start();
                fondo.setImageResource(R.drawable.trece);
            }
        });
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp14.start();
                fondo.setImageResource(R.drawable.catorce);
            }
        });
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp15.start();
                fondo.setImageResource(R.drawable.quince);
            }
        });
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp16.start();
                fondo.setImageResource(R.drawable.diesiseis);
            }
        });
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp17.start();
                fondo.setImageResource(R.drawable.diescisiete);
            }
        });
        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp18.start();
                fondo.setImageResource(R.drawable.dieciocho);
            }
        });
        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp19.start();
                fondo.setImageResource(R.drawable.diescinueve);
            }
        });
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp20.start();
                fondo.setImageResource(R.drawable.veinte);
            }
        });
    }
    public void click(View view){
        fondo.setImageResource(R.drawable.uno);
        fondo.setImageResource(R.drawable.dos);
        fondo.setImageResource(R.drawable.tressss);
        fondo.setImageResource(R.drawable.cuatro);
        fondo.setImageResource(R.drawable.cincooooo);
        fondo.setImageResource(R.drawable.seissss);
        fondo.setImageResource(R.drawable.sieteeee);
        fondo.setImageResource(R.drawable.ochoooo);
        fondo.setImageResource(R.drawable.nueveeee);
        fondo.setImageResource(R.drawable.diezzzz);
        fondo.setImageResource(R.drawable.onceeeee);
        fondo.setImageResource(R.drawable.doce);
        fondo.setImageResource(R.drawable.trece);
        fondo.setImageResource(R.drawable.catorce);
        fondo.setImageResource(R.drawable.quince);
        fondo.setImageResource(R.drawable.diesiseis);
        fondo.setImageResource(R.drawable.diescisiete);
        fondo.setImageResource(R.drawable.dieciocho);
        fondo.setImageResource(R.drawable.diescinueve);
        fondo.setImageResource(R.drawable.veinte);

    }
    private void setUpActionBar(){
        ActionBar actionBar= getSupportActionBar();
        if(actionBar !=null){
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setTitle("Numeros");
        }
    }

}
