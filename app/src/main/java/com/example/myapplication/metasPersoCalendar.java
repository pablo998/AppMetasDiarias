package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.MetasPersonalizadas.metasPersonalizadasResultsActivity;


public class metasPersoCalendar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.metaspersonalizadascalendar);
    }

    public void onClickAppLogo(View view){
        Intent intent = new Intent(this, menuActivity.class);
        startActivity(intent);
    }

    public void onObtenerResultadosPersonaliz(View view){
        Intent intent = new Intent(this, metasPersonalizadasResultsActivity.class);
        startActivity(intent);
    }

}
