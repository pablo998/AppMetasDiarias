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

import com.google.android.material.bottomappbar.BottomAppBar;


public class menuActivity extends AppCompatActivity {

    Toolbar toolbar;
    TextView tituloLayout;
    BottomAppBar bottomAppBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        setUpBottomAppBar();

        toolbar = findViewById(R.id.myToolBar);
        setSupportActionBar(toolbar);
        tituloLayout = toolbar.findViewById(R.id.toolbar_title);

        setSupportActionBar(toolbar);
        tituloLayout.setText(R.string.menu);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.item1){
            Intent i = new Intent(this,perfilActivity.class);
            startActivity(i);
            return true;
        }else if(item.getItemId()==R.id.item2){
            Intent i = new Intent(this,nivelActivity.class);
            startActivity(i);
            return true;
        }
        return false;
    }

    private void setUpBottomAppBar() {
            //find id
            bottomAppBar = findViewById(R.id.bottomAppBar);

            //set bottom bar to Action bar as it is similar like Toolbar
        bottomAppBar.replaceMenu(R.menu.menubottombar);
    }

    public void onClickRecordatoriosBtn(View view){
        Intent intent = new Intent(this, recordatoriosMenuActivity.class);
        startActivity(intent);
    }
}
