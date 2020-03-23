package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        RandomArray array = new RandomArray();
        System.out.println("\nCele 49 de numere generate sunt: ");
        System.out.println("----------------------------------");
        array.generateArray();
        System.out.println("\n");
        System.out.println("Cele 6 numere extrase din sirul anterior(nesortate) sunt: ");
        array.generateSixNumber();
        System.out.println("\n");
        System.out.println("Cele 6 numere sortate sunt: ");
        array.sortareSelectie();

    }
}
