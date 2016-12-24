package com.example.ivona.sabracajba;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.TableLayout;
import android.view.View;
import android.view.LayoutInflater;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import klase.kazna_klasa;

/**
 * Created by Ivona on 13.12.2016..
 */


public class tabela extends AppCompatActivity {

    private TableLayout tableLayout;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabela);
        tableLayout=(TableLayout)findViewById(R.id.tableLayout);
        ArrayList<kazna_klasa> kazne = new ArrayList<kazna_klasa>();
        String JMBG = getIntent().getStringExtra("JMBG");
        String datum = "December 20, 2016";
        try {
            kazne.add(new kazna_klasa("1612994395008", "M43-O-659", "zatamnjena stakla", new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(datum), (double) 20,true));
            kazne.add(new kazna_klasa("1612994395008", "M43-O-659","ne posjeduje oznaku P", new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(datum), (double) 20, false));
            kazne.add(new kazna_klasa("1612994395008", "M43-O-659", "zatamnjena stakla", new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(datum), (double) 20,true));
            kazne.add(new kazna_klasa("1412994395008", "M43-O-659","ne posjeduje oznaku P", new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(datum), (double) 20, false));
            kazne.add(new kazna_klasa("1412994395008", "M43-O-659", "Neodzvoljene radnje u saobracaju", new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(datum), (double) 20,true));
            kazne.add(new kazna_klasa("1412994395008", "M43-E-096","Neodzvoljene radnje u saobracaju", new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(datum), (double) 20, false));
            kazne.add(new kazna_klasa("1412994395008", "M43-E-096", "Ne posjeduje opremu", new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(datum), (double) 20,true));
            kazne.add(new kazna_klasa("1412994395008", "M43-E-096","ne posjeduje oznaku P", new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(datum), (double) 20, false));
            kazne.add(new kazna_klasa("1612994395008", "M43-E-096", "zatamnjena stakla", new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(datum), (double) 20,true));
            kazne.add(new kazna_klasa("1612994395008", "M43-E-096","ne posjeduje oznaku P", new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(datum), (double) 20, false));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //zaglavlje
        View tableRow = LayoutInflater.from(this).inflate(R.layout.table_item,null,false);
        TextView Broj_tablice  = (TextView) tableRow.findViewById(R.id.Broj_tablice);
        TextView Iznos  = (TextView) tableRow.findViewById(R.id.Iznos);
        TextView Datum  = (TextView) tableRow.findViewById(R.id.Datum);
        TextView Placeno  = (TextView) tableRow.findViewById(R.id.Placeno);


        Broj_tablice.setText("Broj tabl");
        Iznos.setText("Iznos");
        Datum.setText("Datum");
         {Placeno.setText("Plaćeno");}
        tableLayout.addView(tableRow);

        double Suma = 0;
        int brojac = 0;
        for (int i=0;i<kazne.size();i++){
            brojac++;
            if(kazne.get(i).getPlaceno()==false){
                Suma += kazne.get(i).getIznosDbl();
            }

             String jb = kazne.get(i).getJMBG();
             if(jb.equals(JMBG)){
             tableRow = LayoutInflater.from(this).inflate(R.layout.table_item,null,false);
             Broj_tablice  = (TextView) tableRow.findViewById(R.id.Broj_tablice);
             Iznos  = (TextView) tableRow.findViewById(R.id.Iznos);
             Datum  = (TextView) tableRow.findViewById(R.id.Datum);
             Placeno  = (TextView) tableRow.findViewById(R.id.Placeno);

            Broj_tablice.setText(kazne.get(i).getBrojtablice());
            Iznos.setText(kazne.get(i).getIznos());
            Datum.setText(kazne.get(i).getDatum().toString());
            if(kazne.get(i).getPlaceno()==true) {Placeno.setText("DA");}
            else {Placeno.setText("NE");}
            tableLayout.addView(tableRow);}
        }
        if (brojac == 0){


        }
    }



}
