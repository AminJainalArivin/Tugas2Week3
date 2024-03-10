package com.example.tugas2week3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class CatAnti extends AppCompatActivity {

    RadioButton rbAdrop, rbAwel, rbAproof, rbAtop, rbAdulux;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_anti);

        rbAdrop = findViewById(R.id.rbAdrop);
        rbAwel = findViewById(R.id.rbAwel);
        rbAproof = findViewById(R.id.rbAproof);
        rbAtop = findViewById(R.id.rbAtop);
        rbAdulux = findViewById(R.id.rbAdulux);

        rbAdrop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent DetA1 = new Intent(getApplicationContext(), DetailAnti.class);
                startActivity(DetA1);
            }
        });
        rbAwel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent DetA2 = new Intent(getApplicationContext(), DetailAnti.class);
                startActivity(DetA2);
            }
        });
        rbAproof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent DetA3 = new Intent(getApplicationContext(), DetailAnti.class);
                startActivity(DetA3);
            }
        });
        rbAtop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent DetA4 = new Intent(getApplicationContext(), DetailAnti.class);
                startActivity(DetA4);
            }
        });
        rbAdulux.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent DetA5 = new Intent(getApplicationContext(), DetailAnti.class);
                startActivity(DetA5);
            }
        });
    }
}