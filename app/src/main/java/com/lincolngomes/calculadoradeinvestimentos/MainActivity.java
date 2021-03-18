package com.lincolngomes.calculadoradeinvestimentos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

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

    public TextInputEditText editarCapital;
    public TextInputEditText editarJuros;
    public TextInputEditText editarPeriodo;
    public TextInputEditText editarPMT;
    public TextInputEditText editarJurosCompostos;
    public TextView resultadoVF;
    public Boolean validarCampos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editarCapital = findViewById(R.id.editarCapital);
        editarJuros = findViewById(R.id.editarJuros);
        editarPeriodo = findViewById(R.id.editarPeriodo);
        editarPMT = findViewById(R.id.editarPMT);
        resultadoVF = findViewById(R.id.resultadoVF);



    }

    public void calcularVF(View view) {


        validarCampos();
//        if (validarCampos()) {
//            resultadoVF.setText("CERTO");
//        }
//
//        double capital = Double.parseDouble(editarCapital.getText().toString());
//        double txJuros = Double.parseDouble(editarJuros.getText().toString());
//        double periodo = Double.parseDouble(editarPeriodo.getText().toString());
//        double pmt = Double.parseDouble(editarPMT.getText().toString());
//        double juros = txJuros / 100;
//
//        if (editarPeriodo.getText() == null) {
//            Toast.makeText(this, "Perido vazio", Toast.LENGTH_LONG);
//        }


//Calculos
//        double jurosSimples = capital + (capital * juros * periodo);
//        double jurosCompostosPV = capital * Math.pow(1 + juros, periodo);
//        double jurosCompostosPMT = pmt * (Math.pow(1 + juros, periodo) - 1) / juros;
//        double jurosCompostoResultado1 = jurosCompostosPV + jurosCompostosPMT;

    }






    public void validarCampos() {

        double capital = Double.parseDouble(editarCapital.getText().toString());
//        double txJuros = Double.parseDouble(editarJuros.getText().toString());
//        double periodo = Double.parseDouble(editarPeriodo.getText().toString());
//        double pmt = Double.parseDouble(editarPMT.getText().toString());
//        double juros = txJuros / 100;




    }

    }







































//        if (editarCapital == null) {
//            resultadoVF.setText("SEM CAPITAL ");}
//        if (editarPMT == null) {
//            resultadoVF.setText("SEM PMT ");
//        }





  //FIM






//IDEIA

