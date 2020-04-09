package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.ListaRecordatorios.recordatoriosListaActivity;


public class recordatoriosMenuActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recordatoriosmenu);

    }



    public void onClickAppLogo(View view){
        Intent intent = new Intent(this, menuActivity.class);
        startActivity(intent);
    }

    public void onClickVerListaOpcion(View view){
        Intent intent = new Intent(this, recordatoriosListaActivity.class);
        startActivity(intent);
    }

    public void onAñadirRecordatorio(View view){
        Intent intent = new Intent(this, recordatoriosAddActivity.class);
        startActivity(intent);
    }

}

