package com.example.wecare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

//import android.view.MenuItem;
//import androidx.annotation.NonNull;
//import com.google.android.material.bottomnavigation.BottomNavigationView;

//import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3,btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       // BottomNavigationView bottomNavigationView= findViewById(R.id.bottomnav);
        //bottomNavigationView.setSelectedItemId(R.id.firstFragment);

       // bottomNavigationView.setOnNavigationItemSelectedListener(@NonNull MenuItem );



        setContentView(R.layout.activity_main);
        btn1= findViewById(R.id.male);
        btn2= findViewById(R.id.female);
        btn3=findViewById(R.id.tips);
        btn4=findViewById(R.id.audio);


        btn1.setOnClickListener(view -> {
            Intent int1=new Intent(MainActivity.this,MALES.class );
            startActivity(int1);

        });

        btn2.setOnClickListener(view -> {
            Intent int2=new Intent(MainActivity.this,FEMALES.class );
            startActivity(int2);
        });

        btn3.setOnClickListener(view -> {
            Intent int3=new Intent(MainActivity.this,EXERCISES.class );
            startActivity(int3);
        });
        btn4.setOnClickListener(view -> {
            Intent int4=new Intent(MainActivity.this,Audio.class );
            startActivity(int4);

        });
    }
}