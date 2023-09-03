package com.example.wecare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Male_mental extends AppCompatActivity {
    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_male_mental);

        btn1= findViewById(R.id.anxiety2);
        btn2= findViewById(R.id.anxiety3);

        btn1.setOnClickListener(view -> {
            Intent int1=new Intent(Male_mental.this, OVERCOMING_stigma.class );
            startActivity(int1);
            finish();
        });

    }
}