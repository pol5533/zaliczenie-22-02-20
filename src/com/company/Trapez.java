package com.company;

public class Trapez extends Figury implements Info
{
    @Override
    void opis()
    {
        System.out.println("Trapezy są zazwyczaj trochę trapezowate.");
    }

    @Override
    public void kolor()
    {
        System.out.println("To jest definitywnie zielony trapez.");
    }
}
