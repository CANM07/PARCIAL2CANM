package com.example.aplicacion2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText numero1;
    private EditText numero2;
    private TextView alerta1;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero1 = findViewById(R.id.cuadrito1);
        numero2 = findViewById(R.id.cuadrito2);
        alerta1 = findViewById(R.id.alerta);

    }

    public void realizarSuma(View View) {
        String numb1 = numero1.getText().toString();
        String numb2 = numero2.getText().toString();

        if (numb1.isEmpty() && numb2.isEmpty() ) {
            alerta1.setText("Digite Numeros");
        }else if(numb1.isEmpty() && !numb2.isEmpty()){
            alerta1.setText("Por Favor dijite un numero en el primer espacio");
        }else if(!numb1.isEmpty() && numb2.isEmpty()){
            alerta1.setText("Por Favor dijite un numero en el segundo espacio");
        }else if(!numb1.isEmpty() && !numb2.isEmpty() ) {

            double num1 = Double.parseDouble(numero1.getText().toString());
            double num2 = Double.parseDouble(numero2.getText().toString());
            double sum = num1 + num2;

            Calculadora calculadora = new Calculadora(num1, num2);
            double resultado = calculadora.sumar();
            Bundle bundle = new Bundle();
            bundle.putDouble("resultado", resultado);
            bundle.putDouble("operador", sum);
            bundle.putDouble("tipo",1);
            Intent intent = new Intent(MainActivity.this, P_SUMA.class);
            intent.putExtras(bundle);
            startActivity(intent);
        }
    }


    public void realizarResta(View View){
        String numb1 = numero1.getText().toString();
        String numb2 = numero2.getText().toString();

        if (numb1.isEmpty() && numb2.isEmpty() ) {
            alerta1.setText("Digite Numeros");
        }else if(numb1.isEmpty() && !numb2.isEmpty()){
            alerta1.setText("Por Favor dijite un numero en el primer espacio");
        }else if(!numb1.isEmpty() && numb2.isEmpty()){
            alerta1.setText("Por Favor dijite un numero en el segundo espacio");
        }else if(!numb1.isEmpty() && !numb2.isEmpty() ) {

            double num1 = Double.parseDouble(numero1.getText().toString());
            double num2 = Double.parseDouble(numero2.getText().toString());

            Calculadora calculadora = new Calculadora(num1, num2);
            double resta = (num1 - num2);
            double resultado = calculadora.restar();
            Bundle bundle = new Bundle();
            bundle.putDouble("resultado", resultado);
            bundle.putDouble("operador", resta);
            bundle.putDouble("tipo",1);
            Intent intent = new Intent(getApplicationContext(), P_SUMA.class);
            intent.putExtras(bundle);
            startActivity(intent);
        }
    }



    public void realizarMultiplicacion(View View){
        String numb1 = numero1.getText().toString();
        String numb2 = numero2.getText().toString();

        if (numb1.isEmpty() && numb2.isEmpty() ) {
            alerta1.setText("Digite Numeros");
        }else if(numb1.isEmpty() && !numb2.isEmpty()){
            alerta1.setText("Por Favor dijite un numero en el primer espacio");
        }else if(!numb1.isEmpty() && numb2.isEmpty()){
            alerta1.setText("Por Favor dijite un numero en el segundo espacio");
        }else if(!numb1.isEmpty() && !numb2.isEmpty() ) {

            double num1 = Double.parseDouble(numero1.getText().toString());
            double num2 = Double.parseDouble(numero2.getText().toString());

            Calculadora calculadora = new Calculadora(num1, num2);
            double multiplica = (num1 * num2);
            double resultado = calculadora.multiplicar();
            Bundle bundle = new Bundle();
            bundle.putDouble("resultado", resultado);
            bundle.putDouble("operador", multiplica);
            bundle.putDouble("tipo",1);
            Intent intent = new Intent(getApplicationContext(), P_SUMA.class);
            intent.putExtras(bundle);
            startActivity(intent);
        }
    }
    public void realizar_division(View View){
        String numb1 = numero1.getText().toString();
        String numb2 = numero2.getText().toString();

        if (numb1.isEmpty() && numb2.isEmpty() ) {
            alerta1.setText("Digite Numeros");
        }else if(numb1.isEmpty() && !numb2.isEmpty()){
            alerta1.setText("Por Favor dijite un numero en el primer espacio");
        }else if(!numb1.isEmpty() && numb2.isEmpty()){
            alerta1.setText("Por Favor dijite un numero en el segundo espacio");
        }else if(!numb1.isEmpty() && !numb2.isEmpty() ) {

            double num1 = Double.parseDouble(numero1.getText().toString());
            double num2 = Double.parseDouble(numero2.getText().toString());
            Intent c = new Intent(this, P_SUMA.class);
            startActivity(c);
            Calculadora calculadora = new Calculadora(num1, num2);
            double division = (num1 / num2);
            double resultado = calculadora.division();
            Bundle bundle = new Bundle();
            bundle.putDouble("resultado", resultado);
            bundle.putDouble("operador", division);
            bundle.putDouble("tipo",1);
            Intent intent = new Intent(getApplicationContext(), P_SUMA.class);
            intent.putExtras(bundle);
            startActivity(intent);
        }
    }
    public void realizar_fibonacci(View view){

        String numb1 = numero1.getText().toString();
        String numb2 = numero2.getText().toString();
        int num;

        if (numb1.isEmpty() && numb2.isEmpty() ){
            alerta1.setText("Digite Numeros");
        }else if(!numb1.isEmpty() && !numb2.isEmpty() ){
            alerta1.setText("Digite en un solo Espacio");
        }else if(!numb1.isEmpty() && numb2.isEmpty()){


            num = Integer.parseInt(numero1.getText().toString());

            int resultadoFibonacci = fibonacci(num);
            Bundle bundle = new Bundle();
            bundle.putDouble("resultado", resultadoFibonacci);
            bundle.putInt("num", num);
            bundle.putDouble("tipo",2);
            Intent intent = new Intent(getApplicationContext(), P_SUMA.class);
            intent.putExtras(bundle);
            startActivity(intent);
        }else if(numb1.isEmpty() && !numb2.isEmpty()){


            num = Integer.parseInt(numero2.getText().toString());
            int resultadoFibonacci = fibonacci(num);
            Bundle bundle = new Bundle();
            bundle.putDouble("resultado", resultadoFibonacci);
            bundle.putInt("num", num);
            bundle.putDouble("tipo",2);
            //bundle.putDouble("operador", fibo);
            Intent intent = new Intent(getApplicationContext(), P_SUMA.class);
            intent.putExtras(bundle);
            startActivity(intent);
        }

    }
    public static int fibonacci(int numero1) {
        if(numero1<=1){
            return numero1;
        } else{
            return fibonacci(numero1-1) + fibonacci(numero1-2);

        }
    }
    public void realizar_factorial(View view){
        String numb1 = numero1.getText().toString();
        String numb2 = numero2.getText().toString();
        int num;

        if (numb1.isEmpty() && numb2.isEmpty() ){
            alerta1.setText("Digite Numeros");
        }else if(!numb1.isEmpty() && !numb2.isEmpty() ){
            alerta1.setText("Digite en un solo Espacio");
        }else if(!numb1.isEmpty() && numb2.isEmpty()){


            num = Integer.parseInt(numero1.getText().toString());

            int resultadoFactorial = factorial(num);
            Bundle bundle = new Bundle();
            bundle.putDouble("resultado", resultadoFactorial);
            bundle.putInt("num", num);
            bundle.putDouble("tipo",3);

            Intent intent = new Intent(getApplicationContext(), P_SUMA.class);
            intent.putExtras(bundle);
            startActivity(intent);
        }else if(numb1.isEmpty() && !numb2.isEmpty()){


            num = Integer.parseInt(numero2.getText().toString());

            int resultadoFactorial = factorial(num);
            Bundle bundle = new Bundle();
            bundle.putDouble("resultado", resultadoFactorial);
            bundle.putInt("num", num);
            bundle.putDouble("tipo",3);

            Intent intent = new Intent(getApplicationContext(), P_SUMA.class);
            intent.putExtras(bundle);
            startActivity(intent);
        }
    }
    public static int factorial(int numero1) {
        int resultado = 0;

        if(numero1==0||numero1==1){
            return numero1;
        } else if(numero1>1) {
            resultado=numero1*factorial(numero1-1);
        }
        return resultado;
    }
    public void realizar_potencia(View view){
        String numb1 = numero1.getText().toString();
        String numb2 = numero2.getText().toString();

        if (numb1.isEmpty() && numb2.isEmpty() ) {
            alerta1.setText("Digite Numeros");
        }else if(numb1.isEmpty() && !numb2.isEmpty()){
            alerta1.setText("Por Favor dijite un numero en el primer espacio");
        }else if(!numb1.isEmpty() && numb2.isEmpty()){
            alerta1.setText("Por Favor dijite un numero en el segundo espacio");
        }else if(!numb1.isEmpty() && !numb2.isEmpty() ) {

            int base = Integer.parseInt(numero1.getText().toString());
            int exponente = Integer.parseInt(numero2.getText().toString());
            int resultadoPotencia = Potencia1(base,exponente);

            Bundle bundle = new Bundle();
            bundle.putDouble("resultado", resultadoPotencia);
            bundle.putInt("num1", base);
            bundle.putInt("num2", exponente);
            bundle.putDouble("tipo",4);
            //bundle.putDouble("operador", fibo);
            Intent intent = new Intent(getApplicationContext(), P_SUMA.class);
            intent.putExtras(bundle);
            startActivity(intent);
        }
    }
    public static int Potencia1(int base, int exponente) {
        if (exponente == 0) {
            return 1; // Cualquier número elevado a 0 es 1
        } else if (exponente == 1) {
            return base; // La potencia de cualquier número a la 1 es el mismo número
        } else if (exponente > 0) {
            return PotenciaSumar(base , Potencia1(base, exponente - 1)); // Recursión para calcular la potencia
        } else {
            return 1 / (PotenciaSumar(base, Potencia1(base, -exponente - 1))); // Manejo de exponentes negativos
        }
    }
    public static int PotenciaSumar(int num1, int contador) {
        if (contador == 0) {
            return 0;
        } else if (contador > 0) {
            return num1 + PotenciaSumar(num1, contador - 1);
        } else {
            return -PotenciaSumar(num1, -contador);
        }
    }
}