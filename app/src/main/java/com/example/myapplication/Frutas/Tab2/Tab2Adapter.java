package com.example.myapplication.Frutas.Tab2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.myapplication.R;

import java.util.ArrayList;

public class Tab2Adapter
        extends RecyclerView.Adapter<com.example.myapplication.Frutas.Tab2.Tab2Adapter.ViewHolder> {

    private ArrayList<FrutasItems>  frutasItemsList;
    private Context context;



    public Tab2Adapter(ArrayList<FrutasItems> frutasItemsList, Context context) {
        this.frutasItemsList = frutasItemsList;
        this.context = context;
    }




    @Override
    public com.example.myapplication.Frutas.Tab2.Tab2Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
      //Todo cambiar metasperosnaal.... por su layouts correspondiente cuando este creado
        View view = LayoutInflater.from(context)
                .inflate(R.layout.frutas, parent, false);
        return new com.example.myapplication.Frutas.Tab2.Tab2Adapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        FrutasItems frutasItems = frutasItemsList.get(position);
        holder.textView.setText(frutasItems.getMeta());
    }





    @Override
    public int getItemCount() {

        return frutasItemsList.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;

        //Todo cambiar por el layouts correspondiente.
        ViewHolder(View view) {
            super(view);
            textView = view.findViewById(R.id.metaComidaPerso);

        }
    }
}