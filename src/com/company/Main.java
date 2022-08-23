package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner myScan = new Scanner(System.in);
        System.out.println("Ingrese el primer numero a comparar: ");
        int numberOne = myScan.nextInt();
        System.out.println("Ingrese el segundo numero a comparar: ");
        int numberTwo = myScan.nextInt();

        if (numberOne > numberTwo){
            System.out.println("El primero numero ingresado, " + numberOne + ", es el mayor entre los dos");
        } else if (numberOne < numberTwo){
            System.out.println("El segundo numero ingresado, " + numberTwo + ", 10" +
                    "es el mayor entre los dos");
        } else{
            System.out.println("Ambos numeros son iguales");
        }
    }
}
