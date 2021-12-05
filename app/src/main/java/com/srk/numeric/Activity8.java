package com.srk.numeric;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Activity8 extends AppCompatActivity {
    private Spinner spinner2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_8);
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        Spinner dropdown = findViewById(R.id.spinner2);
        String[] items = new String[]{"room 1 ", "room 2", "kitchen"};
        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);
    }
}