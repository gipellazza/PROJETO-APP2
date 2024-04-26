package com.example.projetoapp2ni;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class FinanceiroActivity extends MainActivity {

    EditText editTextSalary;
    Button buttonCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_financeiro);


        buttonCalculate = findViewById(R.id.buttonCalculate);
        editTextSalary = findViewById(R.id.inputsal);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateSalary();
            }
        });
    }

    public void setContentView(int activity_resultado_financeiro) {

    }

    private void calculateSalary() {
        double salary = Double.parseDouble(editTextSalary.getText().toString());

        // Cálculo do desconto do INSS
        double inssRate = 0.10; // 10%
        double inss = salary * inssRate;

        // Cálculo do desconto do FGTS
        double fgtsRate = 0.08; // 8%
        double fgts = salary * fgtsRate;

        // Salário líquido
        double netSalary = salary - inss;

        // Envio do resultado para a nova activity
        Intent intent = new Intent(FinanceiroActivity.this, ResultadoFinanceiroActivity.class);
        intent.putExtra("NET_SALARY", netSalary);
        startActivity(intent);
    }
}
