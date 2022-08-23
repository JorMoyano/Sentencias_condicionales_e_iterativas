
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Programa para indicar nombre y estado de estudios del alumno

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del alumno: ");
        String studentName = myScanner.nextLine();

        System.out.println("Ingrese la nota del primer examen: ");
        int noteExamenOne = myScanner.nextInt();

        System.out.println("Ingrese la nota del segundo examen: ");
        int noteExamenTwo = myScanner.nextInt();

        System.out.println("Ingrese la nota del tercer examen: ");
        int noteExamenThree = myScanner.nextInt();

        double averageNotes = (noteExamenOne + noteExamenTwo + noteExamenThree) / 3;

        if (averageNotes < 1){
            System.out.println("Error, promedio fuera de rango, revise las notas cargadas");
        } else if (averageNotes < 6){
            System.out.println("El alumno " + studentName + " esta desaprobado con promedio: " + averageNotes);
        } else if (averageNotes < 9){
            System.out.println("El alumno " + studentName + " esta aprobado con promedio: " + averageNotes);
        } else if (averageNotes <= 10){
            System.out.println("El alumno " + studentName + " esta promocionado con promedio: " + averageNotes);
        } else {
            System.out.println("Promedio fuera del rango permitido, revise las notas cargadas");
        }


    }
}
