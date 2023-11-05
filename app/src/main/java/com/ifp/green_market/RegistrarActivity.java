package com.ifp.green_market;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class RegistrarActivity extends AppCompatActivity {


    protected TextView label1;
    protected TextView label2;
    protected EditText caja1;
    protected EditText caja2;
    protected EditText caja3;
    protected Button boton1;
    protected Button boton2;
    protected ImageView imagen1;

    protected Intent pasarPantalla;

    protected String box1content;

    protected String box2content;

    protected String box3content;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);



        label1= (TextView) findViewById(R.id.textView1_registrar);
        label2= (TextView) findViewById(R.id.textView2_registar);
        caja1= (EditText) findViewById(R.id.editText1_registar);
        caja2= (EditText) findViewById(R.id.editText2_registrar);
        caja3= (EditText) findViewById(R.id.editText2_registrar3);
        boton1= (Button) findViewById(R.id.button1_registrar);
        imagen1=(ImageView) findViewById(R.id.imageView1_registar);
        boton2=(Button) findViewById(R.id.checkBox1_registrar);

        label1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crear un Intent para pasar a la actividad IniciarSesionActivity
                pasarPantalla = new Intent(RegistrarActivity.this, IniciarSesionActivity.class);
                startActivity(pasarPantalla);
            }
        });

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                box1content = caja1.getText().toString();
                box2content = caja2.getText().toString();
                box3content= caja3.getText().toString();
                if (box1content.equals("") || box2content.equals("") || box3content.equals("")) {
                    Toast.makeText(RegistrarActivity.this, "Rellene los campos", Toast.LENGTH_SHORT).show();
                } else {

                    Toast.makeText(RegistrarActivity.this, "texto crado correctamente", Toast.LENGTH_SHORT).show();

                    pasarPantalla = new Intent(RegistrarActivity.this, IniciarSesionActivity.class);
                    finish();
                    startActivity(pasarPantalla);
                }

            }
        });
    }
}
