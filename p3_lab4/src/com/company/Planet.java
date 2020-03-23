package com.company;

import java.util.Scanner;

public class Planet {
    public String name;
    public int x;
    public int y;
    public int z;
    int i,n;

    Planet  p [] = new Planet[50];
    int d[][] = new int[50][50];

    public void readPlanets()
    {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Introduceti numarul de planete (>2) : ");
            n = scanner.nextInt();
        }while(n<3);
        System.out.println();
        for (int i = 0; i <n ; i++) {
            System.out.println("Introduceti datele pentru planeta " + (i+1) +" :");
            System.out.println("--------------------------------------");
            p[i] = new Planet();
            System.out.println("Numele planetei : ");
            ((Planet)p[i]).name= scanner.next();
            System.out.println("Coordonata x: ");
            ((Planet)p[i]).x= scanner.nextInt();
            System.out.println("Coordonata y: ");
            ((Planet)p[i]).y= scanner.nextInt();
            System.out.println("Coordonata z: ");
            ((Planet)p[i]).z= scanner.nextInt();
        }
    }
    public void printPlanets()
    {
        System.out.println();
        System.out.println("Planetele sunt : ");

        for (int i = 0; i <n ; i++) {
            System.out.print("Planeta nr. " +(i+1) + " :  ");
            System.out.println(((Planet)p[i]).name +"(" +((Planet)p[i]).x +"," +((Planet)p[i]).y+","+((Planet)p[i]).z+")");
        }
    }

    public void distanceBetweenPlanets()
    {
        System.out.println();
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j <n ; j++) {
                d[i][j]=(int)Math.sqrt(Math.pow((((Planet)p[i]).x-((Planet)p[j]).x),2)+Math.pow((((Planet)p[i]).y-((Planet)p[j]).y),2)+Math.pow((((Planet)p[i]).z-((Planet)p[j]).z),2));
                System.out.println("Distanta dintre planetele "+((Planet)p[i]).name+" si "+((Planet)p[j]).name +" este: " + d[i][j]);
            }
        }
    }

    public void distanceMinMax()
    {
        int mini=Integer.MAX_VALUE;
        int maxi=Integer.MIN_VALUE;
        int i_maxi=0,i_mini=0,j_maxi=0,j_mini=0;
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j <n ; j++) {
                if(d[i][j]<mini)
                {
                    mini=d[i][j];
                    i_mini=i;
                    j_mini=j;
                }
                if(d[i][j]>maxi)
                {
                    maxi=d[i][j];
                    i_maxi=i;
                    j_maxi=j;
                }
            }
        }
        System.out.println();
        System.out.print("Pereche cea mai apropiata de planete este : " + ((Planet)p[i_mini]).name +" si "+ ((Planet)p[j_mini]).name+" .");
        System.out.println("Distanta dintre ele (minima) este: " + mini +" .");
        System.out.println(".................");
        System.out.print("Cele mai indepartate 2 planete sunt : " + ((Planet)p[i_maxi]).name +" si "+ ((Planet)p[j_maxi]).name+" .");
        System.out.println("Distanta dintre ele (maxima) este: " + maxi +" .");
    }
}
