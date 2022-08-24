package com.company;

public class Main {

    public static void main(String[] args) {
        // Programa para hacer triangulos con *

        // Imprimir la escalera de * de 1 a 7 unidades
        String chars = "";
        for (int i = 0; i < 7; i++) {
            chars += "*";
            System.out.println(chars);
        }
        System.out.println();

        //Imprimir la escalera de * de 7 a 1 unidad
        for (int j = 0; j < 7; j++) {
            String charsTwo = "";
            int maxChars = 7 - j;
            for (int i = 0; i < maxChars; i++) {
                charsTwo += "*";
            }
            System.out.println(charsTwo);
        }
        System.out.println();

        //Imprimir escalera de 1 a 7 * pero al reves a la primera realizada
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