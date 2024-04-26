package com.example.projetoapp2ni;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;



public class SaudeActivity extends AppCompatActivity {
    private EditText weightEditText, heightEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saude);

        weightEditText = findViewById(R.id.edit_text_weight);
        heightEditText = findViewById(R.id.edit_text_height);
    }

    public void calcularIMC(View view) {
        String weightStr = weightEditText.getText().toString();
        String heightStr = heightEditText.getText().toString();

        if (!weightStr.isEmpty() && !heightStr.isEmpty()) {
            double weight = Double.parseDouble(weightStr);
            double height = Double.parseDouble(heightStr) / 100; // Convertendo para metros

            double imc = weight / (height * height);

            Intent intent = new Intent(this, ResultadoSaudeActivity.class);
            intent.putExtra("IMC", imc);
            intent.putExtra("Peso", weight);
            intent.putExtra("Altura", height);
            startActivity(intent);
        }
    }
}
