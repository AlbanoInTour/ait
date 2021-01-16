package com.cultureambassadors.albanointour;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

public class BCViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>
{
    private ArrayList<BCList.BC> filteredBc = new ArrayList<BCList.BC>();
    private Context context;
    
    public BCViewAdapter(Context context, String filter)
    {
        this.context = context;
        filter(filter);
    }
    
    private void filter(String filter)
    {
        ArrayList<BCList.BC> allBc = BCList.getList();
        if (filter.equals("Lista dei beni culturali"))
            filteredBc = allBc;
        else
            for (BCList.BC bc : allBc)
                if (bc.getTipo().equals(filter))
                    filteredBc.add(bc);
    }
    
    @Override
    public int getItemViewType(int position)
    {
        return position == 0 ? 0 : 1;
    }
    
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        switch (viewType)
        {
            case 0:
                View suggestedView = LayoutInflater.from(context).inflate(R.layout.suggested_item, parent, false);
                suggestedView.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        Intent i = new Intent(v.getContext(), BCActivity.class);
                        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        TextView name = v.findViewById(R.id.suggestedName);
                        i.putExtra("name", name.getText().toString());
                        v.getContext().startActivity(i);
                    }
                });
                return new SuggestedViewHolder(suggestedView);
            case 1:
                View bcView = LayoutInflater.from(context).inflate(R.layout.bc_item, parent, false);
                bcView.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        Intent i = new Intent(context, BCActivity.class);
                        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        TextView name = v.findViewById(R.id.bcListName);
                        i.putExtra("name", name.getText().toString());
                        context.startActivity(i);
                    }
                });
                return new BCViewHolder(bcView);
        }
        return null;
    }
    
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)
    {
        switch (holder.getItemViewType())
        {
            case 0:
                BCList.BC randomBC = BCList.getList().get(new Random().nextInt(BCList.getSize()));
                ((SuggestedViewHolder) holder).name.setText(randomBC.getNome());
                ((SuggestedViewHolder) holder).img.setImageResource(context.getResources().getIdentifier(randomBC.getImg(), "drawable", context.getPackageName()));
                break;
            case 1:
                ((BCViewHolder) holder).name.setText(filteredBc.get(position).getNome());
                ((BCViewHolder) holder).img.setImageDrawable(context.getResources().getDrawable(context.getResources().getIdentifier(filteredBc.get(position).getImg(), "drawable", context.getPackageName())));
                Calendar calendar = Calendar.getInstance();
                int day = calendar.get(Calendar.DAY_OF_WEEK);
                String orario = "ND";
                switch (day)
                {
                    case Calendar.MONDAY:
                        orario = filteredBc.get(position).getOrari().get("lunedì");
                        break;
                    case Calendar.TUESDAY:
                        orario = filteredBc.get(position).getOrari().get("martedì");
                        break;
                    case Calendar.WEDNESDAY:
                        orario = filteredBc.get(position).getOrari().get("mercoledì");
                        break;
                    case Calendar.THURSDAY:
                        orario = filteredBc.get(position).getOrari().get("giovedì");
                        break;
                    case Calendar.FRIDAY:
                        orario = filteredBc.get(position).getOrari().get("venerdì");
                        break;
                    case Calendar.SATURDAY:
                        orario = filteredBc.get(position).getOrari().get("sabato");
                        break;
                    case Calendar.SUNDAY:
                        orario = filteredBc.get(position).getOrari().get("domenica");
                        break;
                }
                ((BCViewHolder) holder).info.setText("Oggi: " + orario + "\nDurata: " + filteredBc.get(position).getDurata());
                break;
        }
    }
    
    @Override
    public int getItemCount()
    {
        return filteredBc.size();
    }
    
    public class BCViewHolder extends RecyclerView.ViewHolder
    {
        private TextView name, info;
        private ImageView img;
        
        public BCViewHolder(@NonNull View itemView)
        {
            super(itemView);
            name = itemView.findViewById(R.id.bcListName);
            info = itemView.findViewById(R.id.bcListInfo);
            img = itemView.findViewById(R.id.bcListImg);
        }
    }
    
    public class SuggestedViewHolder extends RecyclerView.ViewHolder
    {
        private TextView name;
        private ImageView img;
        
        public SuggestedViewHolder(@NonNull View itemView)
        {
            super(itemView);
            name = itemView.findViewById(R.id.suggestedName);
            img = itemView.findViewById(R.id.suggestedImg);
        }
    }
    
    
}
