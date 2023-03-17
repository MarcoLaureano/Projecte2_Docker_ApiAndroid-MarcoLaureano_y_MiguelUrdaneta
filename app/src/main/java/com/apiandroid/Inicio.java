package com.apiandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Inicio extends AppCompatActivity {

    ImageView alumnos, grupos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        alumnos = findViewById(R.id.btnListaAlumnos);
        alumnos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Inicio.this, MainActivity.class);
                startActivity(i);
            }
        });

        grupos = findViewById(R.id.icn_grupo);
        grupos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(Inicio.this, Grupos.class);
                startActivity(j);
            }
        });

    }
}