package com.cultureambassadors.albanointour;

import android.os.Bundle;
import android.view.View;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class BCListActivity extends AppCompatActivity
{
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bclist);
        RecyclerView bcRecyclerView = findViewById(R.id.bcRecyclerView);
        bcRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        Bundle bundle = getIntent().getExtras();
        String filter = "Lista dei beni culturali";
        if (bundle != null)
            filter = bundle.getString("filter");
        BCViewAdapter bcViewAdapter = new BCViewAdapter(getApplicationContext(), filter);
        bcRecyclerView.setAdapter(bcViewAdapter);
        Toolbar toolbar = findViewById(R.id.bcListToolbar);
        toolbar.setTitle(filter);
        toolbar.setNavigationOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                onBackPressed();
            }
        });
    }
}