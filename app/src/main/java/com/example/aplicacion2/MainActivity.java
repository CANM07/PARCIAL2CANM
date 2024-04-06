package com.example.aplicacion2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText espacio1;
    private EditText espacio2;
    private EditText espacio3;
    private EditText espacio4;
    private TextView alerta1;
    Button btn1;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        espacio1 = findViewById(R.id.cuadrito1);
        espacio2 = findViewById(R.id.cuadrito2);
        espacio3 = findViewById(R.id.cuadrito3);
        espacio4 = findViewById(R.id.cuadrito4);

        alerta1 = findViewById(R.id.alerta);
        //btn1 = findViewById(R.id.btn1);

    }

    /*public void v_software(View view){


           Intent i = new Intent(MainActivity.this, MainActivity2.class);
           startActivity(i);
    }*/
    public void v_software(View View) {
        String texto1 = espacio1.getText().toString();
        String texto2 = espacio2.getText().toString();
        String texto3 = espacio3.getText().toString();
        String texto4 = espacio4.getText().toString();


        if (texto1.isEmpty() && texto2.isEmpty() && texto3.isEmpty() && texto3.isEmpty()){
            alerta1.setText("Digite todos los espacios");
        }else if(texto1.isEmpty() && !texto2.isEmpty() && !texto3.isEmpty() && !texto4.isEmpty()){
            alerta1.setText("Por Favor dijite un numero en el primer espacio");
        }else if(!texto1.isEmpty() && texto2.isEmpty() && !texto3.isEmpty() && !texto4.isEmpty()){
            alerta1.setText("Por Favor dijite un numero en el segundo espacio");
        }else if(!texto1.isEmpty() && !texto2.isEmpty() && texto3.isEmpty() && !texto4.isEmpty()){
            alerta1.setText("Por Favor dijite un numero en el tercer espacio");
        }else if(!texto1.isEmpty() && !texto2.isEmpty() && !texto3.isEmpty() && texto4.isEmpty()){
            alerta1.setText("Por Favor dijite un numero en el cuarto espacio");
        }else if(!texto1.isEmpty() && !texto2.isEmpty() && !texto3.isEmpty() && !texto4.isEmpty()) {

            /*String text3 = Double.parseDouble(numero1.getText().toString());
            String num2 = Double.parseDouble(numero2.getText().toString());
            String num2 = Double.parseDouble(numero2.getText().toString());*/
           //double sum = num1 + num2;

            //Calculadora calculadora = new Calculadora(num1, num2);
            //double resultado = calculadora.sumar();
            Bundle bundle = new Bundle();
            bundle.putString("nombres", texto1);
            bundle.putString("apellidos", texto2);
            bundle.putString("edad", texto3);
            bundle.putString("cedula", texto4);
            bundle.putDouble("tipo",1);
            Intent intent = new Intent(MainActivity.this, P_SUMA.class);
            intent.putExtras(bundle);
            startActivity(intent);
        }
    }


    public void v_economia(View View) {
        String texto1 = espacio1.getText().toString();
        String texto2 = espacio2.getText().toString();
        String texto3 = espacio3.getText().toString();
        String texto4 = espacio4.getText().toString();


        if (texto1.isEmpty() && texto2.isEmpty() && texto3.isEmpty() && texto3.isEmpty()){
            alerta1.setText("Digite todos los espacios");
        }else if(texto1.isEmpty() && !texto2.isEmpty() && !texto3.isEmpty() && !texto4.isEmpty()){
            alerta1.setText("Por Favor dijite un numero en el primer espacio");
        }else if(!texto1.isEmpty() && texto2.isEmpty() && !texto3.isEmpty() && !texto4.isEmpty()){
            alerta1.setText("Por Favor dijite un numero en el segundo espacio");
        }else if(!texto1.isEmpty() && !texto2.isEmpty() && texto3.isEmpty() && !texto4.isEmpty()){
            alerta1.setText("Por Favor dijite un numero en el tercer espacio");
        }else if(!texto1.isEmpty() && !texto2.isEmpty() && !texto3.isEmpty() && texto4.isEmpty()){
            alerta1.setText("Por Favor dijite un numero en el cuarto espacio");
        }else if(!texto1.isEmpty() && !texto2.isEmpty() && !texto3.isEmpty() && !texto4.isEmpty()) {

            /*String text3 = Double.parseDouble(numero1.getText().toString());
            String num2 = Double.parseDouble(numero2.getText().toString());
            String num2 = Double.parseDouble(numero2.getText().toString());*/
            //double sum = num1 + num2;

            //Calculadora calculadora = new Calculadora(num1, num2);
            //double resultado = calculadora.sumar();
            Bundle bundle = new Bundle();
            bundle.putString("nombres", texto1);
            bundle.putString("apellidos", texto2);
            bundle.putString("edad", texto3);
            bundle.putString("cedula", texto4);
            bundle.putDouble("tipo",2);
            Intent intent = new Intent(MainActivity.this, P_SUMA.class);
            intent.putExtras(bundle);
            startActivity(intent);
        }
    }

    public void v_contabilidad(View View) {
        String texto1 = espacio1.getText().toString();
        String texto2 = espacio2.getText().toString();
        String texto3 = espacio3.getText().toString();
        String texto4 = espacio4.getText().toString();


        if (texto1.isEmpty() && texto2.isEmpty() && texto3.isEmpty() && texto3.isEmpty()){
            alerta1.setText("Digite todos los espacios");
        }else if(texto1.isEmpty() && !texto2.isEmpty() && !texto3.isEmpty() && !texto4.isEmpty()){
            alerta1.setText("Por Favor dijite un numero en el primer espacio");
        }else if(!texto1.isEmpty() && texto2.isEmpty() && !texto3.isEmpty() && !texto4.isEmpty()){
            alerta1.setText("Por Favor dijite un numero en el segundo espacio");
        }else if(!texto1.isEmpty() && !texto2.isEmpty() && texto3.isEmpty() && !texto4.isEmpty()){
            alerta1.setText("Por Favor dijite un numero en el tercer espacio");
        }else if(!texto1.isEmpty() && !texto2.isEmpty() && !texto3.isEmpty() && texto4.isEmpty()){
            alerta1.setText("Por Favor dijite un numero en el cuarto espacio");
        }else if(!texto1.isEmpty() && !texto2.isEmpty() && !texto3.isEmpty() && !texto4.isEmpty()) {

            /*String text3 = Double.parseDouble(numero1.getText().toString());
            String num2 = Double.parseDouble(numero2.getText().toString());
            String num2 = Double.parseDouble(numero2.getText().toString());*/
            //double sum = num1 + num2;

            //Calculadora calculadora = new Calculadora(num1, num2);
            //double resultado = calculadora.sumar();
            Bundle bundle = new Bundle();
            bundle.putString("nombres", texto1);
            bundle.putString("apellidos", texto2);
            bundle.putString("edad", texto3);
            bundle.putString("cedula", texto4);
            bundle.putDouble("tipo",3);
            Intent intent = new Intent(MainActivity.this, P_SUMA.class);
            intent.putExtras(bundle);
            startActivity(intent);
        }
    }

    public void v_cocina(View View) {
        String texto1 = espacio1.getText().toString();
        String texto2 = espacio2.getText().toString();
        String texto3 = espacio3.getText().toString();
        String texto4 = espacio4.getText().toString();


        if (texto1.isEmpty() && texto2.isEmpty() && texto3.isEmpty() && texto3.isEmpty()){
            alerta1.setText("Digite todos los espacios");
        }else if(texto1.isEmpty() && !texto2.isEmpty() && !texto3.isEmpty() && !texto4.isEmpty()){
            alerta1.setText("Por Favor dijite un numero en el primer espacio");
        }else if(!texto1.isEmpty() && texto2.isEmpty() && !texto3.isEmpty() && !texto4.isEmpty()){
            alerta1.setText("Por Favor dijite un numero en el segundo espacio");
        }else if(!texto1.isEmpty() && !texto2.isEmpty() && texto3.isEmpty() && !texto4.isEmpty()){
            alerta1.setText("Por Favor dijite un numero en el tercer espacio");
        }else if(!texto1.isEmpty() && !texto2.isEmpty() && !texto3.isEmpty() && texto4.isEmpty()){
            alerta1.setText("Por Favor dijite un numero en el cuarto espacio");
        }else if(!texto1.isEmpty() && !texto2.isEmpty() && !texto3.isEmpty() && !texto4.isEmpty()) {

            /*String text3 = Double.parseDouble(numero1.getText().toString());
            String num2 = Double.parseDouble(numero2.getText().toString());
            String num2 = Double.parseDouble(numero2.getText().toString());*/
            //double sum = num1 + num2;

            //Calculadora calculadora = new Calculadora(num1, num2);
            //double resultado = calculadora.sumar();
            Bundle bundle = new Bundle();
            bundle.putString("nombres", texto1);
            bundle.putString("apellidos", texto2);
            bundle.putString("edad", texto3);
            bundle.putString("cedula", texto4);
            bundle.putDouble("tipo",4);
            Intent intent = new Intent(MainActivity.this, P_SUMA.class);
            intent.putExtras(bundle);
            startActivity(intent);
        }
    }


}