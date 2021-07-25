package com.company;

public class БотинкиОбувь implements Обувь{
    @Override
    public void putOn() {
        System.out.print("Обуваю свои ботинки ");
    }

    @Override
    public void putOff() {
        System.out.print("Разуваю свои ботинки ");
    }
}
