package com.company;

public class КроссовкиОбувь implements Обувь{
    @Override
    public void putOn() {
        System.out.print("Обуваю свои кроссовки ");
    }

    @Override
    public void putOff() {
        System.out.print("Разуваю свои кроссовки ");
    }
}
