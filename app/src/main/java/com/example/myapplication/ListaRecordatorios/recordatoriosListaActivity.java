package com.example.myapplication.ListaRecordatorios;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.menuActivity;
import com.example.myapplication.nivelActivity;
import com.example.myapplication.perfilActivity;
import com.example.myapplication.recordatoriosAddActivity;
import com.google.android.material.bottomappbar.BottomAppBar;

import java.util.ArrayList;


public class recordatoriosListaActivity extends AppCompatActivity {

    RecyclerView recyclerViewLista;
    LinearLayoutManager linearLayoutManager;
    RecordatoriosListaAdapter listaAdapter;
    Toolbar toolbar;
    TextView tituloLayout;
    BottomAppBar bottomAppBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recordatorioslista);
        setUpBottomAppBar();

        toolbar = findViewById(R.id.myToolBar);
        setSupportActionBar(toolbar);
        tituloLayout = toolbar.findViewById(R.id.toolbar_title);

        setSupportActionBar(toolbar);
        tituloLayout.setText(R.string.listaWord);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        linearLayoutManager = new LinearLayoutManager(this);
        recyclerViewLista = findViewById(R.id.recyclerLista);
        recyclerViewLista.setLayoutManager(linearLayoutManager);

        ArrayList<RecordatoriosListaItem> listaItems = new ArrayList<>();
        listaItems.add(new RecordatoriosListaItem(getResources().getString(R.string.aquíVaMeta), getResources().getString(R.string.aquíVaHora)));
        listaItems.add(new RecordatoriosListaItem(getResources().getString(R.string.aquíVaMeta), getResources().getString(R.string.aquíVaHora)));
        listaItems.add(new RecordatoriosListaItem(getResources().getString(R.string.aquíVaMeta), getResources().getString(R.string.aquíVaHora)));
        listaItems.add(new RecordatoriosListaItem(getResources().getString(R.string.aquíVaMeta), getResources().getString(R.string.aquíVaHora)));
        listaItems.add(new RecordatoriosListaItem(getResources().getString(R.string.aquíVaMeta), getResources().getString(R.string.aquíVaHora)));

        listaAdapter = new RecordatoriosListaAdapter(listaItems);
        recyclerViewLista.setAdapter(listaAdapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }


    public void onAñadirRecordatorio(View view){
        Intent intent = new Intent(this, recordatoriosAddActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.item1) {
            Intent i = new Intent(this, perfilActivity.class);
            startActivity(i);
            return true;
        } else if (item.getItemId() == R.id.item2) {
            Intent i = new Intent(this, nivelActivity.class);
            startActivity(i);
            return true;
        } else {
            Intent i = new Intent(this, menuActivity.class);
            startActivity(i);
            return true;
        }
    }

    private void setUpBottomAppBar() {
        //find id
        bottomAppBar = findViewById(R.id.bottomAppBar);

        //set bottom bar to Action bar as it is similar like Toolbar
        bottomAppBar.replaceMenu(R.menu.menubottombar);
    }

}
