package com.example.myapplication.ListaRecordatorios;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.recordatoriosAddActivity;

import java.util.ArrayList;


public class recordatoriosListaActivity extends AppCompatActivity {

    RecyclerView recyclerViewLista;
    LinearLayoutManager linearLayoutManager;
    RecordatoriosListaAdapter listaAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recordatorioslista);

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


    public void onAñadirRecordatorio(View view){
        Intent intent = new Intent(this, recordatoriosAddActivity.class);
        startActivity(intent);
    }


}
