package com.company;

public class Main {

    public static void main(String[] args) {
        int [][] arrayOne = {
                {1, 2, 0},
                {3, 1, 4},
                {3, 0, 1}
        };
        //Suma  de los elementos de la matriz
        int additionElements = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                additionElements = additionElements + arrayOne[i][j];
            }
        } System.out.println("La suma de todos los elementos de la matriz es: " + additionElements);

        // Multiplicacion de los elementos de la matriz
        int multiplicationElements = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                multiplicationElements = multiplicationElements * arrayOne[i][j];
            }
        } System.out.println("La multiplicacion de todos los elementos de la matriz es: " + multiplicationElements);

        //Suma de los elementos de la diagonal principal
        int additionPrincipalDiagonal = 0;
        for (int i = 0; i < 3; i++) {
            additionPrincipalDiagonal = additionPrincipalDiagonal + arrayOne[i][i];
            }
         System.out.println("La suma de los elementos de la diagonal principal de la matriz es: " + additionPrincipalDiagonal);

        //Multiplicacion de los elementos de la diagonal principal
        int multiplicationPrincipalDiagonal = 1;
        for (int i = 0; i < 3; i++) {
            multiplicationPrincipalDiagonal = multiplicationPrincipalDiagonal * arrayOne[i][i];
        }
         System.out.println("La multiplicacion de los elementos de la diagonal principal de la matriz es: " + multiplicationPrincipalDiagonal);

        //Suma de los elementos de la diagonal secundaria
        int additionSecundariaDiagonal = 0;
        for (int i = 0; i < 3; i++) {
            additionSecundariaDiagonal = additionSecundariaDiagonal + arrayOne[i][2 - i];
        }
        System.out.println("La suma de los elementos de la diagonal secundaria de la matriz es: " + additionSecundariaDiagonal);

        //Multiplicacion de los elementos de la diagonal secundaria
        int multiplicationSecundariaDiagonal = 1;
        for (int i = 0; i < 3; i++) {
            multiplicationSecundariaDiagonal = multiplicationSecundariaDiagonal * arrayOne[i][2 - i];
        }
        System.out.println("La multiplicacion de los elementos de la diagonal secundaria de la matriz es: " + multiplicationSecundariaDiagonal);


    }

}