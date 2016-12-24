package com.example.ivona.sabracajba;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
/**
 * Created by Ivona on 11.12.2016..
 */
import java.util.Random;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.app.Activity;
import android.widget.EditText;
import android.widget.TextView;
import klase.kazna_klasa;

import org.w3c.dom.Text;

import java.lang.String;
import java.util.Date;

public class registar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registar);

        Button next = (Button) findViewById(R.id.izlistajKazne);
        next.setOnClickListener(new View.OnClickListener() {

                public void onClick(View view) {
                    EditText broj = (EditText) findViewById(R.id.JMBG);
                    String jmbg = broj.getText().toString();


                    Intent myIntent = new Intent(view.getContext(), tabela.class);
                    myIntent.putExtra("JMBG", jmbg);
                    startActivityForResult(myIntent, 0);


                }
           /* public void onClick(View view) {
               EditText JMBG = (EditText)findViewById(R.id.JMBG);
                String jmbgS = JMBG.getText().toString();
                String ivona = "1612994395008";
                if(jmbgS.equals(ivona)){

                }
                kazna_klasa k = new kazna_klasa("1612994395008", "opis", new Date(), 54.0);
                Button next = (Button) findViewById(R.id.izlistajKazne);



            }*/

        });


    }



}
