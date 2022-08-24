package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bienvenido! Aqui podra determinar si un numero es primo o no");
        System.out.println("Si es primo, figurara 'true");
        System.out.println("Si no es primo, figurara 'false'");
        primeNumber();
        menuOption();

    }

    public static void primeNumber() {

        System.out.print("El numero elegido es: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;

            }
        }
        System.out.println(isPrime);

    }

       public static void menuOption(){
        System.out.println("¿Desea comprobar si otro numero es primo?");
        System.out.println("1) Comprobar otro numero");
        System.out.println("2) Salir del programa");
        Scanner scanOption = new Scanner(System.in);
        int option = scanOption.nextInt();

        if (option == 1) {
            System.out.println("Ha elegido comprobar otro numero para saber si es primo");
            primeNumber();
        } else if (option == 2){
            System.out.println("Ha elegido salir del programa");
            System.out.println("Esperamos que haya disfrutado su recorrido, hasta pronto");
        } else {
            System.out.println("Opcion elegida invalida, por favor, vuelva a elegir");
            menuOption();
        }

    }
}