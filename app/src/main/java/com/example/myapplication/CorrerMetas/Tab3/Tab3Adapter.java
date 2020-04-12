package com.example.myapplication.CorrerMetas.Tab3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

import java.util.ArrayList;


public class Tab3Adapter
        extends RecyclerView.Adapter<Tab3Adapter.ViewHolder> {

    private ArrayList<BeneficiosFruta> beneficioItems;
    private Context context;



    public Tab3Adapter(ArrayList<BeneficiosFruta> ejercicioItems, Context context) {
        this.beneficioItems = ejercicioItems;
        this.context = context;
    }




    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.metasnopersonalizadastab3recyclerviewcontent, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        BeneficiosFruta ejercicioMetas = beneficioItems.get(position);

         holder.textView.setText(ejercicioMetas.getMeta());

    }

    @Override
    public int getItemCount() {
        return beneficioItems.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;


        ViewHolder(View view) {
            super(view);
            textView = view.findViewById(R.id.beneficio);

        }
    }
}
