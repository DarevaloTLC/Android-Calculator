package edu.upc.dsa.calculadoraandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import kotlin.text.UStringsKt;

public class MainActivity extends AppCompatActivity {

    private TextView miTextView; //Preguntar porqué hay que crear esta variable y no podemos hacer como en Visual Studio que podemos cambiar directamente.
    private StringBuilder cadenaNumeros;
    private double resultadoAcumulado;
    private String operacionActual;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        miTextView = findViewById(R.id.tvRes); //Preguntar porqué hay que usar esta función.
        cadenaNumeros = new StringBuilder();
        resultadoAcumulado = 0;
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
    public void realizarOperacion(){
        if(!cadenaNumeros.toString().isEmpty()){
            double numero = Double.parseDouble(cadenaNumeros.toString());
            switch (operacionActual){
                case "+":
                    resultadoAcumulado +=numero;
                    break;
                case "-":
                    resultadoAcumulado -=numero;
                    break;
                case "*":
                    resultadoAcumulado *= numero;
                    break;
                case "/":
                    if(numero !=0){
                        resultadoAcumulado /= numero;
                    }
                    break;
                default:
                    resultadoAcumulado = numero;
            }
            cadenaNumeros.setLength(0);
            miTextView.setText(cadenaNumeros);
        }
    }
    public void Sumar(View view){
        operacionActual = "+";
        realizarOperacion();

    }
    public void Restar(View view){
        operacionActual = "-";
        realizarOperacion();
    }
    public void Multiplicar(View view){
        operacionActual = "*";
        realizarOperacion();
    }
    public void Dividir(View view){
        operacionActual = "/";
        realizarOperacion();
    }
    public void Cos(View view){

    }
    public void Sen(View view){

    }
    public void Tan(View view){

    }
    public void Resultado(View view){
        realizarOperacion();
        operacionActual = "";
        miTextView.setText(String.valueOf(resultadoAcumulado));
        cadenaNumeros.setLength(0);
    }
    public void Limpiar(View view){
        cadenaNumeros.setLength(0);
        miTextView.setText((cadenaNumeros.toString()));
        resultadoAcumulado = 0;
    }

}

