package com.company;

public class ЗимняяКуртка implements Куртка{
    @Override
    public void putOn() {
        System.out.print("Надеваю свою зимнюю куртку ");
    }

    @Override
    public void putOff() {
        System.out.print("Снимаю свою зимнюю куртку ");
    }
}
