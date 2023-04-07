package com.abhisheksawant.FitnessGuide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class gym9_ii extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gym9_ii);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button b9iia = (Button) findViewById(R.id.b9iia);
        b9iia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(gym9_ii.this,comp_exer_intro.class);
                startActivity(intent);
            }
        });
        Button b9iib = (Button) findViewById(R.id.b9iib);
        b9iib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(gym9_ii.this,deadlifts.class);
                startActivity(intent);
            }
        });
        Button b9iic = (Button) findViewById(R.id.b9iic);
        b9iic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(gym9_ii.this,barbell_squats.class);
                startActivity(intent);
            }
        });
        Button b9iid = (Button) findViewById(R.id.b9iid);
        b9iid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(gym9_ii.this,lunges.class);
                startActivity(intent);
            }
        });
        Button b9iie = (Button) findViewById(R.id.b9iie);
        b9iie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(gym9_ii.this, BenchPress.class);
                startActivity(intent);
            }
        });
        Button b9iif = (Button) findViewById(R.id.b9iif);
        b9iif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(gym9_ii.this, OHP.class);
                startActivity(intent);
            }
        });
        Button b9iig = (Button) findViewById(R.id.b9iig);
        b9iig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(gym9_ii.this, BarbellRows.class);
                startActivity(intent);
            }
        });
        Button b9iih = (Button) findViewById(R.id.b9iih);
        b9iih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(gym9_ii.this,latpulldown.class);
                startActivity(intent);
            }
        });

    }
}
