package com.example.myapplication.MetasPersonalizadas.Tab2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.annotation.Nullable;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

import java.util.ArrayList;


public class Tab2Fragment extends Fragment {
    private static final String TAG = "Tab2Fragment";

    private Tab2Adapter listAdapter;
    private RecyclerView recyclerView;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.metaspersonalizadasresultadostab2,container,false);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView = view.findViewById(R.id.metasTab2Recycler1);
        recyclerView.setLayoutManager(linearLayoutManager);

        ArrayList<ComidaItems> comidaItemsList = new ArrayList<>();
        comidaItemsList.add(new ComidaItems(getResources().getString(R.string.aquíVaMeta)));
        comidaItemsList.add(new ComidaItems(getResources().getString(R.string.aquíVaMeta)));
        comidaItemsList.add(new ComidaItems(getResources().getString(R.string.aquíVaMeta)));
        comidaItemsList.add(new ComidaItems(getResources().getString(R.string.aquíVaMeta)));
        comidaItemsList.add(new ComidaItems(getResources().getString(R.string.aquíVaMeta)));
        comidaItemsList.add(new ComidaItems(getResources().getString(R.string.aquíVaMeta)));
        comidaItemsList.add(new ComidaItems(getResources().getString(R.string.aquíVaMeta)));
        comidaItemsList.add(new ComidaItems(getResources().getString(R.string.aquíVaMeta)));
        comidaItemsList.add(new ComidaItems(getResources().getString(R.string.aquíVaMeta)));

        listAdapter = new Tab2Adapter(comidaItemsList, getContext());
        recyclerView.setAdapter(listAdapter);

        return view;
    }

}