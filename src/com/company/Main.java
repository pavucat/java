package com.company;


import java.util.Arrays;
import java.util.Random;

public class Main {
    public static int factorial(int x)
    {
        int f=1;
        while(x>0) {
            f*=x;
            x--;
            }
        return f;
    }
    public static void main(String[] args) {

//#3

        /*int x = 5;
        int sum=0;
	int [] a=new int [x];
        for(int i=0; i<a.length; i++)
            a[i]=i;
	for(int i=0; i<a.length; i++)
	    sum+=a[i];
	System.out.println(sum);*/

//#4

        /*for (int i=0; i<args.length; i++)
            System.out.println(args[i]);*/

//#5

        /*float x=1;
        for(int i=0; i<10; i++) {
            System.out.format("%f%n", 1 / x);
            x++;
        }*/

//#6

        /*Random r = new Random();
        int x= r.nextInt(11);
        int [] a=new int [x];
        for(int i=0; i<a.length; i++)
            a[i]= r.nextInt(101);
        for(int i=0; i<a.length; i++)
            System.out.println(a[i]);
        Arrays.sort(a, 0, a.length);
            System.out.println();
        for(int i=0; i<a.length; i++)
            System.out.println(a[i]);*/

//#7

        /*int a=4;
        a=Main.factorial(a);
        System.out.println(a);*/
    }
}
