package com.example.milenem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnRed = findViewById(R.id.btnRed);
        btnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Redacoes = new Intent(getApplicationContext(),redacoesActivity.class);
                        startActivity(Redacoes);
            }
        });
        Button btnProva = findViewById(R.id.btnProva);
        btnProva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Prova = new Intent(getApplicationContext(),Prova.class);
                        startActivity(Prova);
            }
        });
        Button btnComp = findViewById(R.id.btnComp);
        btnComp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Competencias = new Intent(getApplicationContext(),Competencias.class);
                startActivity(Competencias);
            }
        });
        Button btnDicas = findViewById(R.id.btnDicas);
        btnDicas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Dicas = new Intent(getApplicationContext(),Dicas.class);
                startActivity(Dicas);
            }
        });
        Button btnSair = findViewById(R.id.btnSair);
        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                finishAffinity();
            }
        });
    }
}
