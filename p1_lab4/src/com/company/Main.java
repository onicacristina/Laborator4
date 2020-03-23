package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here
        Vector vector = new Vector();

        Menu menu = new Menu();
        menu.printMenu();

        char op;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println();
            System.out.println("Alegeti o optiune: ");
             op= scanner.next().charAt(0);
             op = Character.toUpperCase(op);

            switch(op){
                case 'C' : vector.generateRandom(); break;
                case 'V' : vector.view(); break;
                case 'R' : vector.back(); break;
                case 'I' : vector.sortareInsertie(); break;
                case 'B' : vector.insertieBinara(); break;
                case 'S' : vector.sortareSelectie(); break;
                case 'T' : vector.bubbleSort(); break;
                case 'H' : vector.shakerSort(); break;
                case 'X' : System.out.println("Ati ales sa iesiti din program!"); break;
                default: System.out.println("OPTIUNE ERONATA......reincearca!");
            }

        }while(op!='x' && op!='X');


    }
}
