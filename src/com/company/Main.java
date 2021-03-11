package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!"); // say Hello World
        int i=10;
        int n=i++%5;
        System.out.println(i);
        System.out.println(n);

        //JAVA
        System.out.println("*--------------------------------------*");
        System.out.println("       J       a       v      v      a");
        System.out.println("       J      a a       v    v      a a");
        System.out.println("J      J     aaaaa        v v      aaaaa");
        System.out.println("   JJ       a    a         v       a    a ");
        System.out.println("*--------------------------------------*");

        //Aria si Perimetrul unui dreptunghi
        int L1=5;
        int L2=8;
        System.out.println("Perimetrul dreptunghiului este "+((L1+L2)*2));

        System.out.println("Aria dreptunghiului este: "+ (L1*L2));


        //Transformare float in int

        System.out.println(Math.round(2.35f));

    }
}
