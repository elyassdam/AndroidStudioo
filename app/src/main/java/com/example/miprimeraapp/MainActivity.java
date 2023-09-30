package com.example.miprimeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editTextNumber1;
    private EditText editTextNumber2;
    private TextView resultadoTextView;
    private Button btnSumar;
    private Button btnresta;
    private Button btnmulti;
    private Button btndivide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumber1 = findViewById(R.id.editTextNumber);
        editTextNumber2 = findViewById(R.id.editTextNumber2);
        resultadoTextView = findViewById(R.id.resultado);
        btnSumar = findViewById(R.id.btsuma);
        btnresta = findViewById(R.id.btresta);
        btnmulti = findViewById(R.id.btmultip);
        btndivide=findViewById(R.id.btdivide);

    }

    public void sumar(View view) {
        String numero1Str = editTextNumber1.getText().toString();
        String numero2Str = editTextNumber2.getText().toString();
        int numero1 = Integer.parseInt(numero1Str);
        int numero2 = Integer.parseInt(numero2Str);
        int resultado = numero1 + numero2;
        resultadoTextView.setText(String.valueOf(resultado));

    }

    public void resta(View view) {
        String numero1Str = editTextNumber1.getText().toString();
        String numero2Str = editTextNumber2.getText().toString();

        int numero1 = Integer.parseInt(numero1Str);
        int numero2 = Integer.parseInt(numero2Str);
        int resultado = numero1 - numero2;
        resultadoTextView.setText(String.valueOf(resultado));


    }

    public void multi(View view) {
        String numero1Str = editTextNumber1.getText().toString();
        String numero2Str = editTextNumber2.getText().toString();
        int numero1 = Integer.parseInt(numero1Str);
        int numero2 = Integer.parseInt(numero2Str);
        int resultado = numero1 * numero2;
        resultadoTextView.setText(String.valueOf(resultado));

    }

    public void Divide(View view) {
        try {
            String numero1Str = editTextNumber1.getText().toString();
            String numero2Str = editTextNumber2.getText().toString();
            int numero1 = Integer.parseInt(numero1Str);
            int numero2 = Integer.parseInt(numero2Str);
            int resultado = numero1 / numero2;
            resultadoTextView.setText(String.valueOf(resultado));
        } catch (Exception e) {
            resultadoTextView.setText("ERROR");

        }
    }
}