package com.company;

public class ДжинсыШтаны implements Штаны{
    @Override
    public void putOn() {
        System.out.print("Надеваю свои джинсы ");
    }

    @Override
    public void putOff() {
        System.out.print("Снимаю свои джинсы ");
    }
}
