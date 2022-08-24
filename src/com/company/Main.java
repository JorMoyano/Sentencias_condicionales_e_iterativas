package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Programa para hacer triangulos con *, debiendo elegir cual de las opciones disponibles desea ver en pantalla
        stairPrint();
    }
    public static void stairPrint() {

        Scanner myScan = new Scanner(System.in);
        System.out.println("Elige que quieres ver en pantalla");
        System.out.println("1) Escalera de 1 a 7 * de izquierda a derecha");
        System.out.println("2) Escalera de 7 a 1 * de izquierda a derecha");
        System.out.println("3) Escalera de 1 a 7 * de derecha a izquierda");
        System.out.println("4) Salir del programa");
        System.out.print("La opcion elegida es: ");
        int option = myScan.nextInt();

        if (option == 1) {
            stairOne();
            stairPrint();
        } else if (option == 2) {
            stairTwo();
            stairPrint();
        } else if (option == 3) {
            stairThree();
            stairPrint();
        } else if (option ==4){
            System.out.println("Ha elegido salir del programa, ¡hasta pronto!");
        } else {
            System.out.println("Eleccion fuera del rango permitido, por favor, vuelva a elegir");
            stairPrint();
        }
    }
        // Imprimir la escalera de * de 1 a 7 unidades
        public static void stairOne(){

        String chars = "";
        for (int i = 0; i < 7; i++) {
            chars += "*";
            System.out.println(chars);
        }
        System.out.println();
    }
        //Imprimir la escalera de * de 7 a 1 unidad
    public static void stairTwo() {
        for (int j = 0; j < 7; j++) {
            String charsTwo = "";
            int maxChars = 7 - j;
            for (int i = 0; i < maxChars; i++) {
                charsTwo += "*";
            }
            System.out.println(charsTwo);
        }
        System.out.println();
    }

        //Imprimir escalera de 1 a 7 * pero al reves a la primera realizada
        public static void stairThree() {
            for (int j = 0; j < 7; j++) {
                String charsThree = "";
                int maxCharsThree = 7 - j;
                for (int i = 0; i < maxCharsThree - 1; i++) {
                    charsThree += " ";
            }
                for (int i = 0; i < j + 1; i++) {
                    charsThree += "*";
            }
                System.out.println(charsThree);
        }
    }

}
