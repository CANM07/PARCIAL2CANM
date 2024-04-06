package com.example.aplicacion2;

import java.io.Serializable;

public class Calculadora implements Serializable {
    private double num1;
    private double num2;

    public Calculadora(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double sumar(){
        return num1+num2;
    }

    public double restar(){
        return num1-num2;
    }

    public double multiplicar(){
        return num1*num2;
    }

    public double division(){
        return num1/num2;
    }

    public double fibo() {

        int num = 0;

        if (num1 == 0) {

            //num = Integer.parseInt(num1.getText().toString());
            double resultadoFibonacci = fibonacci(num);
            return resultadoFibonacci;

        } else if (num2 == 0) {

            //num = Integer.parseInt(valor2.getText().toString());
            double resultadoFibonacci = fibonacci(num);
            return resultadoFibonacci;
        }
        return 0;
    }
    public static int fibonacci(int numero1) {
        if(numero1<=1){
            return numero1;
        } else{
            return fibonacci(numero1-1) + fibonacci(numero1-2);

        }
    }
    }

