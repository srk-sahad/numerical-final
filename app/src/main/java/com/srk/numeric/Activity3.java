package com.srk.numeric;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Activity3 extends AppCompatActivity {
    private Button btn9;
    private Button btn10;
    private Button btn11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        btn9 = (Button) findViewById(R.id.btn9);
        btn10 = (Button) findViewById(R.id.btn10);
        btn11= (Button) findViewById(R.id.btn11);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!btn9.isPressed()) {
                    btn9.setText("Your answer is wrong!");
                }
                if (btn9.getText().toString().trim().equals("on")) {
                    btn9.setText("off");
                    Toast.makeText(getBaseContext(), "fan is on", Toast.LENGTH_SHORT).show();
                } else if (btn9.getText().toString().trim().equals("off")) {
                    btn9.setText("on");
                    Toast.makeText(getBaseContext(), "fan  is off", Toast.LENGTH_SHORT).show();
                }
            }

        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!btn10.isPressed()) {
                    btn10.setText("Your answer is wrong!");
                }
                if (btn10.getText().toString().trim().equals("off")) {
                    btn10.setText("on");
                    Toast.makeText(getBaseContext(), "light is off", Toast.LENGTH_SHORT).show();
                } else if (btn10.getText().toString().trim().equals("on")) {
                    btn10.setText("off");
                    Toast.makeText(getBaseContext(), "light  is on", Toast.LENGTH_SHORT).show();
                }
            }

        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!btn11.isPressed()) {
                    btn11.setText("Your answer is wrong!");
                }
                if (btn11.getText().toString().trim().equals("off")) {
                    btn11.setText("on");
                    Toast.makeText(getBaseContext(), "power socket is off", Toast.LENGTH_SHORT).show();
                } else if (btn11.getText().toString().trim().equals("on")) {
                    btn11.setText("off");
                    Toast.makeText(getBaseContext(), "power socket  is on", Toast.LENGTH_SHORT).show();
                }
            }

        });
    }
}
