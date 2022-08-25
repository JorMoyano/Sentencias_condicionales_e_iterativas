package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bienvenido!!");
        System.out.println("Aqui puede consultar los montos de convertir pesos a dolares, reales o euros");
        pesosAmount();
        menuOption();

    }

    //Programa para convertir pesos en reales, dolares o euros
    public static void pesosAmount() {
        //Ratios de conversion de pesos a otra moneda
        float realRate = 211.25F; //VALOR FIJO DE 1 REAL EQUIVALE A PESOS 211,25
        float  dolarRate = 283.14F; //VALOR FIJO DE 1 DOLAR EQUIVALE A PESOS 283,14
        float euroRate = 319.43F; //VALOR FIJO DE 1 EURO EQUIVALE A PESOS 319.43

        Scanner scanChoice = new Scanner(System.in);
        System.out.print("Por favor, ingrese el monto en pesos a convertir: $");
        float pesosAmount = scanChoice.nextFloat();

        //Ingreso por parte del usuario de la moneda a la que quiere convertir el monto en pesos ingresado
        System.out.println("Por favor, elija la moneda a la que quiere realizar la conversion");
        System.out.println("1) Reales");
        System.out.println("2) Dolares");
        System.out.println("3) Euros");
        System.out.print("La opcion elegida es: ");
        float convertionAmount = 0;
        DecimalFormat formatRound = new DecimalFormat("#.00");

        //Menu para determinar a que moneda quiere convertir el monto en pesos ingresado
        Scanner scanMenuOption = new Scanner(System.in);
        int optionTaken = scanMenuOption.nextInt();

        if (optionTaken == 1) {
            convertionAmount = pesosAmount * realRate;
            System.out.println("La cantidad de $" + pesosAmount + " corresponde a " + formatRound.format(convertionAmount) + " reales");
        } else if (optionTaken == 2) {
            convertionAmount = pesosAmount * dolarRate;
            System.out.println("La cantidad de $" + pesosAmount + " corresponde a " + formatRound.format(convertionAmount)  + " dolares");

        } else if (optionTaken == 3) {
            convertionAmount = pesosAmount * euroRate;
            System.out.println("La cantidad de $" + pesosAmount + " corresponde a " + formatRound.format(convertionAmount) + " euros");

        } else {
            System.out.println("La opcion elegida no es valida, por favor vuelva a intentar");
            pesosAmount();
        }

    }
    //Menu para determinar si el usuario quiere realizar otra conversion o salir del programa
    public static void menuOption(){
        System.out.println("¿Desea realizar alguna conversion mas?");
        System.out.println("1) Realizar otra conversion");
        System.out.println("2) Salir");
        Scanner scanMenuNumber = new Scanner(System.in);
        System.out.print("La opcion elegida es: ");
        int numberOption = scanMenuNumber.nextInt();

        if (numberOption == 1){
            System.out.println("Ha decidido realizar otra conversion");
            pesosAmount();
        } else if (numberOption == 2){
            System.out.println("Usted a elegido salir");
            System.out.println("Gracias por utilizar nuestro sistema. Hasta pronto");
        } else {
            System.out.println("La opcion elegida es invalida, vuelva a intentar");
            menuOption();
        }
    }

}