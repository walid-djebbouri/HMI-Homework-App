package com.zimaheka.merwan_walid.ihm_tp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Main8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8) ;


    }

    public void novice(View view){

        Bundle b = getIntent().getExtras();
        b.putString("typ" , "novice");
        Intent intent = new Intent(this,Main9Activity.class) ;
        intent.putExtras(b);
        startActivity(intent);
    }


    public void habitué(View view){

        Bundle b = getIntent().getExtras();
        b.putString("typ" , "habitué");
        Intent intent = new Intent(this,Main9Activity.class) ;
        intent.putExtras(b);
        startActivity(intent);
    }

    public void expert(View view){

        Bundle b = getIntent().getExtras();
        b.putString("typ" , "expert");
        Intent intent = new Intent(this,Main9Activity.class) ;
        intent.putExtras(b);
        startActivity(intent);
    }
}
