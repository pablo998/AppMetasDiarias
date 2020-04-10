package com.example.myapplication.Frutas.Tab3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;




public class Tab3Adapter  extends RecyclerView.Adapter<Tab3Adapter.ViewHolder>{


    private Context context;

    public Tab3Adapter( Context context) {

        this.context = context;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.informaciongeneral_alimentacion, parent, false);
        //Todo cambiar el Layouts
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }


    @Override
    public int getItemCount() {

        return 0;
    }


    class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;


        ViewHolder(View view) {
            super(view);
            textView = view.findViewById(R.id.metaComidaPerso);

        }
    }
}