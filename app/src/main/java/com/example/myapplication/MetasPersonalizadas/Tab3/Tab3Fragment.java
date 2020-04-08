package com.example.myapplication.MetasPersonalizadas.Tab3;

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


public class Tab3Fragment extends Fragment {
    private static final String TAG = "Tab3Fragment";

    private Tab3Adapter listAdapter;
    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.metaspersonalizadasresultadostab3,container,false);


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView = view.findViewById(R.id.metasPersoEjerRecycler);
        recyclerView.setLayoutManager(linearLayoutManager);

        ArrayList<EjercicioItems> ejercicioItems = new ArrayList<>();
        ejercicioItems.add(new EjercicioItems(getResources().getString(R.string.aquíVaMeta)));
        ejercicioItems.add(new EjercicioItems(getResources().getString(R.string.aquíVaMeta)));
        ejercicioItems.add(new EjercicioItems(getResources().getString(R.string.aquíVaMeta)));
        ejercicioItems.add(new EjercicioItems(getResources().getString(R.string.aquíVaMeta)));
        ejercicioItems.add(new EjercicioItems(getResources().getString(R.string.aquíVaMeta)));
        ejercicioItems.add(new EjercicioItems(getResources().getString(R.string.aquíVaMeta)));
        ejercicioItems.add(new EjercicioItems(getResources().getString(R.string.aquíVaMeta)));
        ejercicioItems.add(new EjercicioItems(getResources().getString(R.string.aquíVaMeta)));
        ejercicioItems.add(new EjercicioItems(getResources().getString(R.string.aquíVaMeta)));

        listAdapter = new Tab3Adapter(ejercicioItems, getContext());
        recyclerView.setAdapter(listAdapter);

        return view;
    }
}