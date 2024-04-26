package com.example.projetoapp2ni;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ResultadoFinanceiroActivity extends FinanceiroActivity {

    TextView textViewResult;
    Button buttonBackToMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_resultado_financeiro);

        textViewResult = findViewById(R.id.textViewResult);
        buttonBackToMain = findViewById(R.id.buttonBackToMain);

        // Recupera o resultado da Intent
        double netSalary = getIntent().getDoubleExtra("NET_SALARY", 0.0);

        // Exibe o resultado no TextView
        textViewResult.setText(String.format("Salário Líquido: R$ %.2f", netSalary));

        // Define o OnClickListener para o botão
        buttonBackToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Volta para a PaginaInicialActivity
                Intent intent = new Intent(ResultadoFinanceiroActivity.this, com.example.projetoapp2ni.MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); // Limpa a pilha de activities
                startActivity(intent);
                finish(); // Finaliza a ResultadoFinanceiroActivity
            }
        });
    }
}
