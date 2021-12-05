package com.srk.numeric;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {
    private Button btn6;
    private Button btn7;
    private Button btn8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!btn6.isPressed()) {
                    btn6.setText("Your answer is wrong!");
                }
                if (btn6.getText().toString().trim().equals("on")) {
                    btn6.setText("off");
                    Toast.makeText(getBaseContext(), "fan is on", Toast.LENGTH_SHORT).show();
                } else if (btn6.getText().toString().trim().equals("off")) {
                    btn6.setText("on");
                    Toast.makeText(getBaseContext(), "fan  is off", Toast.LENGTH_SHORT).show();
                }
            }

        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!btn7.isPressed()) {
                    btn7.setText("Your answer is wrong!");
                }
                if (btn7.getText().toString().trim().equals("on")) {
                    btn7.setText("off");
                    Toast.makeText(getBaseContext(), "light is on", Toast.LENGTH_SHORT).show();
                } else if (btn7.getText().toString().trim().equals("off")) {
                    btn7.setText("on");
                    Toast.makeText(getBaseContext(), "light  is off", Toast.LENGTH_SHORT).show();
                }
            }

        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!btn8.isPressed()) {
                    btn8.setText("Your answer is wrong!");
                }
                if (btn8.getText().toString().trim().equals("on")) {
                    btn8.setText("off");
                    Toast.makeText(getBaseContext(), "power socket is on", Toast.LENGTH_SHORT).show();
                } else if (btn8.getText().toString().trim().equals("off")) {
                    btn8.setText("on");
                    Toast.makeText(getBaseContext(), "power socket  is off", Toast.LENGTH_SHORT).show();
                }
            }

        });
    }
}