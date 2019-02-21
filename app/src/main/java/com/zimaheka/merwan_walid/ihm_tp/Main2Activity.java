package com.zimaheka.merwan_walid.ihm_tp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void choisir(View view){

        EditText edt = (EditText)findViewById(R.id.editText);
        Bundle b  = new Bundle();
        b.putString("nom", edt.getText().toString());
        Intent intent = new Intent(this,Main3Activity.class) ;
        intent.putExtras(b);
        startActivity(intent);
    }
}
