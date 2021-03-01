package com.lincolngomes.calculadoradeinvestimentos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

//    private TextInputEditText editarDolar;
//    private TextInputEditText editarReais;
//    private TextView textoResultado;
//    private TextInputEditText nome;
//    private TextInputEditText email;


    //FORMATAÇÃO DECIMAL
    DecimalFormat df = new DecimalFormat("0.00");

    TextInputEditText editarCapital;
    TextInputEditText editarJuros;
    TextInputEditText editarPeriodo;
    TextInputEditText editarPMT;
    TextInputEditText editarJurosCompostos;
    TextView resultadoVF;



    DadosInvestimentos dados = new DadosInvestimentos();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calcular_vf);

        editarCapital = findViewById(R.id.editarCapital);
        editarJuros = findViewById(R.id.editarJuros);
        editarPeriodo = findViewById(R.id.editarPeriodo);
        editarPMT = findViewById(R.id.editarPMT);
        editarJurosCompostos = findViewById(R.id.editarJurosCompostos);
        resultadoVF = findViewById(R.id.resultadoVF);



//        editarDolar = findViewById(R.id.editarJuros);
//        editarReais = findViewById(R.id.editarCapital);
//        textoResultado = findViewById(R.id.resultadoVF);
//        nome = findViewById(R.id.editarPeriodo);
//        email = findViewById(R.id.email);


    }

    public void calcularVF( View view) {
        double capital = Double.parseDouble(editarCapital.getText().toString());
        double txJuros = Double.parseDouble(editarJuros.getText().toString());
        double periodo = Double.parseDouble(editarPeriodo.getText().toString());



        double juros = txJuros/100;

        double jurosSimples = capital + (capital * juros * periodo);
        double jurosCompostos = capital * Math.pow(1 + juros, periodo)
                ;

        resultadoVF.setText("O resultado do valor futuro \n em juros compostos é \n de R$ " + df.format(jurosCompostos) + ".");


    }
//Calculadora de cotação Dolar

//    public void calcularDolar (View v) {
//
//        double valorDolar = Double.parseDouble(editarDolar.getText().toString());
//        double valorReais = Double.parseDouble(editarReais.getText().toString());
//        double valorResultado = valorDolar * valorReais;
//
//
//        textoResultado.setText(" O resultado é de R$ " + df.format(valorResultado) + "\n" + " Estamos a disposição " + nome.getText() + " - " + email.getText() );
//
//    }
    }