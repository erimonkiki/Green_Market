package com.ifp.green_market;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class PerfilUsuarioActivity extends AppCompatActivity {

    protected TextView label1;
    protected TextView label2;
    protected TextView label3;
    protected TextView label4;
    protected TextView label5;
    protected TextView label6;
    protected TextView label7;
    protected EditText caja1;
    protected ImageView imagen1;
    protected ImageView imagen2;
    protected ImageView imagen3;
    protected ImageView imagen4;
    protected ImageView imagen5;
    protected ImageView imagen6;
    protected ImageView imagen7;

    protected ImageButton imageButton1;
    protected ImageButton imageButton2;
    protected ImageButton imageButton3;

    protected Intent pasarPantalla;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_usuario);

        label1= (TextView) findViewById(R.id.textView1_perfil);
        label2= (TextView) findViewById(R.id.textView2_perfil);
        label3= (TextView) findViewById(R.id.textView3_perfil);
        label4= (TextView) findViewById(R.id.textView4_perfil);
        label5= (TextView) findViewById(R.id.textView5_perfil);
        label6= (TextView) findViewById(R.id.textView6_perfil);
        label7= (TextView) findViewById(R.id.textView7_perfil);
        caja1= (EditText) findViewById(R.id.editText_perfil);
        imagen1= (ImageView) findViewById(R.id.imageView1_perfil);
        imagen2=(ImageView) findViewById(R.id.imageView2_perfil);
        imagen3= (ImageView) findViewById(R.id.imageView3_perfil);
        imagen4= (ImageView) findViewById(R.id.imageView4_perfil);
        imagen5= (ImageView) findViewById(R.id.imageView5_perfil);
        imagen6= (ImageView) findViewById(R.id.imageView6_perfil);
        imagen7= (ImageView) findViewById(R.id.imageView7_perfil);
        imageButton1= (ImageButton) findViewById(R.id.imageButton1_perfil);
        imageButton2= (ImageButton) findViewById(R.id.imageButton2_perfil);
        imageButton3= (ImageButton) findViewById(R.id.imageButton3_perfil);

        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pasarPantalla = new Intent(PerfilUsuarioActivity.this, ProductoresActivity.class);
                startActivity(pasarPantalla);

            }
        });

        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pasarPantalla= new Intent(PerfilUsuarioActivity.this, IniciarSesionActivity.class);
                startActivity(pasarPantalla);

               // finish();
            }
        });











    }
}