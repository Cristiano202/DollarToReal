package com.example.conersaodemoedas;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText ediQuantidadeDolar;
    private EditText editCotacao;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ediQuantidadeDolar = findViewById(R.id.ediQuantidadeDolar);
        editCotacao = findViewById(R.id.editCotacao);
        textResultado = findViewById(R.id.textResultado);
    }

    public void converter(View view) {
        double quantidadeDolar = Double.parseDouble(ediQuantidadeDolar.getText().toString());
        double cotacaoDolar = Double.parseDouble(editCotacao.getText().toString());

        double resultado = quantidadeDolar * cotacaoDolar;

        textResultado.setText("R$ "+resultado);

    }
    public void resete(View view) {
        ediQuantidadeDolar.setText("");
        editCotacao.setText("");
        textResultado.setText("Resultado:");
    }

}