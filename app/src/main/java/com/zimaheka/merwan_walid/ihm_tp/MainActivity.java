package com.zimaheka.merwan_walid.ihm_tp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nvp(View view){

        Intent intent = new Intent(this,Main2Activity.class) ;
        startActivity(intent);
    }
    public void ancp(View view){

        Intent intent = new Intent(this,Main7Activity.class) ;
        startActivity(intent);
    }
}
