package com.example.projetoapp2ni;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ResultadoSaudeActivity extends SaudeActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_saude);

        Button btnVoltarParaInicio = findViewById(R.id.btn_voltar);
        btnVoltarParaInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Criar um Intent para abrir a PaginaInicialActivity
                Intent intent = new Intent(ResultadoSaudeActivity.this, MainActivity.class);
                // Iniciar a PaginaInicialActivity
                startActivity(intent);
                // Finalizar a ResultadoSaudeActivity para remover da pilha de atividades
                finish();
            }
        });
    }
}


