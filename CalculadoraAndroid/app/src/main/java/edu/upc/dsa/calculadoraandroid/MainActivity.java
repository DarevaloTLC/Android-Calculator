package edu.upc.dsa.calculadoraandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView miTextView; //Preguntar porqué hay que crear esta variable y no podemos hacer como en Visual Studio que podemos cambiar directamente.
    private StringBuilder cadenaNumeros;
    private String operacionPendiente;
    private double op;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        miTextView = findViewById(R.id.tvRes); //Preguntar porqué hay que usar esta función.
        cadenaNumeros = new StringBuilder();
    }

    public void num0(View view){
        String numero = ((TextView) view).getText().toString();
        cadenaNumeros.append(numero);
        miTextView.setText(cadenaNumeros.toString());
    }
    public void num1(View view){
        String numero = ((TextView) view).getText().toString();
        cadenaNumeros.append(numero);
        miTextView.setText(cadenaNumeros.toString());
    }
    public void num2(View view){
        String numero = ((TextView) view).getText().toString();
        cadenaNumeros.append(numero);
        miTextView.setText(cadenaNumeros.toString());
    }
    public void num3(View view){
        String numero = ((TextView) view).getText().toString();
        cadenaNumeros.append(numero);
        miTextView.setText(cadenaNumeros.toString());
    }
    public void num4(View view){
        String numero = ((TextView) view).getText().toString();
        cadenaNumeros.append(numero);
        miTextView.setText(cadenaNumeros.toString());
    }
    public void num5(View view){
        String numero = ((TextView) view).getText().toString();
        cadenaNumeros.append(numero);
        miTextView.setText(cadenaNumeros.toString());
    }
    public void num6(View view){
        String numero = ((TextView) view).getText().toString();
        cadenaNumeros.append(numero);
        miTextView.setText(cadenaNumeros.toString());
    }
    public void num7(View view){
        String numero = ((TextView) view).getText().toString();
        cadenaNumeros.append(numero);
        miTextView.setText(cadenaNumeros.toString());
    }
    public void num8(View view){
        String numero = ((TextView) view).getText().toString();
        cadenaNumeros.append(numero);
        miTextView.setText(cadenaNumeros.toString());
    }
    public void num9(View view){
        String numero = ((TextView) view).getText().toString();
        cadenaNumeros.append(numero);
        miTextView.setText(cadenaNumeros.toString());
    }
    public void Sumar(View view){

    }
    public void Restar(View view){

    }
    public void Multiplicar(View view){

    }
    public void Dividir(View view){

    }
    public void Resultado(View view){

    }
    public void Limpiar(View view){

    }

}

