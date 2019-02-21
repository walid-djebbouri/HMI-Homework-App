package com.zimaheka.merwan_walid.ihm_tp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.security.PublicKey;

public class   Main3Activity extends AppCompatActivity {

    @Override
    protected void  onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    Bundle b1 = new Bundle();
    public String nom(){
        Bundle b  = getIntent().getExtras() ;
        return b.getString("nom");
    }


    public void exp(View view){

        Intent intent = new Intent(this,Main4Activity.class) ;
        b1.putString("nom", nom()) ;
        intent.putExtras(b1) ;
        startActivity(intent);
    }
    public void hab(View view){

        Intent intent = new Intent(this,Main5Activity.class) ;
        b1.putString("nom", nom()) ;
        intent.putExtras(b1) ;
        startActivity(intent);
    }
    public void nov(View view){

        Intent intent = new Intent(this,Main6Activity.class) ;
        b1.putString("nom", nom()) ;
        intent.putExtras(b1) ;
        startActivity(intent);
    }


}
