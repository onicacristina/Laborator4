package com.company;

import java.util.Random;

public class RandomArray {
    int [] a = new int[49];
    int [] b = new int[6];
    Random random = new Random();

    public void generateArray()
    {
        for (int i = 0; i <a.length ; i++) {
            a[i]= random.nextInt(100);
            System.out.print(a[i] + "  ");
            if(i%15==0 && i!=0)
                System.out.println();
        }
    }

    public int getNumber()
    {
        return a[random.nextInt(a.length)];
    }
    
    public void generateSixNumber()
    {
        for (int i = 0; i <b.length ; i++) {
            b[i]=getNumber();
            System.out.print(b[i] + "  ");
        }
    }

    public void sortareSelectie()
    {
        int k,aux;
        for (int i = 0; i <b.length-1 ; i++) {
            k=i; //pozitia minima
            aux=b[i]; //retine minimul
            for (int j = i+1; j < b.length; j++)
                if(b[j]<aux)
                {
                    aux=b[j];
                    k=j;
                }
             b[k]=b[i];
             b[i]=aux;
        }
        for (int i = 0; i <b.length ; i++) {
            System.out.print(b[i] +"  ");
        }
    }
}
