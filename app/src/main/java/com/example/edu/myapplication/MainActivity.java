package com.example.edu.myapplication;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer sonido1, sonido2, sonido3, sonido4, sonido5, sonido6,sonido7,sonido8;
    private Button uno, dos, tres, cuatro, cinco, seis,siete,ocho;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uno = (Button) findViewById(R.id.uno);
        uno.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                sonido1 = MediaPlayer.create(MainActivity.this, R.raw.perro);
                sonido1.start();
            }

        });

        dos = (Button) findViewById(R.id.dos);
        dos.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                sonido2 = MediaPlayer.create(MainActivity.this, R.raw.leon);
                sonido2.start();
            }


        });

        tres = (Button) findViewById(R.id.tres);
        tres.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                sonido3 = MediaPlayer.create(MainActivity.this, R.raw.zombie);
                sonido3.start();
            }


        });

        cuatro = (Button) findViewById(R.id.cuatro);
        cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sonido4 = MediaPlayer.create(MainActivity.this, R.raw.fantasma);
                sonido4.start();
            }


        });

        cinco = (Button) findViewById(R.id.cinco);
        cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sonido5 = MediaPlayer.create(MainActivity.this, R.raw.barco);
                sonido5.start();
            }
        });

        seis = (Button) findViewById(R.id.seis);
        seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sonido6 = MediaPlayer.create(MainActivity.this, R.raw.avion);
                sonido6.start();
            }
        });

        siete = (Button) findViewById(R.id.siete);
        siete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sonido7 = MediaPlayer.create(MainActivity.this, R.raw.r2d2);
                sonido7.start();
            }
        });

        ocho = (Button) findViewById(R.id.ocho);
        ocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sonido8 = MediaPlayer.create(MainActivity.this, R.raw.vader);
                sonido8.start();
            }
        });

    }
}