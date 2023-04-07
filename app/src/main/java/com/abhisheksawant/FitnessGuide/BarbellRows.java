package com.abhisheksawant.FitnessGuide;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class BarbellRows extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barbellrows);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView t2 = (TextView) findViewById(R.id.barbellrows2);
        t2.setMovementMethod(LinkMovementMethod.getInstance());

        TextView t3 = (TextView) findViewById(R.id.barbellrows3);
        t3.setMovementMethod(LinkMovementMethod.getInstance());

        TextView t4 = (TextView) findViewById(R.id.barbellrows4);
        t4.setMovementMethod(LinkMovementMethod.getInstance());

        TextView t5 = (TextView) findViewById(R.id.barbellrows5);
        t5.setMovementMethod(LinkMovementMethod.getInstance());

        TextView t6 = (TextView) findViewById(R.id.barbellrows6);
        t6.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
