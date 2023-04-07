package com.abhisheksawant.FitnessGuide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cali_beg13_vi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cali_beg13_vi);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button b13via = (Button) findViewById(R.id.b13via);
        b13via.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cali_beg13_vi.this, AirSquats.class);
                startActivity(intent);
            }
        });
        Button b13vib = (Button) findViewById(R.id.b13vib);
        b13vib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cali_beg13_vi.this,walking_lunges.class);
                startActivity(intent);
            }
        });
        Button b13vic = (Button) findViewById(R.id.b13vic);
        b13vic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cali_beg13_vi.this,archer_squats.class);
                startActivity(intent);
            }
        });
        Button b13vid = (Button) findViewById(R.id.b13vid);
        b13vid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cali_beg13_vi.this,single_leg_box_squat.class);
                startActivity(intent);
            }
        });
        Button b13vie = (Button) findViewById(R.id.b13vie);
        b13vie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cali_beg13_vi.this,single_leg_calf_raise.class);
                startActivity(intent);
            }
        });
        Button b13vif = (Button) findViewById(R.id.b13vif);
        b13vif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cali_beg13_vi.this,drinking_bird.class);
                startActivity(intent);
            }
        });
        Button b13vig = (Button) findViewById(R.id.b13vig);
        b13vig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cali_beg13_vi.this,single_leg_glute_bridge.class);
                startActivity(intent);
            }
        });

    }
}
