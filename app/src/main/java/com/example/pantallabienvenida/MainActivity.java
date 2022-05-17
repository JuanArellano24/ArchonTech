package com.example.pantallabienvenida;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Metodo del boton para pasar del boton registrar a la pantalla del registro
    public void siguienteR (View view){
        Intent siguienteR = new Intent(this, pantallaRegistroo.class);
        startActivity(siguienteR);
    }

    //Metodo del boton para pasar del boton registrar a la pantalla de iniciar sesión
    public void siguienteIS (View view){
        Intent siguienteIS = new Intent(this, PantallaIniciarSesion.class);
        startActivity(siguienteIS);

    }
   /* public void siguieteP (View view){
        Intent siguienteP = new Intent(this, pantallaPerfil.class);
        startActivity(siguienteP);

    }*/








}