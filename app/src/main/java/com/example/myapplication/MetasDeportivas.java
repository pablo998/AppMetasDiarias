package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MetasDeportivas extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.metasdeportivas);
    }

    public void onClickAppLogo(View view){
        Intent intent = new Intent(this, menuActivity.class);
        startActivity(intent);
    }

    public void onClickMenuOpcion1 (View view){
        Intent intent = new Intent(this, Caminar.class);
        startActivity(intent);
    }

    public void onClickMenuOpcion2 (View view){
        Intent intent = new Intent(this, Correr.class);
        startActivity(intent);
    }

    public void onClickMenuOpcion3 (View view){
        Intent intent = new Intent(this, EjercicioVariado.class);
        startActivity(intent);
    }
    public void onClickInfoGeneral (View view){
        Intent intent = new Intent(this, InfoGeneralDeporte.class);
        startActivity(intent);
    }
}
