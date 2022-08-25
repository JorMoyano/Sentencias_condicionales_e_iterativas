package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Escriba un numero");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            if (isPrime(i)){
                System.out.println(i);
            }
        }
    }
    private static boolean isPrime(int number){
        boolean isPrime = true;
        for (int i = 2; i < number ; i++) {
            if (number % i == 0){
                isPrime = false;
            }
        } return  isPrime;
    }
}