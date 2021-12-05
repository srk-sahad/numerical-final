package com.srk.numeric;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Activity1 extends AppCompatActivity {
    private Button btn3;
    private Button btn4;
    private Button btn5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        ConstraintLayout constraintLayout =  findViewById(R.id.layout2) ;
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();
        btn5= (Button) findViewById(R.id.btn5);

        btn4 = (Button) findViewById(R.id.btn4);
        btn3 = (Button) findViewById(R.id.btn3);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity5();
            }
        });


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!btn3.isPressed()) {
                    btn3.setText("Your answer is wrong!");
                }
                if (btn3.getText().toString().trim().equals("off")) {
                    btn3.setText("on");
                    Toast.makeText(getBaseContext(), "fan is off", Toast.LENGTH_SHORT).show();
                } else if (btn3.getText().toString().trim().equals("on")) {
                    btn3.setText("off");
                    Toast.makeText(getBaseContext(), "fan  is on", Toast.LENGTH_SHORT).show();
                }
            }

        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!btn4.isPressed()) {
                    btn4.setText("Your answer is wrong!");
                }
                if (btn4.getText().toString().trim().equals("off")) {
                    btn4.setText("on");
                    Toast.makeText(getBaseContext(), "light is off", Toast.LENGTH_SHORT).show();
                } else if (btn4.getText().toString().trim().equals("on")) {
                    btn4.setText("off");
                    Toast.makeText(getBaseContext(), "light  is on", Toast.LENGTH_SHORT).show();
                }
            }

        });
    }
    public void openActivity5() {
        Intent intent = new Intent(this, Activity5.class);
        startActivity(intent);
    }
}