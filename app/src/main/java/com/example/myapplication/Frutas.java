package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

class Frutas extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frutas);
    }
    public void onClickAppLogo(View view){
        Intent intent = new Intent(this, menuActivity.class);
        startActivity(intent);
    }
}
