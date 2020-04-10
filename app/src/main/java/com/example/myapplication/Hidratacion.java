package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.Frutas.Tab2.FrutasItems;

class Hidratacion extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hidratacion);
    }
    public void onClickAppLogo(View view){
        Intent intent = new Intent(this, FrutasItems.class);
        startActivity(intent);
    }
}

