package com.company;

public class БрюкиШтаны implements Штаны{
    @Override
    public void putOn() {
        System.out.print("Надеваю свои брюки ");
    }

    @Override
    public void putOff() {
        System.out.print("Снимаю свои брюки ");
    }
}
