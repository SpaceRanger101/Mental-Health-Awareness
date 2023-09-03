package com.example.wecare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class FEMALES extends AppCompatActivity {
    Button btn1,btn2, btn3,btn4,btn5,btn6,btn7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_females);

        btn1= findViewById(R.id.anxiety);
        btn2= findViewById(R.id.angry_btn2);
        btn3=findViewById(R.id.angry_btn3);
        btn4=findViewById(R.id.angry_btn4);
        btn5=findViewById(R.id.angry_btn6);
        btn6=findViewById(R.id.angry_btn);
        btn7=findViewById(R.id.angry_btn5);

        btn1.setOnClickListener(view -> {
            Intent int1=new Intent(FEMALES.this,ANXIETY.class );
            startActivity(int1);



        });
        btn2.setOnClickListener(view -> {
            Intent int2=new Intent(FEMALES.this,STRESS.class );
            startActivity(int2);

        });

        btn3.setOnClickListener(view -> {
            Intent int3=new Intent(FEMALES.this,Depression.class );
            startActivity(int3);

        });
        btn4.setOnClickListener(view -> {
            Intent int4 = new Intent(FEMALES.this, PTSD.class);
            startActivity(int4);
        });
        btn5.setOnClickListener(view -> {
            Intent int5 = new Intent(FEMALES.this, SCHIZOPHRENIA.class);
            startActivity(int5);
        });
        btn6.setOnClickListener(view -> {
            Intent int6= new Intent(FEMALES.this, BipolarOG.class); //hold
            startActivity(int6);
        });

        btn7.setOnClickListener(view -> {
            Intent int7 = new Intent(FEMALES.this, OCD.class);
            startActivity(int7);
        });
    }
}