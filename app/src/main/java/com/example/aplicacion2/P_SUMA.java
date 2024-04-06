package com.example.aplicacion2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
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

    private static TextView vista_nombre;
    private static TextView vista_apellido;
    private static TextView vista_edad;
    private static TextView vista_carrera;
    private static TextView vista_cedula;
    //
    private static TextView vista_valor;
    private static TextView vista_descuento;
    private static TextView vista_total;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psuma);
       /* ImageView imageView = findViewById(R.id.gif_image);
        Glide.with(this)
                .load(R.drawable.animacion)
                .into(imageView);*/


        vista_cedula = findViewById(R.id.dato0);
        vista_nombre = findViewById(R.id.dato1);
        vista_apellido = findViewById(R.id.dato2);
        vista_edad = findViewById(R.id.dato3);
        vista_carrera = findViewById(R.id.dato4);

        vista_valor = findViewById(R.id.valor1);
        vista_descuento = findViewById(R.id.cuadrodescuento);
        vista_total = findViewById(R.id.cuadrototal);


        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();
        double tipo = bundle.getDouble("tipo");
        if (tipo == 1) {



            String nombres = bundle.getString("nombres");
            String apellidos = bundle.getString("apellidos");
            int edad = bundle.getInt("edad");
            String cedula = bundle.getString("cedula");
            int descuento = 2800000;
            double valor_descuento = descuento*0.20;
            double valor_total = descuento+valor_descuento;

            vista_cedula.setText(String.valueOf(cedula));
            vista_nombre.setText(String.valueOf(nombres));
            vista_apellido.setText(String.valueOf(apellidos));
            vista_edad.setText(String.valueOf(edad));
            vista_carrera.setText("Software");

            vista_valor.setText("2.800.000");
            vista_descuento.setText(String.valueOf(valor_descuento));
            vista_total.setText(String.valueOf(valor_total));


            //resultado2.setText(String.valueOf(suma));
        } else if (tipo == 2) {


            String nombres = bundle.getString("nombres");
            String apellidos = bundle.getString("apellidos");
            int edad = bundle.getInt("edad");
            String cedula = bundle.getString("cedula");
            int descuento = 3500000;
            double valor_descuento = descuento*0.20;
            double valor_total = descuento+valor_descuento;

            vista_cedula.setText(String.valueOf(cedula));
            vista_nombre.setText(String.valueOf(nombres));
            vista_apellido.setText(String.valueOf(apellidos));
            vista_edad.setText(String.valueOf(edad));
            vista_carrera.setText("Economia");

            vista_valor.setText("3.500.000");
            vista_descuento.setText(String.valueOf(valor_descuento));
            vista_total.setText(String.valueOf(valor_total));

        } else if (tipo == 3) {


            String nombres = bundle.getString("nombres");
            String apellidos = bundle.getString("apellidos");
            int edad = bundle.getInt("edad");
            String cedula = bundle.getString("cedula");
            int descuento = 4000000;
            double valor_descuento = descuento*0.20;
            double valor_total = descuento+valor_descuento;

            vista_cedula.setText(String.valueOf(cedula));
            vista_nombre.setText(String.valueOf(nombres));
            vista_apellido.setText(String.valueOf(apellidos));
            vista_edad.setText(String.valueOf(edad));
            vista_carrera.setText("Contabilidad");

            vista_valor.setText("4.000.000");
            vista_descuento.setText(String.valueOf(valor_descuento));
            vista_total.setText(String.valueOf(valor_total));

        } else if (tipo == 4) {


            String nombres = bundle.getString("nombres");
            String apellidos = bundle.getString("apellidos");
            int edad = bundle.getInt("edad");
            String cedula = bundle.getString("cedula");
            int descuento = 3200000;
            double valor_descuento = descuento*0.20;
            double valor_total = descuento+valor_descuento;

            vista_cedula.setText(String.valueOf(cedula));
            vista_nombre.setText(String.valueOf(nombres));
            vista_apellido.setText(String.valueOf(apellidos));
            vista_edad.setText(String.valueOf(edad));
            vista_carrera.setText("Cocina");

            vista_valor.setText("3.200.000");
            vista_descuento.setText(String.valueOf(valor_descuento));
            vista_total.setText(String.valueOf(valor_total));
        }
    }
/*
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
    }*/
}