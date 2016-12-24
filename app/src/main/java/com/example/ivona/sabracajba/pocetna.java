package com.example.ivona.sabracajba;
import android.widget.Button;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;


public class pocetna extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pocetna);

        Button next = (Button) findViewById(R.id.Kazne);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), registar.class);
                startActivityForResult(myIntent, 0);
            }

        });

        Button ceste = (Button) findViewById(R.id.infoceste);
        ceste.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), info_ceste.class);
                startActivityForResult(myIntent, 0);
            }

        });

        Button info = (Button) findViewById(R.id.Info);

        info.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), servisne_info.class);
                startActivityForResult(myIntent, 0);
            }

        });



    }




}
