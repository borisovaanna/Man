package com.company;

public class ЛетняяКуртка implements Куртка{
    @Override
    public void putOn() {
        System.out.print("Надеваю свою летнюю куртку ");
    }

    @Override
    public void putOff() {
        System.out.print("Снимаю свою летнюю куртку ");
    }
}
