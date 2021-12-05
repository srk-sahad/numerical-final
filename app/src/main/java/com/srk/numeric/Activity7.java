package com.srk.numeric;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Activity7 extends AppCompatActivity {
    private Spinner spi1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_7);
        spi1 = (Spinner) findViewById(R.id.spi1);
        Spinner dropdown = findViewById(R.id.spi1);
        String[] items = new String[]{"room 1 ", "room 2", "kitchen"};
        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);
    }
}