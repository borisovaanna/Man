package com.company;

public class Человек implements ЯЧеловек{
    private String name;
    private Штаны pants;
    private Куртка jacket;
    private Обувь shoes;

    public Человек(Штаны pants, Куртка jacket, Обувь shoes) {
        this.pants = pants;
        this.jacket = jacket;
        this.shoes = shoes;
    }

    public Человек() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Штаны getШтаны() {
        return pants;
    }

    public void setШтаны(Штаны pants) {
        this.pants = pants;
    }

    public Куртка getКуртка() {
        return jacket;
    }

    public void setКуртка(Куртка jacket) {
        this.jacket = jacket;
    }

    public Обувь getОбувь() {
        return shoes;
    }

    public void setОбувь(Обувь shoes) {
        this.shoes = shoes;
    }

    @Override
    public void putOn() {
        pants.putOn();
        jacket.putOn();
        shoes.putOn();
    }

    @Override
    public void putOff() {
        pants.putOff();
        jacket.putOff();
        shoes.putOff();
    }
}
