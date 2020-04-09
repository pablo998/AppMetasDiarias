package com.example.myapplication.ListaRecordatorios;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;
import com.example.myapplication.R;

import java.util.ArrayList;


public class RecordatoriosListaAdapter
        extends RecyclerView.Adapter<RecordatoriosListaAdapter.ViewHolder> {

    private ArrayList<RecordatoriosListaItem> recordatoriosListaItems;



    public RecordatoriosListaAdapter(ArrayList<RecordatoriosListaItem> recordatoriosListaItems) {
        this.recordatoriosListaItems = recordatoriosListaItems;
    }




    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recordatoriosrecyclerviewcontent, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        RecordatoriosListaItem recordatoriosItems = recordatoriosListaItems.get(position);

        holder.meta.setText(recordatoriosItems.getMeta());
        holder.hora.setText(recordatoriosItems.getHora());

    }

    @Override
    public int getItemCount() {
        return recordatoriosListaItems.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder {
        TextView meta;
        TextView hora;


        ViewHolder(View view) {
            super(view);
            meta = view.findViewById(R.id.metaRecordatoriosLista);
            hora = view.findViewById(R.id.horaRecordatoriosLista);
        }
    }
}
