package com.example.tugas2week3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class CatTembok extends AppCompatActivity {

     RadioButton rbTnipon, rbTdulux, rbTdulux2, rbTavitex, rbTnipon2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_tembok);

        rbTnipon = findViewById(R.id.rbTnipon);
        rbTdulux = findViewById(R.id.rbTdulux);
        rbTdulux2 = findViewById(R.id.rbTdulux2);
        rbTavitex = findViewById(R.id.rbTavitex);
        rbTnipon2 = findViewById(R.id.rbTnipon2);

        rbTnipon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent DetT1 = new Intent(getApplicationContext(), DetailTembok.class);
                startActivity(DetT1);
            }
        });
        rbTdulux.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent DetT2 = new Intent(getApplicationContext(), DetailTembok.class);
                startActivity(DetT2);
            }
        });
        rbTdulux2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent DetT3 = new Intent(getApplicationContext(), DetailTembok.class);
                startActivity(DetT3);
            }
        });
        rbTavitex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent DetT4 = new Intent(getApplicationContext(), DetailTembok.class);
                startActivity(DetT4);
            }
        });
        rbTnipon2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent DetT5 = new Intent(getApplicationContext(), DetailTembok.class);
                startActivity(DetT5);
            }
        });
    }
}