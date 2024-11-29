package com.example.milenem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Competencias extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_competencias);

        Button btnComp1 = findViewById(R.id.btnComp1);
        btnComp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent competencia1Activity = new Intent(getApplicationContext(),competencia1Activity.class);
                startActivity(competencia1Activity);
            }
        });
        Button btnComp2 = findViewById(R.id.btnComp2);
        btnComp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent competencia2activity = new Intent(getApplicationContext(),competencia2activity.class);
                startActivity(competencia2activity);
            }
        });
        Button btnComp3 = findViewById(R.id.btnComp3);
        btnComp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent competencia3Activity = new Intent(getApplicationContext(),competencia3Activity.class);
                startActivity(competencia3Activity);
            }
        });
        Button btnComp4 = findViewById(R.id.btnComp4);
        btnComp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent competencia4Activity = new Intent(getApplicationContext(),competencia4Activity.class);
                startActivity(competencia4Activity);
            }
        });
        Button btnComp5 = findViewById(R.id.btnComp5);
        btnComp5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent competencia5Activity = new Intent(getApplicationContext(),competencia5Activity.class);
                startActivity(competencia5Activity);
            }
        });
    }
}