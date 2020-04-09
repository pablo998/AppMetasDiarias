package com.example.myapplication.MetasPersonalizadas.Tab2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

import java.util.ArrayList;


public class Tab2Adapter
        extends RecyclerView.Adapter<Tab2Adapter.ViewHolder> {

    private ArrayList<ComidaItems> comidaItemsList;
    private Context context;



    public Tab2Adapter(ArrayList<ComidaItems> comidaItemsList, Context context) {
        this.comidaItemsList = comidaItemsList;
        this.context = context;
    }




    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.metaspersonalizadastab2recyclerviewcontent, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
         ComidaItems comidaItems = comidaItemsList.get(position);

         holder.textView.setText(comidaItems.getMeta());

    }

    @Override
    public int getItemCount() {
        return comidaItemsList.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;


        ViewHolder(View view) {
            super(view);
            textView = view.findViewById(R.id.metaComidaPerso);

        }
    }
}
