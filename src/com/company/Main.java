package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bienvenido!!!");
        multiplicationTable();

    }
    public static void multiplicationTable(){
        Scanner scanNumber = new Scanner(System.in);
        System.out.println("Ingrese un numero entre 2 y 9 para mostrar la tabla de multiplicaciones de tal numero");
        System.out.println("Ingresar numero: ");
         int numberChosen = scanNumber.nextInt();
        System.out.println("La tabla de multiplicacion del numero " + numberChosen + " es: ");
        for (int i = 1; i < 11; i++) {
            System.out.println(numberChosen + " * " + i + " = " + (numberChosen*i));
        }menuOption();
    }
    public static void menuOption() {
        Scanner scanOption = new Scanner(System.in);
        System.out.println("¿Desea revisar otra tabla de multiplicar?");
        System.out.println("Para ver otra tabla, presiona 1");
        System.out.println("Para salir, presiona 2");
        System.out.print("Ingresar opcion: ");
        int option = scanOption.nextInt();

        if (option == 1) {
            System.out.println("Ha elegido la opcion 1, ver otra tabla de multiplicacion");
            multiplicationTable();
        } else if (option == 2) {
            System.out.println("Ha elegido salir del programa");
            System.out.println("Esperamos que lo haya disfrutado. Hasta pronto");
        } else {
            System.out.println("Opcion no valida, por favor, vuelva a elegir");
            menuOption();
        }
    }
}