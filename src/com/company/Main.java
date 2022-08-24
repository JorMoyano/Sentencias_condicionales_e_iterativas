package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    compareNumber();
    menuChoice();
    }

    private static void compareNumber() {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Ingrese el primer numero a comparar: ");
        int numberOne = myScan.nextInt();
        System.out.println("Ingrese el segundo numero a comparar: ");
        int numberTwo = myScan.nextInt();

        if (numberOne > numberTwo) {
            System.out.println("El primero numero ingresado, " + numberOne + ", es el mayor entre los dos");
        } else if (numberOne < numberTwo) {
            System.out.println("El segundo numero ingresado, " + numberTwo + ", 10" +
                    "es el mayor entre los dos");
        } else {
            System.out.println("Ambos numeros son iguales");
        }
    }
    public static void menuChoice(){
        Scanner choice = new Scanner(System.in);
        System.out.println("Elige 1 para comparar mas numeros");
        System.out.println("Elige 2 para salir");
        int optionchoice = choice.nextInt();

        if (optionchoice == 1){
            System.out.println("Has elegido la opcion 1 y seguir comparando numeros");
            compareNumber();
        } else if (optionchoice == 2){
            System.out.println("Has elegido salir. ¡Hasta pronto!");
        } else{
            System.out.println("Opcion no valida. Vuelve a elegir");
            menuChoice();
        }

    }
}

