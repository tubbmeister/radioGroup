package com.example.richa_000.radiogroup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Statistics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.statistics);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
