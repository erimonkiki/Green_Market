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

public class IniciarSesionActivity extends AppCompatActivity {


    protected TextView label1;
    protected TextView label2;
    protected EditText caja1;
    protected EditText caja2;
    protected Button boton1;
    protected TextView label3;
    protected ImageView imagen1;
    protected Intent pasarPantalla;
    protected String box1content;
    protected String box2content;
    protected String email;
    protected String contraseña;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_sesion);


        label1= (TextView) findViewById(R.id.textView1_iniciar);
        label2= (TextView) findViewById(R.id.textView2_iniciar);
        caja1= (EditText) findViewById(R.id.editText1_iniciar);
        caja2= (EditText) findViewById(R.id.editText2_iniciar);
        boton1= (Button) findViewById(R.id.button1_iniciar);
        label3= (TextView) findViewById(R.id.textView3_iniciar);
        imagen1=(ImageView) findViewById(R.id.imageView1_iniciar);

        label1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crear un Intent para pasar a la actividad RegistrarActivity
                pasarPantalla = new Intent(IniciarSesionActivity.this, RegistrarActivity.class);
                startActivity(pasarPantalla);
            }
        });

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email = caja1.getText().toString();
                contraseña = caja2.getText().toString();
                box1content = caja1.getText().toString();
                box2content = caja2.getText().toString();
                if (box1content.equals("") || box2content.equals("")) {
                    Toast.makeText(IniciarSesionActivity.this, "Rellene los campos", Toast.LENGTH_SHORT).show();
                } else {

                    Toast.makeText(IniciarSesionActivity.this, "texto crado correctamente", Toast.LENGTH_SHORT).show();

                    pasarPantalla = new Intent(IniciarSesionActivity.this, ProductoresActivity.class);
                    finish();
                    startActivity(pasarPantalla);
                }

            }
        });
    }
}
