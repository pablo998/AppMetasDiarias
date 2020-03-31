package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class inicioActivity extends AppCompatActivity {

    Button botonTransparente;
    TextView nombreApp;
    TextView tocarPantalla;
    ImageView logoApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio);

        botonTransparente = findViewById(R.id.botonTransparente);
        nombreApp = findViewById(R.id.nombreAppMayus);
        tocarPantalla = findViewById(R.id.toquePantalla);
        logoApp = findViewById(R.id.appLogo);


    }

    public void onClick(View view){
        Intent intent = new Intent(this, loginActivity.class);
        startActivity(intent);
    }
}