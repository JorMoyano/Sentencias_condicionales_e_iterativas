package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// programa para ingresar un producto, su precio y su forma de pago
        paymentMethod();
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

}
