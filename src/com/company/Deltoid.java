package com.company;

public class Deltoid extends Figury implements Info
{
    @Override
    void opis()
    {
        System.out.println("Deltoidy są zazwyczaj trochę jak latawce.");
    }

    @Override
    public void kolor()
    {
        System.out.println("Jak deltoidy są przypominają latawce to ten jest kolorowy.");
    }
}
