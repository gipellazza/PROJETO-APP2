package com.example.projetoapp2ni;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button buttonFinanceiro, buttonSaude, buttonEducacao, buttonSalario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonFinanceiro = findViewById(R.id.buttonFinanceiro);
        buttonSaude = findViewById(R.id.buttonSaude);
        buttonEducacao = findViewById(R.id.buttonEducacao);
        buttonSalario = findViewById(R.id.buttonFinanceiro);

        buttonFinanceiro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,FinanceiroActivity.class);
                startActivity(intent);
            }
        });

        buttonSaude.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SaudeActivity.class);
                startActivity(intent);
            }
        });

        buttonEducacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EducacaoActivity.class);
                startActivity(intent);
            }
        });

    }
}
