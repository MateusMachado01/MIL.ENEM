package com.example.milenem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class redacoesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redacoes);

        Button BtnRed1 = findViewById(R.id.btnRed1);
                BtnRed1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent Redacao = new Intent(getApplicationContext(),Redacao.class);
                        startActivity(Redacao);
                    }
                });
        Button BtnRed2 = findViewById(R.id.btnRed2);
        BtnRed2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent redacao22Activity = new Intent(getApplicationContext(),redacao22Activity.class );
                startActivity(redacao22Activity);
            }
        });
        Button BtnRed3 = findViewById(R.id.btnRed3);
        BtnRed3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent redacao3Activity = new Intent(getApplicationContext(),redacao3Activity.class);
                startActivity(redacao3Activity);
            }
        });
    }
}