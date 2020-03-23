package com.company;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import static java.lang.System.currentTimeMillis;


public class Vector {
    int v []= new int[100];
    int copy [] = new int[100];
    int i,n;

    public void generateRandom()
    {
        System.out.println("Introduceti numarul de elemente ale vectorului: ");
        System.out.print("n= ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        Random rand = new Random();
        for (int i = 0; i <n ; i++)
        {
            v[i]=rand.nextInt(100);
            copy[i]=v[i];
        }
    }

    public void view()
    {
        System.out.println("Elementele tabloului sunt: ");
        for (int i = 0; i <n ; i++) {
            System.out.print(v[i] +"  ");
        }
        System.out.println();
    }
    public void back()
    {
        for (int i = 0; i <n ; i++) {
            v[i]=copy[i];
        }
    }
    public void sortareInsertie()  throws InterruptedException
    {
        long start= currentTimeMillis();
        Thread.sleep(100);
        for (int i = 0; i <n ; i++) {
            int p=i;
            while(p>0 && v[p]<v[p-1]) {
                int aux = v[p];
                v[p] = v[p - 1];
                v[p - 1] = aux;
                p--;
            }

        }
        long end= currentTimeMillis();
        long duration= end-start;
        System.out.println("Duration: " +duration);
    }

    public void insertieBinara()  throws InterruptedException
    {
        long start= currentTimeMillis();
        Thread.sleep(100);
        for (int i = 1; i <n ; i++) {
            int x=v[i];
            int j = Math.abs(Arrays.binarySearch(v,0,i,x)+1);
            System.arraycopy(v,j,v,j+1,i-j);
            v[j]=x;

        }
        long end= currentTimeMillis();
        long duration= end-start;
        System.out.println("Duration: " +duration);
    }

    public  void sortareSelectie()  throws InterruptedException
    {
        long start= currentTimeMillis();
        Thread.sleep(100);
        int j,k,aux;
        for (int i = 0; i <n-1 ; i++) {
            aux=v[i];
            k=i;
            for ( j = i+1; j <n ; j++)
                if(v[j]<aux)
                {
                    aux=v[j];
                    k=j;
                }
             v[k]=v[i];
             v[i]=aux;

        }
        long end= currentTimeMillis();
        long duration= end-start;
        System.out.println("Duration: " +duration);
    }

    public void bubbleSort()  throws InterruptedException
    {
        long start= currentTimeMillis();
        Thread.sleep(100);
        int ok;
        int aux;
        do
        {
            ok=0;
            for (int i = 0; i <n-1 ; i++) {
                if(v[i]>v[i+1])
                {
                    aux=v[i];
                    v[i]=v[i+1];
                    v[i+1]=aux;
                    ok=1;
                }

            }
        }while(ok==1);
        long end= currentTimeMillis();
        long duration= end-start;
        System.out.println("Duration: " +duration);
    }

    public void shakerSort()  throws InterruptedException
    {
        long start= currentTimeMillis();
        Thread.sleep(100);
        int j,k,st,dr,aux;
        st=1;
        dr=n-1;
        k=n-1;
        do {
            for (j = dr; j >=st ; j--)
                if(v[j-1]>v[j])
                {
                    aux=v[j-1];
                    v[j-1]=v[j];
                    v[j]=aux;
                    k=j;
                }
                st=k+1;
                for (j = st; j <=dr ; j++)
                    if(v[j-1]>v[j])
                    {
                        aux=v[j-1];
                        v[j-1]=v[j];
                        v[j]=aux;
                        k=j;
                    }
                 dr=k-1;
        }while(st<=dr);
        long end= currentTimeMillis();
        long duration= end-start;
        System.out.println("Duration: " +duration);
    }
}
