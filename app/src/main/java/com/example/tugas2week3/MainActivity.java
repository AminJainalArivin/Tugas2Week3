package com.example.tugas2week3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnCatMin, btnCatTem, btnCatAnti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCatMin = findViewById(R.id.btnCatMin);
        btnCatTem = findViewById(R.id.btnCatTem);
        btnCatAnti = findViewById(R.id.btnCatAnti);

        btnCatMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Cat1 = new Intent(getApplicationContext(), CatMinyak.class);
                startActivity(Cat1);
            }
        });

        btnCatTem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Cat2 = new Intent(getApplicationContext(), CatTembok.class);
                startActivity(Cat2);
            }
        });

        btnCatAnti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Cat3 = new Intent(getApplicationContext(), CatAnti.class);
                startActivity(Cat3);
            }
        });

    }

}