package org.example;
import java.util.Scanner;

public class Main {

    /*public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int broj = in.nextInt();
        System.out.println(Matematika.sin(broj));

    }*/

    public static void Main(String[] args){

        if(args[0].equals("sin")) {
            System.out.println(Matematika.sin(Double.parseDouble(args[1])));
        }
        }
    }

}