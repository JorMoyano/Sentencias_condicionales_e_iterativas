package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    //
        System.out.println("Bienvenido!!! ");
        menuOption();
    }
    public static void menuOption(){

        System.out.println("Por favor, elige una de las opciones para proceder");
        System.out.println("1) Comparar dos numeros");
        System.out.println("2) Calcular precio de un producto adquirido");
        System.out.println("3) Determinar la situacion academica del alumno");
        System.out.println("4) Imprimir la palabra 'foo'");
        System.out.println("5) Imprimir los numeros del 1 al 10");
        System.out.println("6) Imprimir escaleras de *");
        System.out.println("7) Salir del programa");
        System.out.print("La opcion elegida es: ");

        Scanner choiceScan = new Scanner(System.in);
        int option = choiceScan.nextInt();
        if (option == 1){
            System.out.println("Usted ha elegido la opcion n° 1: Comparar dos numeros");
            compareNumber();
            menuChoice();
            menuOption();
        } else if (option == 2){
            System.out.println("Usted ha elegido la opcion n° 2: Calcular precio de un producto adquirido");
            paymentMethod();
            menuOption();
        } else if (option == 3){
            System.out.println("Usted ha elegido la opcion n° 3: Determinar la situacion academica del alumno");
            studentAverage();
            menuOption();
        } else if (option == 4){
            System.out.println("Usted ha elegido la opcion n° 4: Imprimir la palabra 'foo'");
            printLine();
            menuOption();
        } else if (option == 5){
            System.out.println("Usted ha elegido la opcion n° 5: Imprimir los numeros del 1 al 10");
            printNumber();
            menuOption();
        } else if (option == 6){
            System.out.println("Usted ha elegido la opcion n° 6: Imprimir escalera de *");
            stairPrint();
            menuOption();
        } else if (option == 7){
            System.out.println("Usted ha elegido la opcion n° 7: Salir");
            System.out.println("Esperamos que se haya divertido!");
            System.out.println("¡Hasta pronto!");
        } else {
            System.out.println("Opcion invalida. Por favor, vuelva a elegir");
            menuOption();
        }
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
    public static void paymentMethod(){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto a comprar: ");
        String productName = myScanner.nextLine();

        System.out.println("Ingrese el precio del producto: ");
        Double productPrice = myScanner.nextDouble();
        System.out.println("Elija el medio de pago: ");
        System.out.println("1) Contado 15% de descuento");
        System.out.println("2) Debito precio de lista");
        System.out.println("3) Tarjeta de credito 10% de recargo");
        int paymentMethod = myScanner.nextInt();

        if (paymentMethod == 1){
            System.out.println("El precio a abonar por el producto " + productName + " es de: $" + (productPrice*0.85));
        } else if (paymentMethod == 2){
            System.out.println("El precio a abonar por el producto " + productName + " es de: $" + productPrice);
        } else if (paymentMethod == 3){
            System.out.println("El precio a abonar por el producto " + productName + " es de: $" + (productPrice*1.10));
        } else {
            System.out.println("Metodo de pago no valido, vuelva a intentar");
            paymentMethod();
        }
    }
    public static void studentAverage(){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del alumno: ");
        String studentName = myScanner.nextLine();

        System.out.println("Las notas a ingresar son de un rango de 1 a 10");
        System.out.println("Ingrese la nota del primer examen: ");
        Byte noteExamenOne = myScanner.nextByte();

        if (noteExamenOne < 1 || noteExamenOne > 10){
            System.out.println("Nota no dentro del rango valido, vuelva a iniciar la carga");
            studentAverage();
        }

        System.out.println("Ingrese la nota del segundo examen: ");
        Byte noteExamenTwo = myScanner.nextByte();
        if (noteExamenTwo < 1 || noteExamenTwo > 10){
            System.out.println("Nota no dentro del rango valido, vuelva a iniciar la carga");
            studentAverage();
        }

        System.out.println("Ingrese la nota del tercer examen: ");
        Byte noteExamenThree = myScanner.nextByte();
        if (noteExamenThree < 1 || noteExamenThree > 10){
            System.out.println("Nota no dentro del rango valido, vuelva a iniciar la carga");
            studentAverage();
        }
        float averageNotes = (noteExamenOne + noteExamenTwo + noteExamenThree)/3;

        if (averageNotes >= 1 && averageNotes < 6){
            System.out.println("El alumno " + studentName + " esta desaprobado con promedio: " + averageNotes);
        } else if (averageNotes >= 6 && averageNotes < 9){
            System.out.println("El alumno " + studentName + " esta aprobado con promedio: " + averageNotes);
        } else if (averageNotes >= 9 && averageNotes <= 10){
            System.out.println("El alumno " + studentName + " esta promocionado con promedio: " + averageNotes);
        } else {
            System.out.println("Promedio fuera del rango permitido, revise las notas cargadas");
        }
    }

    public static void printLine(){
        for (int i = 0; i < 10; i++) {
            System.out.println("foo");
        }
    }

    public static void printNumber(){
        for (int number = 1; number < 11; number++) {
            System.out.println(number);
        }
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