package com.example.wecare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MALES extends AppCompatActivity {
    Button btn1, btn2,btn3,btn4,btn5,btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_males);

        btn1= findViewById(R.id.anxiety);
        btn2= findViewById(R.id.angry_btn2);
        btn3= findViewById(R.id.angry_btn3);
        btn4= findViewById(R.id.angry_btn4);
        btn5= findViewById(R.id.angry_btn5);
        btn6= findViewById(R.id.angry_btn);

        btn1.setOnClickListener(view -> {
            Intent int1=new Intent(MALES.this,anxiety_male.class );
            startActivity(int1);

        });

        btn2.setOnClickListener(view -> {
            Intent int2=new Intent(MALES.this,stress_male.class );
            startActivity(int2);
        });
        btn3.setOnClickListener(view -> {
            Intent int3=new Intent(MALES.this,depression_male.class );
            startActivity(int3);
        });
        btn4.setOnClickListener(view -> {
            Intent int4=new Intent(MALES.this,ptsd_male.class );
            startActivity(int4);
        });
        btn5.setOnClickListener(view -> {
            Intent int5=new Intent(MALES.this,bipolar_male.class );
            startActivity(int5);
        });
        btn6.setOnClickListener(view -> {
            Intent int6=new Intent(MALES.this,OCD.class );
            startActivity(int6);
        });

    }
    }