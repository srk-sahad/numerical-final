package com.srk.numeric;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Activity4 extends AppCompatActivity {
    private Button btn12;
    private Button btn13;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
        btn12= (Button) findViewById(R.id.btn12) ;
        btn13= (Button) findViewById(R.id.btn13) ;
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!btn13.isPressed()) {
                    btn13.setText("Your answer is wrong!");
                }
                if (btn13.getText().toString().trim().equals("on")) {
                    btn13.setText("off");
                    Toast.makeText(getBaseContext(), "fridge is on", Toast.LENGTH_SHORT).show();
                } else if (btn13.getText().toString().trim().equals("off")) {
                    btn13.setText("on");
                    Toast.makeText(getBaseContext(), "fridge is off", Toast.LENGTH_SHORT).show();
                }
            }

        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!btn12.isPressed()) {
                    btn12.setText("Your answer is wrong!");
                }
                if (btn12.getText().toString().trim().equals("on")) {
                    btn12.setText("off");
                    Toast.makeText(getBaseContext(), "light is on", Toast.LENGTH_SHORT).show();
                } else if (btn12.getText().toString().trim().equals("off")) {
                    btn12.setText("on");
                    Toast.makeText(getBaseContext(), "light  is off", Toast.LENGTH_SHORT).show();
                }
            }

        });
    }
}