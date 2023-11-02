package com.example.miprimeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.FirebaseFirestore;

public class MainActivity extends AppCompatActivity {
    private EditText editTextNumber1;
    private EditText editTextNumber2;
    private TextView resultadoTextView;
    private Button btnSumar;
    private Button btnRestar;
    private Button btnMultiplicar;
    private Button btnDividir;

    FirebaseFirestore db ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumber1 = findViewById(R.id.editTextNumber);
        editTextNumber2 = findViewById(R.id.editTextNumber2);
        resultadoTextView = findViewById(R.id.resultado);
        btnSumar = findViewById(R.id.btsuma);
        btnRestar = findViewById(R.id.btresta);
        btnMultiplicar = findViewById(R.id.btmultip);
        btnDividir = findViewById(R.id.btdivide);

        // Inicializa la referencia a la base de datos de Firebase
       db= FirebaseFirestore.getInstance();
    }

    public void sumar(View view) {
        String numero1Str = editTextNumber1.getText().toString();
        String numero2Str = editTextNumber2.getText().toString();
        int numero1 = Integer.parseInt(numero1Str);
        int numero2 = Integer.parseInt(numero2Str);
        int resultado = numero1 + numero2;

        // Guarda el resultado en Firebase
        databaseReference.child("resultados").push().setValue(resultado);
        resultadoTextView.setText(String.valueOf(resultado));
    }

    public void restar(View view) {
        String numero1Str = editTextNumber1.getText().toString();
        String numero2Str = editTextNumber2.getText().toString();
        int numero1 = Integer.parseInt(numero1Str);
        int numero2 = Integer.parseInt(numero2Str);
        int resultado = numero1 - numero2;

        // Guarda el resultado en Firebase
        databaseReference.child("resultados").push().setValue(resultado);
        resultadoTextView.setText(String.valueOf(resultado));
    }

    public void multiplicar(View view) {
        String numero1Str = editTextNumber1.getText().toString();
        String numero2Str = editTextNumber2.getText().toString();
        int numero1 = Integer.parseInt(numero1Str);
        int numero2 = Integer.parseInt(numero2Str);
        int resultado = numero1 * numero2;

        // Guarda el resultado en Firebase
        databaseReference.child("resultados").push().setValue(resultado);
        resultadoTextView.setText(String.valueOf(resultado));
    }

    public void dividir(View view) {
        try {
            String numero1Str = editTextNumber1.getText().toString();
            String numero2Str = editTextNumber2.getText().toString();
            int numero1 = Integer.parseInt(numero1Str);
            int numero2 = Integer.parseInt(numero2Str);
            int resultado = numero1 / numero2;

            // Guarda el resultado en Firebase
            databaseReference.child("resultados").push().setValue(resultado);
            resultadoTextView.setText(String.valueOf(resultado));
        } catch (Exception e) {
            resultadoTextView.setText("ERROR");
        }
    }
}
