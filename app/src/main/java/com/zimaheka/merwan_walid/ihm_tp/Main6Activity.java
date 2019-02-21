package com.zimaheka.merwan_walid.ihm_tp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;


public class Main6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
    }



    int  groupement = 0 , lisibilité = 0 , experience = 0 , message  = 0 , controle  = 0 , utilisateur = 0 ,cohérence = 0 , compatibilité  = 0  , sinification = 0   ;
    float incitation = 0 , feedback = 0 , brièvité  = 0 ,  densité  = 0 , erreur = 0 , correction = 0 ;







    public void cheked2(View view) {
        boolean cheked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radioButton6:
                if (cheked) ;
                groupement = 1 ;
                break;
            case R.id.radioButton7:
                if (cheked) ;
                groupement = 2 ;
                break;
            case R.id.radioButton8:
                if (cheked) ;
                groupement = 3 ;
                break;
            case R.id.radioButton9:
                if (cheked) ;
                groupement = 4 ;
                break;
            case R.id.radioButton10:
                if (cheked) ;
                groupement = 5 ;
                break;
        }
    }
    public void cheked4(View view) {
        boolean cheked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radioButton16:
                if (cheked) ;
               lisibilité = 1 ;
                break;
            case R.id.radioButton17:
                if (cheked) ;
                lisibilité = 2 ;
                break;
            case R.id.radioButton18:
                if (cheked) ;
                lisibilité = 3 ;
                break;
            case R.id.radioButton19:
                if (cheked) ;
                lisibilité = 4 ;
                break;
            case R.id.radioButton20:
                if (cheked) ;
                lisibilité = 5 ;
                break;
        }
    }
    public void cheked5(View view) {
        boolean cheked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radioButton21:
                if (cheked) ;
                experience = 1 ;
                break;
            case R.id.radioButton22:
                if (cheked) ;
                experience = 2 ;
                break;
            case R.id.radioButton23:
                if (cheked) ;
                experience = 3 ;
                break;
            case R.id.radioButton24:
                if (cheked) ;
                experience = 4 ;
                break;
            case R.id.radioButton25:
                if (cheked) ;
                experience = 5 ;
                break;
        }
    }
    public void cheked6(View view) {
        boolean cheked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radioButton26:
                if (cheked) ;
                message = 1 ;
                break;
            case R.id.radioButton27:
                if (cheked) ;
                message = 2 ;
                break;
            case R.id.radioButton28:
                if (cheked) ;
                message = 3 ;
                break;
            case R.id.radioButton29:
                if (cheked) ;
                message = 4 ;
                break;
            case R.id.radioButton30:
                if (cheked) ;
                message = 5 ;
                break;
        }
    }
    public void cheked7(View view) {
        boolean cheked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radioButton31:
                if (cheked) ;
                controle = 1 ;
                break;
            case R.id.radioButton32:
                if (cheked) ;
                controle = 2 ;
                break;
            case R.id.radioButton33:
                if (cheked) ;
                controle = 3 ;
                break;
            case R.id.radioButton34:
                if (cheked) ;
                controle = 4 ;
                break;
            case R.id.radioButton35:
                if (cheked) ;
                controle = 5 ;
                break;
        }
    }
    public void cheked8(View view) {
        boolean cheked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radioButton36:
                if (cheked) ;
                utilisateur = 1  ;
                break;
            case R.id.radioButton37:
                if (cheked) ;
                utilisateur = 2  ;
                break;
            case R.id.radioButton38:
                if (cheked) ;
                utilisateur = 3  ;
                break;
            case R.id.radioButton39:
                if (cheked) ;
                utilisateur = 4  ;
                break;
            case R.id.radioButton40:
                if (cheked) ;
                utilisateur = 5  ;
                break;
        }
    }
    public void cheked9(View view) {
        boolean cheked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radioButton41:
                if (cheked) ;
                cohérence = 1 ;
                break;
            case R.id.radioButton42:
                if (cheked) ;
                cohérence = 2 ;
                break;
            case R.id.radioButton43:
                if (cheked) ;
                cohérence = 3 ;
                break;
            case R.id.radioButton44:
                if (cheked) ;
                cohérence = 4 ;
                break;
            case R.id.radioButton45:
                if (cheked) ;
                cohérence = 5 ;
                break;
        }
    }
    public void cheked10(View view) {
        boolean cheked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radioButton46:
                if (cheked) ;
                sinification = 1  ;
                break;
            case R.id.radioButton47:
                if (cheked) ;
                sinification = 2  ;
                break;
            case R.id.radioButton48:
                if (cheked) ;
                sinification = 3  ;
                break;
            case R.id.radioButton49:
                if (cheked) ;
                sinification = 4  ;
                break;
            case R.id.radioButton50:
                if (cheked) ;
                sinification = 5  ;
                break;
        }
    }
    public void cheked11(View view) {
        boolean cheked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radioButton51:
                if (cheked) ;
                compatibilité = 1 ;
                break;
            case R.id.radioButton52:
                if (cheked) ;
                compatibilité = 2 ;
                break;
            case R.id.radioButton53:
                if (cheked) ;
                compatibilité = 3 ;
                break;
            case R.id.radioButton54:
                if (cheked) ;
                compatibilité = 4 ;
                break;
            case R.id.radioButton55:
                if (cheked) ;
                compatibilité = 5 ;
                break;
        }
    }


    public  void eng(View view){

        EditText et = (EditText)findViewById(R.id.editText1) ;
        incitation = Float.parseFloat(et.getText().toString()) ;
        et = (EditText)findViewById(R.id.editText2) ;
        feedback = Float.parseFloat(et.getText().toString()) ;
        et = (EditText)findViewById(R.id.editText3) ;
        brièvité = Float.parseFloat(et.getText().toString()) ;
        et = (EditText)findViewById(R.id.editText4) ;
        densité = Float.parseFloat(et.getText().toString()) ;
        et = (EditText)findViewById(R.id.editText5) ;
        erreur = Float.parseFloat(et.getText().toString()) ;
        et = (EditText)findViewById(R.id.editText6) ;
        correction = Float.parseFloat(et.getText().toString()) ;

        BDconnecte db = new BDconnecte(this) ;
        Bundle b = getIntent().getExtras();
        String nom = b.getString("nom") ;
        db.insertion( nom ,"novice" ,  incitation  ,  groupement , feedback  , lisibilité   ,  brièvité   , densité  ,  experience  ,  erreur  ,  message  , correction  , controle  ,  utilisateur  , cohérence  ,   sinification ,  compatibilité );
        Intent intent = new Intent(this,Main3Activity.class) ;
        intent.putExtras(b);
        startActivity(intent);
    }

    public void aff(View view){

        Intent intent = new Intent(this,Main7Activity.class);
        startActivity(intent);
    }





    }
