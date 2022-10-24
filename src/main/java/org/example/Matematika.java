package org.example;

public class Matematika {


    public static int faktorijel(int broj){
        int f = 1;
        for(int i = 1; i < broj ; i++) {
            f += f * i;
        }
        return f;
    }

    public static double sin(double broj){
        int predznak = 1,eksponent = 1;
        double suma = 0;
        broj = broj  * Math.PI/180;
        for(int i = 1; i <= 10 ; i++){
            suma += predznak *(Math.pow(broj,eksponent)/faktorijel(eksponent) );
            predznak *= -1;
            eksponent += 2;
        }
        return suma;
    }
}



