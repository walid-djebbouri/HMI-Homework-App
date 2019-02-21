package com.zimaheka.merwan_walid.ihm_tp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        BDconnecte db = new BDconnecte(this);
        ArrayList<String> arrayList = db.récuperer();
        final ListView lv = (ListView)findViewById(R.id.list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, db.récuperer());

        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View view, int position, long id) {

                Intent intent = new Intent(Main7Activity.this,Main8Activity.class);
                Bundle b = new Bundle() ;
                b.putString("nom" , lv.getItemAtPosition(position).toString());
                intent.putExtras(b);
                startActivity(intent);


            }
        });

    }
}
