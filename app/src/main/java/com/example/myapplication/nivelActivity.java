package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;



public class nivelActivity extends AppCompatActivity {


    Toolbar toolbar;
    TextView tituloLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nivel);

        toolbar = findViewById(R.id.myToolBar);
        setSupportActionBar(toolbar);
        tituloLayout = toolbar.findViewById(R.id.toolbar_title);

        setSupportActionBar(toolbar);
        tituloLayout.setText(R.string.nivelLayout);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent i = new Intent(this,menuActivity.class);
        startActivity(i);
        return true;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

}