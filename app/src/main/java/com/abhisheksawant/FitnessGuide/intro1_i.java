package com.abhisheksawant.FitnessGuide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class intro1_i extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro1_i);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button b1ia = (Button) findViewById(R.id.b1ia);
        b1ia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(intro1_i.this,intro1ia.class);
                startActivity(intent);
            }
        });
        Button b1ib = (Button) findViewById(R.id.b1ib);
        b1ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(intro1_i.this, PhysicalFitness1ib.class);
                startActivity(intent);
            }
        });
        Button b1ic = (Button) findViewById(R.id.b1ic);
        b1ic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(intro1_i.this,mental_fitness1ic.class);
                startActivity(intent);
            }
        });
        Button b1id = (Button) findViewById(R.id.b1id);
        b1id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(intro1_i.this,social_fitness1id.class);
                startActivity(intent);
            }
        });
        Button b1ie = (Button) findViewById(R.id.b1ie);
        b1ie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(intro1_i.this,emotionfitness1ie.class);
                startActivity(intent);
            }
        });
        Button b1if = (Button) findViewById(R.id.b1if);
        b1if.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(intro1_i.this,spiritualfitness1if.class);
                startActivity(intent);
            }
        });

    }
}
