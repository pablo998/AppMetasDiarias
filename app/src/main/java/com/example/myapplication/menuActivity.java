package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.Frutas.SectionsPageAdapter;
import com.example.myapplication.Frutas.Tab1.Tab1Fragment;
import com.example.myapplication.Frutas.Tab2.FrutasItems;
import com.example.myapplication.Frutas.Tab2.Tab2Fragment;


public class menuActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

    }
    public void onClickMetasAlimentarias (View view) {
        Intent intent = new Intent(this, MetasAlimentacion.class);
        startActivity(intent);
    }
    public void onClickMenuOpcion2 (View view) {
        Intent intent = new Intent(this, MetasDeportivas.class);
        startActivity(intent);
    }


    public void onClickRecordatoriosBtn(View view){
        Intent intent = new Intent(this, recordatoriosMenuActivity.class);
        startActivity(intent);
    }
}
