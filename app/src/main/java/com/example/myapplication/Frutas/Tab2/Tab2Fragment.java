package com.example.myapplication.Frutas.Tab2;

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

    private com.example.myapplication.Frutas.Tab2.Tab2Adapter listAdapter;
    private RecyclerView recyclerView;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frutas,container,false);
            //TODO cambiar las metas personl por sus layouts correspondientes.
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView = view.findViewById(R.id.metasPersonalizadasTab2Recycler1);
        recyclerView.setLayoutManager(linearLayoutManager);

        ArrayList<FrutasItems> frutaItemsList = new ArrayList<>();
        frutaItemsList.add(new FrutasItems(getResources().getString(R.string.tipoFruta)));
        frutaItemsList.add(new FrutasItems(getResources().getString(R.string.tipoFruta)));
        frutaItemsList.add(new FrutasItems(getResources().getString(R.string.tipoFruta)));
        frutaItemsList.add(new FrutasItems(getResources().getString(R.string.tipoFruta)));
        frutaItemsList.add(new FrutasItems(getResources().getString(R.string.tipoFruta)));
        frutaItemsList.add(new FrutasItems(getResources().getString(R.string.tipoFruta)));
        frutaItemsList.add(new FrutasItems(getResources().getString(R.string.tipoFruta)));
        frutaItemsList.add(new FrutasItems(getResources().getString(R.string.tipoFruta)));
        frutaItemsList.add(new FrutasItems(getResources().getString(R.string.tipoFruta)));

        listAdapter = new Tab2Adapter (frutaItemsList,getContext());
        recyclerView.setAdapter(listAdapter);

        return view;
    }

}