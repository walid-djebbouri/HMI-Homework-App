package com.zimaheka.merwan_walid.ihm_tp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.Iterator;

public class Main9Activity extends AppCompatActivity {

    BarChart bri ;
    LineChart lch ;
    int i = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        Bundle b = getIntent().getExtras() ;
        BDconnecte db = new BDconnecte(this) ;

        ArrayList<Integer>  arrayList = db.groupement(b.getString("nom") , b.getString("typ")) ;
        bri = (BarChart)findViewById(R.id.chart1);
        bri.getDescription().setEnabled(false);
        diagrame(arrayList);
        bri.setFitBars(true);

       arrayList = db.lisibilité(b.getString("nom") , b.getString("typ")) ;
        bri = (BarChart)findViewById(R.id.chart2);
        bri.getDescription().setEnabled(false);
        diagrame(arrayList);
        bri.setFitBars(true);

        arrayList = db.expérience(b.getString("nom") , b.getString("typ")) ;
        bri = (BarChart)findViewById(R.id.chart3);
        bri.getDescription().setEnabled(false);
        diagrame(arrayList);
        bri.setFitBars(true);

        arrayList = db.message(b.getString("nom") , b.getString("typ")) ;
        bri = (BarChart)findViewById(R.id.chart4);
        bri.getDescription().setEnabled(false);
        diagrame(arrayList);
        bri.setFitBars(true);

        arrayList = db.controle(b.getString("nom") , b.getString("typ")) ;
        bri = (BarChart)findViewById(R.id.chart5);
        bri.getDescription().setEnabled(false);
        diagrame(arrayList);
        bri.setFitBars(true);

        arrayList = db.action(b.getString("nom") , b.getString("typ")) ;
        bri = (BarChart)findViewById(R.id.chart6);
        bri.getDescription().setEnabled(false);
        diagrame(arrayList);
        bri.setFitBars(true);

        arrayList = db.homoginité(b.getString("nom") , b.getString("typ")) ;
        bri = (BarChart)findViewById(R.id.chart7);
        bri.getDescription().setEnabled(false);
        diagrame(arrayList);
        bri.setFitBars(true);

        arrayList = db.signification(b.getString("nom") , b.getString("typ")) ;
        bri = (BarChart)findViewById(R.id.chart8);
        bri.getDescription().setEnabled(false);
        diagrame(arrayList);
        bri.setFitBars(true);

        arrayList = db.compatibilite(b.getString("nom") , b.getString("typ")) ;
        bri = (BarChart)findViewById(R.id.chart9);
        bri.getDescription().setEnabled(false);
        diagrame(arrayList);
        bri.setFitBars(true);


        /******** Linchart float **********************/

        lch = (LineChart)findViewById(R.id.chart10);
        ArrayList<Float> arrayList1 = db.incitation(b.getString("nom") , b.getString("typ")) ;
        diagrame_float(arrayList1);

        lch = (LineChart)findViewById(R.id.chart11);
        arrayList1 = db.feedbac(b.getString("nom") , b.getString("typ")) ;
        diagrame_float(arrayList1);

        lch = (LineChart)findViewById(R.id.chart12);
        arrayList1 = db.brièvité(b.getString("nom") , b.getString("typ")) ;
        diagrame_float(arrayList1);

        lch = (LineChart)findViewById(R.id.chart13);
        arrayList1 = db.densité(b.getString("nom") , b.getString("typ")) ;
        diagrame_float(arrayList1);

        lch = (LineChart)findViewById(R.id.chart14);
        arrayList1 = db.erruer(b.getString("nom") , b.getString("typ")) ;
        diagrame_float(arrayList1);

        lch = (LineChart)findViewById(R.id.chart15);
        arrayList1 = db.correction(b.getString("nom") , b.getString("typ")) ;
        diagrame_float(arrayList1);










    }

       public  void  diagrame(ArrayList arrayList){

            ArrayList<BarEntry> values = new ArrayList<>() ;
            values.add(new BarEntry(5 , (int)arrayList.get(0)));
            values.add(new BarEntry(4 , (int)arrayList.get(1)));
            values.add(new BarEntry(3 , (int)arrayList.get(2)));
            values.add(new BarEntry(2 , (int)arrayList.get(3) ));
            values.add(new BarEntry(1 , (int)arrayList.get(4)));



            BarDataSet set = new BarDataSet(values,"") ;
            set.setColors(ColorTemplate.MATERIAL_COLORS);
            set.setDrawValues(true);

            BarData data = new BarData(set);
            bri.setData(data);
            bri.invalidate();
            bri.animateY(500);

        }

        public  void diagrame_float(ArrayList<Float> arrayList){

            int i =0 ;
            lch.setDragEnabled(true);
            lch.setScaleEnabled(false);
            ArrayList<Entry> arrayList1 = new ArrayList<>() ;
            Iterator<Float> et = arrayList.iterator();
            while (et.hasNext()){

                arrayList1.add( new Entry(i , et.next())) ;
                i++ ;
            }
            LineDataSet set = new LineDataSet(arrayList1 ,"") ;
            set.setFillAlpha(110);

            ArrayList<ILineDataSet> dataSets = new ArrayList<>() ;
            dataSets.add(set);

            LineData data = new LineData(dataSets) ;

            lch.setData(data);

        }


}
