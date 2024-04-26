package com.example.projetoapp2ni;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultadoEducacaoActivity extends AppCompatActivity {
    private TextView resultadoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_educacao);

        resultadoTextView = findViewById(R.id.resultadoTextView);

        double media = getIntent().getDoubleExtra("media", 0.0);
        String resultado = getIntent().getStringExtra("resultado");

        resultadoTextView.setText("Média: " + media + "\nStatus: " + resultado);
    }

    public void voltarParaMenuPrincipal(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); // Limpa todas as atividades na pilha
        startActivity(intent);
        finish(); // Finaliza esta atividade para que não possa ser acessada pressionando o botão "voltar"
    }
}
