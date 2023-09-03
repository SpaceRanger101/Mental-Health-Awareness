package com.example.wecare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Audio extends AppCompatActivity {
    Button btn1, btn2, btn3,btn4,btn5,btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio);

        btn1= findViewById(R.id.audio1);
        btn2= findViewById(R.id.audio2);
        btn3= findViewById(R.id.audio3);
        btn4= findViewById(R.id.audio4);
        btn5= findViewById(R.id.audio5);
        btn6= findViewById(R.id.audio6);


        btn1.setOnClickListener(view -> {
            Intent int1=new Intent(Audio.this,Log.class );
            startActivity(int1);

        });

        btn2.setOnClickListener(view -> {
            Intent int2=new Intent(Audio.this,Grounding_one.class );
            startActivity(int2);

        });

        btn3.setOnClickListener(view -> {
            Intent int3=new Intent(Audio.this,grounding_two.class );
            startActivity(int3);

        });

        btn4.setOnClickListener(view -> {
            Intent int4=new Intent(Audio.this,grounding_three.class );
            startActivity(int4);

        });

        btn5.setOnClickListener(view -> {
            Intent int5=new Intent(Audio.this,unhooking.class );
            startActivity(int5);

        });

        btn6.setOnClickListener(view -> {
            Intent int6=new Intent(Audio.this,making_room.class );
            startActivity(int6);

        });
    }
}