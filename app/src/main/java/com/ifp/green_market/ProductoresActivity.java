package com.ifp.green_market;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ProductoresActivity extends AppCompatActivity {
    protected Intent pasarPantalla;
    protected ImageView imagen1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productores);

        imagen1=(ImageView) findViewById(R.id.imageView1_Productores);

        imagen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crear un Intent para pasar a la actividad RegistrarActivity
                pasarPantalla = new Intent(ProductoresActivity.this, PerfilUsuarioActivity.class);
                startActivity(pasarPantalla);
            }
        });
    }
}