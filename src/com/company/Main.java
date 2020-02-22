package com.company;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {

        ArrayList<Figury> trapezy = new ArrayList<>();
        ArrayList<Figury> deltoidy = new ArrayList<>();
        ArrayList<Figury> kwadraty = new ArrayList<>();

        trapezy.add(new Trapez());
        deltoidy.add(new Deltoid());
        kwadraty.add(new Kwadrat());

        for ( Figury trap : trapezy) {
            trap.print();
        }

        for ( Figury sqr  : kwadraty) {
            sqr.print();
        }

        for ( Figury delt : deltoidy) {
            delt.print();
        }


//        Kwadrat ktab[] = new Kwadrat[1];
//        ktab[0] = new Kwadrat();
//        ktab[0].opis();
//        ktab[0].kolor();
//
//
//
//        System.out.println("_________________________________________________________________");
//
//        Trapez ttab[] = new Trapez[1];
//        ttab[0] = new Trapez();
//        ttab[0].opis();
//        ttab[0].kolor();
//
//        System.out.println("_________________________________________________________________");
//
//        Deltoid dtab[] = new Deltoid[1];
//        dtab[0] = new Deltoid();
//        dtab[0].opis();
//        dtab[0].kolor();

    }
}

