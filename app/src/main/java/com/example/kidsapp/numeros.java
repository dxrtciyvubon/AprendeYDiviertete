package com.example.kidsapp;

import android.media.MediaPlayer;
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




        mp1=MediaPlayer.create(this,R.raw.animals020);
        mp2=MediaPlayer.create(this,R.raw.count);
        mp3=MediaPlayer.create(this,R.raw.animals020);
        mp4=MediaPlayer.create(this,R.raw.count);
        mp5=MediaPlayer.create(this,R.raw.animals020);
        mp6=MediaPlayer.create(this,R.raw.count);
        mp7=MediaPlayer.create(this,R.raw.animals020);
        mp8=MediaPlayer.create(this,R.raw.count);
        mp9=MediaPlayer.create(this,R.raw.animals020);
        mp10=MediaPlayer.create(this,R.raw.count);
        mp11=MediaPlayer.create(this,R.raw.animals020);
        mp12=MediaPlayer.create(this,R.raw.count);
        mp13=MediaPlayer.create(this,R.raw.animals020);
        mp14=MediaPlayer.create(this,R.raw.count);
        mp15=MediaPlayer.create(this,R.raw.animals020);
        mp16=MediaPlayer.create(this,R.raw.count);
        mp17=MediaPlayer.create(this,R.raw.animals020);
        mp18=MediaPlayer.create(this,R.raw.count);
        mp19=MediaPlayer.create(this,R.raw.animals020);
        mp20=MediaPlayer.create(this,R.raw.count);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp1.start();
                fondo.setImageResource(R.drawable.num1);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp2.start();
                fondo.setImageResource(R.drawable.num2);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp3.start();
                fondo.setImageResource(R.drawable.num3);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp4.start();
                fondo.setImageResource(R.drawable.num4);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp5.start();
                fondo.setImageResource(R.drawable.num5);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp6.start();
                fondo.setImageResource(R.drawable.num6);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp7.start();
                fondo.setImageResource(R.drawable.num7);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp8.start();
                fondo.setImageResource(R.drawable.num8);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp9.start();
                fondo.setImageResource(R.drawable.num9);
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp10.start();
                fondo.setImageResource(R.drawable.num10);
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp11.start();
                fondo.setImageResource(R.drawable.num11);
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp12.start();
                fondo.setImageResource(R.drawable.num12);
            }
        });
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp13.start();
                fondo.setImageResource(R.drawable.num13);
            }
        });
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp14.start();
                fondo.setImageResource(R.drawable.num14);
            }
        });
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp15.start();
                fondo.setImageResource(R.drawable.num15);
            }
        });
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp16.start();
                fondo.setImageResource(R.drawable.num16);
            }
        });
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp17.start();
                fondo.setImageResource(R.drawable.num17);
            }
        });
        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp18.start();
                fondo.setImageResource(R.drawable.num18);
            }
        });
        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp19.start();
                fondo.setImageResource(R.drawable.num19);
            }
        });
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp20.start();
                fondo.setImageResource(R.drawable.num20);
            }
        });
    }
    public void click(View view){
        fondo.setImageResource(R.drawable.num1);
        fondo.setImageResource(R.drawable.num2);
        fondo.setImageResource(R.drawable.num3);
        fondo.setImageResource(R.drawable.num4);
        fondo.setImageResource(R.drawable.num5);
        fondo.setImageResource(R.drawable.num6);
        fondo.setImageResource(R.drawable.num7);
        fondo.setImageResource(R.drawable.num8);
        fondo.setImageResource(R.drawable.num9);
        fondo.setImageResource(R.drawable.num10);
        fondo.setImageResource(R.drawable.num11);
        fondo.setImageResource(R.drawable.num12);
        fondo.setImageResource(R.drawable.num13);
        fondo.setImageResource(R.drawable.num14);
        fondo.setImageResource(R.drawable.num15);
        fondo.setImageResource(R.drawable.num16);
        fondo.setImageResource(R.drawable.num17);
        fondo.setImageResource(R.drawable.num18);
        fondo.setImageResource(R.drawable.num19);
        fondo.setImageResource(R.drawable.num20);

    }

}
