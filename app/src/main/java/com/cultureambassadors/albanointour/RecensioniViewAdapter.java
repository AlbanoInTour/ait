package com.cultureambassadors.albanointour;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecensioniViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ArrayList<Recensioni_List.Recensione> bc = new ArrayList<>();
    private Context context;
    private int conta=0;
    private float media;
    public RecensioniViewAdapter(Context context, String filter)
    {
        this.context = context;
        filter(filter);
    }
    private void filter(String filter)
    {
        //ArrayList<Recensioni_List.Recensione> allBc = Recensioni_List.Recensione;

        float votoTot=0;
        for(Recensioni_List.Recensione rec  : Recensioni_List.getList()) {
            if (rec.getLuogo().equals(filter)) {
                conta++;
                votoTot += rec.voto;
            }
        }
        media=votoTot/conta;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View bcView = LayoutInflater.from(context).inflate(R.layout.recensione, parent, false);

        return new RecViewHolder(bcView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        //TODO immagine
        ((RecViewHolder) holder).nome.setText(bc.get(position).getNome());
        ((RecViewHolder) holder).voto.setText(String.valueOf(bc.get(position).get_voto()));
        ((RecViewHolder) holder).recensione.setText(bc.get(position).getRecensione());
    }

    @Override
    public int getItemCount() {
        return conta;
    }

    public class RecViewHolder extends RecyclerView.ViewHolder
    {
        private TextView nome, recensione;
        private TextView voto;

        public RecViewHolder(View V)
        {
            super(V);
            nome=V.findViewById(R.id.rec_Nome);
            recensione=V.findViewById(R.id.rec_testo);
            voto=V.findViewById(R.id.rec_Voto);

        }



    }

}
