package com.example.tugas2week3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class CatMinyak extends AppCompatActivity {

    RadioButton rbMmolwi, rbMavian, rbMprop, rbMprop2, rbMnipon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_minyak);

        rbMmolwi = findViewById(R.id.rbMmolwi);
        rbMavian = findViewById(R.id.rbMavian);
        rbMprop = findViewById(R.id.rbMprop);
        rbMprop2 = findViewById(R.id.rbMprop2);
        rbMnipon = findViewById(R.id.rbMnipon);

        rbMmolwi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent DetM1 = new Intent(getApplicationContext(), DetailMinyak.class);
                startActivity(DetM1);
            }
        });
        rbMavian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent DetM2 = new Intent(getApplicationContext(), DetailMinyak.class);
                startActivity(DetM2);
            }
        });
        rbMprop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent DetM3 = new Intent(getApplicationContext(), DetailMinyak.class);
                startActivity(DetM3);
            }
        });
        rbMprop2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent DetM4 = new Intent(getApplicationContext(), DetailMinyak.class);
                startActivity(DetM4);
            }
        });
        rbMnipon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent DetM5 = new Intent(getApplicationContext(), DetailMinyak.class);
                startActivity(DetM5);
            }
        });
    }
}