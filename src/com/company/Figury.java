package com.company;

abstract public class Figury implements Info
{
    abstract void opis();

    Figury(){};

    @Override
    public void kolor() {

    }

    void print(){
        opis();
        kolor();
        System.out.println();
    }
}

