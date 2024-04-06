package com.example.aplicacion2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;


public class P_SUMA extends AppCompatActivity {

    private static EditText valor1;
    private static EditText valor2;

    private static TextView resultado;

    private static TextView resultado2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psuma);
        ImageView imageView = findViewById(R.id.gif_image);
        Glide.with(this)
                .load(R.drawable.animacion)
                .into(imageView);



        resultado = findViewById(R.id.respuesta);
        resultado2 = findViewById(R.id.respuesta2);


        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();
        double tipo = bundle.getDouble("tipo");
        if (tipo == 1) {



            Double suma = bundle.getDouble("resultado");
            Double sum = bundle.getDouble("operador");

            resultado.setText(String.valueOf(sum));

            resultado2.setText(String.valueOf(suma));
        } else if (tipo == 4) {



            Double suma= bundle.getDouble("resultado");
            int num= bundle.getInt("num1");
            int num2= bundle.getInt("num2");

            resultado.setText(String.valueOf(suma));

            int resultadoPotencia = Potencia1(num, num2);
            resultado2.setText(Integer.toString(resultadoPotencia));

        } else if (tipo == 2) {


            Double suma= bundle.getDouble("resultado");
            int num= bundle.getInt("num");

            //resultado.setText(String.valueOf(num));
            resultado2.setText(String.valueOf(suma));

            int resultadoFibonacci = fibonacci1(num);
            resultado.setText(Integer.toString(resultadoFibonacci));

        } else if (tipo == 3) {


            Double suma= bundle.getDouble("resultado");
            int num= bundle.getInt("num");

            //resultado.setText(String.valueOf(num));
            resultado2.setText(String.valueOf(suma));

            int resultadofactorial = factorial1(num);
            resultado.setText(Integer.toString(resultadofactorial));

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


    public static int fibonacci1(int numero1) {
        if(numero1<=1){
            return numero1;
        } else{
            return fibonacci1(numero1-1) + fibonacci1(numero1-2);

        }
    }

    public static int factorial1(int numero1) {
        int resultado = 0;

        if(numero1==0||numero1==1){
            return numero1;
        } else if(numero1>1) {
            resultado=numero1*factorial1(numero1-1);
        }
        return resultado;
    }

    public void volver(View view){

        finishActivity();
    }

    private void finishActivity() {
        Intent c= new Intent(this,P_SUMA.class);
        finish();
    }
}