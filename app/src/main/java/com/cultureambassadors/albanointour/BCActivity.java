package com.cultureambassadors.albanointour;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class BCActivity extends AppCompatActivity
{
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_c);
        Toolbar toolbar = findViewById(R.id.bcPageToolbar);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                onBackPressed();
            }
        });
        Bundle bundle = getIntent().getExtras();
        String name = "";
        if (bundle != null)
            name = bundle.getString("name");
        TextView nameTxt = findViewById(R.id.bcPageName);
        TextView descTxt = findViewById(R.id.bcPageDescription);
        TextView addressTxt = findViewById(R.id.bcPageAddress);
        TextView orariTxt = findViewById(R.id.bcPageOrari);
        TextView tariffeTxt = findViewById(R.id.bcPageTariffe);
        TextView durataTxt = findViewById(R.id.bcPageDurata);
        ImageView img = findViewById(R.id.bcPageImg);
        for (BCList.BC bc : BCList.getList())
            if (bc.getNome().equals(name))
            {
                nameTxt.setText(bc.getNome());
                descTxt.setText(bc.getDescrizione());
                addressTxt.setText(bc.getIndirizzo());
                orariTxt.setText(bc.getOrariString());
                tariffeTxt.setText(bc.getTariffe());
                durataTxt.setText(bc.getDurata());
                img.setImageResource(getResources().getIdentifier(bc.getImg(), "drawable", getPackageName()));
                break;
            }
        Button recensioniBtn = findViewById(R.id.recensioniBtn);
        Button covidBtn = findViewById(R.id.covidBtn);
        recensioniBtn.setOnClickListener(new View.OnClickListener()
        {//TODO implementare intent
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getApplicationContext(), RecensioneActivity.class);
                intent.putExtra("name", "I Cisternoni");
                startActivity(intent);
            }
        });
        covidBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //startActivity(new Intent(getApplicationContext(),));
                //TODO implementare intent
                Toast.makeText(getApplicationContext(), "text", Toast.LENGTH_SHORT).show();
            }
        });
    }
}