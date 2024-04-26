package com.example.projetoapp2ni;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class EducacaoActivity extends AppCompatActivity {
    private EditText nota1EditText;
    private EditText nota2EditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_educacao);

        nota1EditText = findViewById(R.id.nota1EditText);
        nota2EditText = findViewById(R.id.nota2EditText);
    }

    public void calcularMedia(View view) {
        double nota1 = Double.parseDouble(nota1EditText.getText().toString());
        double nota2 = Double.parseDouble(nota2EditText.getText().toString());
        double media = (nota1 + nota2) / 2;

        String resultado;
        if (media >= 6.0) {
            resultado = "Aprovado";
        } else {
            resultado = "Reprovado";
        }

        Intent intent = new Intent(this, ResultadoEducacaoActivity.class);
        intent.putExtra("media", media);
        intent.putExtra("resultado", resultado);
        startActivity(intent);
    }
}
