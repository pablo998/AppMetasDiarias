package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;


public class recordatoriosListaActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recordatorioslista);
    }


    public void onAñadirRecordatorio(View view){
        Intent intent = new Intent(this, recordatoriosAddActivity.class);
        startActivity(intent);
    }


}
