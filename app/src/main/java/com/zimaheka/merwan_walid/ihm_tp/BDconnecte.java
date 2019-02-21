package com.zimaheka.merwan_walid.ihm_tp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Walid Djebbouri on 20/12/2017.
 */

public class BDconnecte extends SQLiteOpenHelper {

    public static final int Version = 1 ;
    public static  final  String DbName = "MyDb.db" ;
    public BDconnecte(Context context){

        super(context, DbName , null , Version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("create table if not exists user( id integer primary key  , nom text ,typ text , incitation float , groupement integer , feedbac float , lisibilité integer  , brièvité  float ,  densité float , expérience integer , erruer float , message integer , correction float , action integer , controle integer , homoginité integer , signification integer , compatibilite integer   )");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(" DORP table IF EXIST user ");
        onCreate(db);

    }

    public  void insertion( String nom ,  String typ  , float incitation  ,int  groupement  , float feedbac  , int lisibilité   ,float  brièvité   , float densité , int expérience , float erruer , int message , float correction , int action , int controle , int homoginité , int signification  , int compatibilite  ){

        SQLiteDatabase db = this.getWritableDatabase() ;


        db.execSQL( " insert into user( nom,typ,incitation,groupement,feedbac,lisibilité,brièvité,densité,expérience,erruer,message,correction,action,controle,homoginité,signification,compatibilite)values( '"+nom+"','"+typ+"','"+incitation+"','"+groupement+"','"+feedbac+"','"+lisibilité+"','"+brièvité+"','"+densité+"','"+expérience+"','"+erruer+"','"+message+"','"+correction+"','"+action+"','"+controle+"','"+homoginité+"','"+signification+"','"+compatibilite+"');");

    }



    public  String selection(){

        SQLiteDatabase db =  this.getReadableDatabase();
        Cursor c =  db.rawQuery(" select * from user " , null ) ;
        String mot ="" ;
        while ( c.moveToNext()){

            mot= String.valueOf(c.getFloat(c.getColumnIndex("incitation")))+" "+String.valueOf(c.getFloat(c.getColumnIndex("feedbac")))+" "+String.valueOf(c.getFloat(c.getColumnIndex("brièvité")))+""+String.valueOf(c.getFloat(c.getColumnIndex("densité")))+" "+String.valueOf(c.getFloat(c.getColumnIndex("erruer")))+" "+String.valueOf(c.getFloat(c.getColumnIndex("correction"))) ;

        }

        return mot ;
    }

    public ArrayList récuperer(){

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = db.rawQuery("select nom from user " , null) ;

        ArrayList<String> array = new ArrayList<String>();
        while (c.moveToNext()){

                array.add(c.getString(c.getColumnIndex("nom"))) ;
            }


        return  array ;
    }

    public  ArrayList groupement( String nom , String typ ){

        ArrayList<Integer> arrayList = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = db.rawQuery(" select id from user where nom =('"+nom+"') and (typ='"+typ+"') and (groupement = '5')   " , null) ;
        arrayList.add(c.getCount());
        c = db.rawQuery(" select id from user where nom =('"+nom+"') and (typ='"+typ+"') and (groupement = '4')   " , null) ;
        arrayList.add(c.getCount());
        c = db.rawQuery(" select id from user where nom =('"+nom+"') and (typ='"+typ+"') and (groupement = '3')   " , null) ;
        arrayList.add(c.getCount());
        c = db.rawQuery(" select id from user where nom =('"+nom+"') and (typ='"+typ+"') and (groupement = '2')   " , null) ;
        arrayList.add(c.getCount());
        c = db.rawQuery(" select id from user where nom =('"+nom+"') and (typ='"+typ+"') and (groupement = '1')   " , null) ;
        arrayList.add(c.getCount());


        return arrayList ;

    }
    public  ArrayList lisibilité( String nom , String typ ){

        ArrayList<Integer> arrayList = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = db.rawQuery(" select id from user where nom =('"+nom+"') and (typ='"+typ+"') and (lisibilité = '5')   " , null) ;
        arrayList.add(c.getCount());
        c = db.rawQuery(" select id from user where nom =('"+nom+"') and (typ='"+typ+"') and (lisibilité = '4')   " , null) ;
        arrayList.add(c.getCount());
        c = db.rawQuery(" select id from user where nom =('"+nom+"') and (typ='"+typ+"') and (lisibilité = '3')   " , null) ;
        arrayList.add(c.getCount());
        c = db.rawQuery(" select id from user where nom =('"+nom+"') and (typ='"+typ+"') and (lisibilité = '2')   " , null) ;
        arrayList.add(c.getCount());
        c = db.rawQuery(" select id from user where nom =('"+nom+"') and (typ='"+typ+"') and (lisibilité = '1')   " , null) ;
        arrayList.add(c.getCount());


        return arrayList ;

    }

    public  ArrayList expérience( String nom , String typ ){

        ArrayList<Integer> arrayList = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = db.rawQuery(" select id from user where nom =('"+nom+"') and (typ='"+typ+"') and (expérience = '5')   " , null) ;
        arrayList.add(c.getCount());
        c = db.rawQuery(" select id from user where nom =('"+nom+"') and (typ='"+typ+"') and (expérience = '4')   " , null) ;
        arrayList.add(c.getCount());
        c = db.rawQuery(" select id from user where nom =('"+nom+"') and (typ='"+typ+"') and (expérience = '3')   " , null) ;
        arrayList.add(c.getCount());
        c = db.rawQuery(" select id from user where nom =('"+nom+"') and (typ='"+typ+"') and (expérience = '2')   " , null) ;
        arrayList.add(c.getCount());
        c = db.rawQuery(" select id from user where nom =('"+nom+"') and (typ='"+typ+"') and (expérience = '1')   " , null) ;
        arrayList.add(c.getCount());


        return arrayList ;

    }

    public  ArrayList message( String nom , String typ ){

        ArrayList<Integer> arrayList = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = db.rawQuery(" select id from user where nom =('"+nom+"') and (typ='"+typ+"') and (message = '5')   " , null) ;
        arrayList.add(c.getCount());
        c = db.rawQuery(" select id from user where nom =('"+nom+"') and (typ='"+typ+"') and (message = '4')   " , null) ;
        arrayList.add(c.getCount());
        c = db.rawQuery(" select id from user where nom =('"+nom+"') and (typ='"+typ+"') and (message = '3')   " , null) ;
        arrayList.add(c.getCount());
        c = db.rawQuery(" select id from user where nom =('"+nom+"') and (typ='"+typ+"') and (message = '2')   " , null) ;
        arrayList.add(c.getCount());
        c = db.rawQuery(" select id from user where nom =('"+nom+"') and (typ='"+typ+"') and (message = '1')   " , null) ;
        arrayList.add(c.getCount());


        return arrayList ;

    }

    public  ArrayList controle( String nom , String typ ){

        ArrayList<Integer> arrayList = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = db.rawQuery(" select id from user where nom =('"+nom+"') and (typ='"+typ+"') and (controle = '5')   " , null) ;
        arrayList.add(c.getCount());
        c = db.rawQuery(" select id from user where nom =('"+nom+"') and (typ='"+typ+"') and (controle = '4')   " , null) ;
        arrayList.add(c.getCount());
        c = db.rawQuery(" select id from user where nom =('"+nom+"') and (typ='"+typ+"') and (controle = '3')   " , null) ;
        arrayList.add(c.getCount());
        c = db.rawQuery(" select id from user where nom =('"+nom+"') and (typ='"+typ+"') and (controle = '2')   " , null) ;
        arrayList.add(c.getCount());
        c = db.rawQuery(" select id from user where nom =('"+nom+"') and (typ='"+typ+"') and (controle = '1')   " , null) ;
        arrayList.add(c.getCount());


        return arrayList ;

    }

    public  ArrayList action( String nom , String typ ){

        ArrayList<Integer> arrayList = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = db.rawQuery(" select id from user where nom =('"+nom+"') and (typ='"+typ+"') and (action = '5')   " , null) ;
        arrayList.add(c.getCount());
        c = db.rawQuery(" select id from user where nom =('"+nom+"') and (typ='"+typ+"') and (action = '4')   " , null) ;
        arrayList.add(c.getCount());
        c = db.rawQuery(" select id from user where nom =('"+nom+"') and (typ='"+typ+"') and (action = '3')   " , null) ;
        arrayList.add(c.getCount());
        c = db.rawQuery(" select id from user where nom =('"+nom+"') and (typ='"+typ+"') and (action = '2')   " , null) ;
        arrayList.add(c.getCount());
        c = db.rawQuery(" select id from user where nom =('"+nom+"') and (typ='"+typ+"') and (action = '1')   " , null) ;
        arrayList.add(c.getCount());


        return arrayList ;

    }


    public  ArrayList homoginité( String nom , String typ ){

        ArrayList<Integer> arrayList = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = db.rawQuery(" select id from user where nom =('"+nom+"') and (typ='"+typ+"') and (homoginité = '5')   " , null) ;
        arrayList.add(c.getCount());
        c = db.rawQuery(" select id from user where nom =('"+nom+"') and (typ='"+typ+"') and (homoginité = '4')   " , null) ;
        arrayList.add(c.getCount());
        c = db.rawQuery(" select id from user where nom =('"+nom+"') and (typ='"+typ+"') and (homoginité = '3')   " , null) ;
        arrayList.add(c.getCount());
        c = db.rawQuery(" select id from user where nom =('"+nom+"') and (typ='"+typ+"') and (homoginité = '2')   " , null) ;
        arrayList.add(c.getCount());
        c = db.rawQuery(" select id from user where nom =('"+nom+"') and (typ='"+typ+"') and (homoginité = '1')   " , null) ;
        arrayList.add(c.getCount());


        return arrayList ;

    }

    public  ArrayList signification( String nom , String typ ){

        ArrayList<Integer> arrayList = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = db.rawQuery(" select id from user where nom =('"+nom+"') and (typ='"+typ+"') and (signification = '5')   " , null) ;
        arrayList.add(c.getCount());
        c = db.rawQuery(" select id from user where nom =('"+nom+"') and (typ='"+typ+"') and (signification = '4')   " , null) ;
        arrayList.add(c.getCount());
        c = db.rawQuery(" select id from user where nom =('"+nom+"') and (typ='"+typ+"') and (signification = '3')   " , null) ;
        arrayList.add(c.getCount());
        c = db.rawQuery(" select id from user where nom =('"+nom+"') and (typ='"+typ+"') and (signification = '2')   " , null) ;
        arrayList.add(c.getCount());
        c = db.rawQuery(" select id from user where nom =('"+nom+"') and (typ='"+typ+"') and (signification = '1')   " , null) ;
        arrayList.add(c.getCount());


        return arrayList ;

    }

    public  ArrayList compatibilite( String nom , String typ ){

        ArrayList<Integer> arrayList = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = db.rawQuery(" select id from user where nom =('"+nom+"') and (typ='"+typ+"') and (compatibilite = '5')   " , null) ;
        arrayList.add(c.getCount());
        c = db.rawQuery(" select id from user where nom =('"+nom+"') and (typ='"+typ+"') and (compatibilite = '4')   " , null) ;
        arrayList.add(c.getCount());
        c = db.rawQuery(" select id from user where nom =('"+nom+"') and (typ='"+typ+"') and (compatibilite = '3')   " , null) ;
        arrayList.add(c.getCount());
        c = db.rawQuery(" select id from user where nom =('"+nom+"') and (typ='"+typ+"') and (compatibilite = '2')   " , null) ;
        arrayList.add(c.getCount());
        c = db.rawQuery(" select id from user where nom =('"+nom+"') and (typ='"+typ+"') and (compatibilite = '1')   " , null) ;
        arrayList.add(c.getCount());


        return arrayList ;

    }

    public ArrayList incitation( String nom , String typ ){

        ArrayList<Float> arrayList = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = db.rawQuery("select incitation from user where (nom='"+nom+"') and (typ='"+typ+"' ) "  , null) ;
        while (c.moveToNext()){

            arrayList.add(c.getFloat(c.getColumnIndex("incitation"))) ;
        }

        return  arrayList ;

    }

    public ArrayList feedbac( String nom , String typ ){

        ArrayList<Float> arrayList = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = db.rawQuery("select feedbac from user where (nom='"+nom+"') and (typ='"+typ+"' ) "  , null) ;
        while (c.moveToNext()){

            arrayList.add(c.getFloat(c.getColumnIndex("feedbac"))) ;
        }

        return  arrayList ;

    }

    public ArrayList brièvité( String nom , String typ ){

        ArrayList<Float> arrayList = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = db.rawQuery("select brièvité from user where (nom='"+nom+"') and (typ='"+typ+"' ) "  , null) ;
        while (c.moveToNext()){

            arrayList.add(c.getFloat(c.getColumnIndex("brièvité"))) ;
        }

        return  arrayList ;

    }

    public ArrayList densité( String nom , String typ ){

        ArrayList<Float> arrayList = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = db.rawQuery("select densité from user where (nom='"+nom+"') and (typ='"+typ+"' ) "  , null) ;
        while (c.moveToNext()){

            arrayList.add(c.getFloat(c.getColumnIndex("densité"))) ;
        }

        return  arrayList ;

    }

    public ArrayList erruer( String nom , String typ ){

        ArrayList<Float> arrayList = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = db.rawQuery("select erruer from user where (nom='"+nom+"') and (typ='"+typ+"' ) "  , null) ;
        while (c.moveToNext()){

            arrayList.add(c.getFloat(c.getColumnIndex("erruer"))) ;
        }

        return  arrayList ;

    }

    public ArrayList correction( String nom , String typ ){

        ArrayList<Float> arrayList = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = db.rawQuery("select incitation from user where (nom='"+nom+"') and (typ='"+typ+"' ) "  , null) ;
        while (c.moveToNext()){

            arrayList.add(c.getFloat(c.getColumnIndex("incitation"))) ;
        }

        return  arrayList ;

    }



}
