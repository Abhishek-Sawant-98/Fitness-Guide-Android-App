package com.abhisheksawant.FitnessGuide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class gym9_iii extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gym9_iii);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button b9iiia = (Button) findViewById(R.id.b9iiia);
        b9iiia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(gym9_iii.this,isolation_intro.class);
                startActivity(intent);
            }
        });
        Button b9iiib = (Button) findViewById(R.id.b9iiib);
        b9iiib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(gym9_iii.this, Biceps.class);
                startActivity(intent);
            }
        });
        Button b9iiic = (Button) findViewById(R.id.b9iiic);
        b9iiic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(gym9_iii.this,triceps.class);
                startActivity(intent);
            }
        });
        Button b9iiid = (Button) findViewById(R.id.b9iiid);
        b9iiid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(gym9_iii.this,deltoids.class);
                startActivity(intent);
            }
        });
        Button b9iiie = (Button) findViewById(R.id.b9iiie);
        b9iiie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(gym9_iii.this,chest.class);
                startActivity(intent);
            }
        });
        Button b9iiif = (Button) findViewById(R.id.b9iiif);
        b9iiif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(gym9_iii.this,traps.class);
                startActivity(intent);
            }
        });
        Button b9iiig = (Button) findViewById(R.id.b9iiig);
        b9iiig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(gym9_iii.this,glutes.class);
                startActivity(intent);
            }
        });
        Button b9iiih = (Button) findViewById(R.id.b9iiih);
        b9iiih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(gym9_iii.this,quads.class);
                startActivity(intent);
            }
        });
        Button b9iii_i = (Button) findViewById(R.id.b9iii_i);
        b9iii_i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(gym9_iii.this,hams.class);
                startActivity(intent);
            }
        });
        Button b9iiij = (Button) findViewById(R.id.b9iiij);
        b9iiij.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(gym9_iii.this, Calves.class);
                startActivity(intent);
            }
        });
    }
}
