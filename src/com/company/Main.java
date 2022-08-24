
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Programa para indicar nombre y estado de estudios del alumnno

        studentAverage();
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
}
