package com.example.myapplication.MetasPersonalizadas.Tab1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.myapplication.R;


public class Tab1Fragment extends Fragment {
    private static final String TAG = "Tab1Fragment";

    private Tab1Fragment listAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.metaspersonalizadasresultadostab1,container,false);



        return view;
    }
}