package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MetasAlimentacion extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.metasalimentarias);
    }

    public void onClickAppLogo(View view){
        Intent intent = new Intent(this, menuActivity.class);
        startActivity(intent);
    }

    public void onClickMenuOpcion1 (View view){
        Intent intent = new Intent(this, Frutas.class);
        startActivity(intent);
    }

    public void onClickMenuOpcion2 (View view){
        Intent intent = new Intent(this, Hidratacion.class);
        startActivity(intent);
    }

    public void onClickMenuOpcion3 (View view){
        Intent intent = new Intent(this, ComidaDiaria.class);
        startActivity(intent);
    }
    public void onClickInfoGeneral (View view){
        Intent intent = new Intent(this, ComidaDiaria.class);
        startActivity(intent);
    }
}
