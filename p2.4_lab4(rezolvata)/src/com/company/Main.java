package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bat bat=new Bat();
        bat.read();
        System.out.println("Betisoarele nesortate sunt: ");
        bat.print();
        bat.sortareInsertie();
        System.out.println("Betisoarele SORTATE sunt: ");
        bat.print();
    }
}
