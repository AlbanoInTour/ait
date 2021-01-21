package com.cultureambassadors.albanointour;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.text.ParseException;
import java.util.Calendar;

public class BCActivity extends AppCompatActivity
{
    private BCList.BC bc;
    
    @RequiresApi(api = Build.VERSION_CODES.O)
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
        try
        {
            for (BCList.BC bc : BCList.getList())
                if (bc.getNome().equals(name))
                {
                    this.bc = bc;
                    nameTxt.setText(bc.getNome());
                    descTxt.setText(bc.getDescrizione());
                    addressTxt.setText(bc.getIndirizzo());
                    String orari = "";
                    String giorno_attuale = "";
                    Calendar calendar = Calendar.getInstance();
                    int day = calendar.get(Calendar.DAY_OF_WEEK);
                    switch (day)
                    {
                        case Calendar.MONDAY:
                            giorno_attuale= "lunedì:";
                            break;
                        case Calendar.TUESDAY:
                            giorno_attuale= "martedì:";
                            break;
                        case Calendar.WEDNESDAY:
                            giorno_attuale= "mercoledì:";
                            break;
                        case Calendar.THURSDAY:
                            giorno_attuale= "giovedì:";
                            break;
                        case Calendar.FRIDAY:
                            giorno_attuale= "venerdì:";
                            break;
                        case Calendar.SATURDAY:
                            giorno_attuale= "sabato:";
                            break;
                        case Calendar.SUNDAY:
                            giorno_attuale= "domenica:";
                            break;
                    }
                    for (String giorno : bc.getOrariString())
                    {
                        if (giorno.contains(giorno_attuale))
                            orari += "<b>"+giorno+"</b>";
                        else
                            orari+=giorno;
                        orari+="<br>";
                    }
                    orariTxt.setText(Html.fromHtml(orari.substring(0,orari.length()-4)));
                    tariffeTxt.setText(bc.getTariffe());
                    durataTxt.setText(bc.getDurataString());
                    img.setImageResource(getResources().getIdentifier(bc.getImg(), "drawable", getPackageName()));
                    break;
                }
        } catch (ParseException e)
        {
            e.printStackTrace();
        }
        Button recensioniBtn = findViewById(R.id.recensioniBtn);
        Button covidBtn = findViewById(R.id.covidBtn);
        recensioniBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(getApplicationContext(), RecensioneActivity.class);
                i.putExtra("name", bc.getNome());
                startActivity(i);
            }
        });
        covidBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //startActivity(new Intent(getApplicationContext(),));
            }
        });
    }
}