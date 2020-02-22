package com.company;

public class Kwadrat extends Figury implements Info
{
    @Override
    void opis()
    {
        System.out.println("Kwadraty są zazwyczaj kwadratowe.");
    }

    @Override
    public void kolor()
    {
        System.out.println("To jest definitywnie czerwony kwadrat.");
    }
}
