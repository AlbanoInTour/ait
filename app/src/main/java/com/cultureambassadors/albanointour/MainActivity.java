package com.cultureambassadors.albanointour;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationBuilderWithBuilderAccessor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
//TODO aggiungere il logo


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startList(View view){
        Intent intent = new Intent(this, BCActivity.class);
        String []filters = getResources().getStringArray(R.array.filters);
        String filter = "";
        if(view.getId() == R.id.btnReligiosi)
            intent.putExtra("filter", filters[0]);
        else if(view.getId() == R.id.btnStorici)
            intent.putExtra("filter", filters[1]);
        else if(view.getId() == R.id.btnMostre)
            intent.putExtra("filter", filters[2]);
        else if(view.getId() == R.id.btnMusei)
            intent.putExtra("filter", filters[3]);
        else if(view.getId() == R.id.btnEventiCulturali)
            intent.putExtra("filter", filters[4]);
        else
            intent.putExtra("filter", filters[5]);
        startActivity(intent);

    }
}