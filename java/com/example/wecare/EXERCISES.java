package com.example.wecare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EXERCISES extends AppCompatActivity {
    Button btn1,btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercises);

        btn1 = findViewById(R.id.breath);
        btn2 = findViewById(R.id.yoga);
        btn3 = findViewById(R.id.chill);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent (getApplicationContext(), Breathing.class);
                startActivity(int1);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2 = new Intent (getApplicationContext(), Do_yoga.class);
                startActivity(int2);
            }
        });

    }
}