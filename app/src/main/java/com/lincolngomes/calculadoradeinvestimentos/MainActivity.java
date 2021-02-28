package com.lincolngomes.calculadoradeinvestimentos;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText editarDolar;
    private TextInputEditText editarReais;
    private TextView textoResultado;
    private TextView nome;

    Usuario usuario = new Usuario();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editarDolar = findViewById(R.id.editarDolar);
        editarReais = findViewById(R.id.editarReais);
        textoResultado = findViewById(R.id.textoResultado);
        nome = findViewById(R.id.nome);
    }


//Calculadora de cotação Dolar

    public void calcularDolar (View v) {

        double valorDolar = Double.parseDouble(editarDolar.getText().toString());
        double valorReais = Double.parseDouble(editarReais.getText().toString());
        double valorResultado = valorDolar * valorReais;


        textoResultado.setText(" O resultado é de R$ " + valorResultado + " Estamos a disposição " + nome.getText());

    }
    }