package com.ifp.green_market;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {

    protected ImageView imagen1;

    protected Intent pasarPantalla;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imagen1= (ImageView) findViewById(R.id.imageViewSplash_splash);

        TimerTask tt = new TimerTask() {
            @Override
            public void run() {

                pasarPantalla = new Intent(SplashActivity.this, IniciarSesionActivity.class);
                finish();
                startActivity(pasarPantalla);
            }
        };

        Timer t = new Timer();

        t.schedule(tt, 3000);
    }
}