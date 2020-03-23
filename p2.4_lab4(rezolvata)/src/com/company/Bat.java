package com.company;

import java.util.Scanner;

public class Bat {
    public int lungime;
     public String culoare;

    int nr_bete,i;

    Bat b[] =new Bat[100];
     public void read()
     {
         Scanner scanner = new Scanner(System.in);
         do {
             System.out.println("Dati numarul de bete (5..50) : ");
             nr_bete = scanner.nextInt();
         }while ((nr_bete<5)||(nr_bete>51));
         //Object [] b= new Object[n];
         for (int i = 1; i <=nr_bete ; i++) {
             b[i]= new Bat();
             System.out.println("Dati lungimea batului nr." + i +" :");
             ((Bat)b[i]).lungime=scanner.nextInt();
             System.out.println("Dati culoarea batului nr." + i +" :");
             ((Bat)b[i]).culoare=scanner.next();

         }
     }
     public void print()
     {
         //System.out.println("Betisoarele nesortate sunt: ");
         for (int i = 1; i <=nr_bete ; i++) {
             System.out.println(((Bat)b[i]).culoare +" -> " + ((Bat)b[i]).lungime );
         }
     }

     public void sortareInsertie()
     {
         int j;
         Bat aux;
         for (int i = 2; i <=nr_bete ; i++) {
             aux=b[i];
             j=i-1;
             while(j>0 && ((Bat)b[j]).lungime>aux.lungime)
             {
                 b[j+1]=b[j];
                 j--;
             }
             b[j+1]=aux;
         }
     }
}
