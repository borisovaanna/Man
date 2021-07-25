package com.company;

public class Main { //2) По аналогии с первым задание делаем след. задание. Интерфейсы: - Куртка - Штаны - Обувь в каждом интерфейсе есть 2 метода (надеть и снять)
    // Делаем несколько реализации каждого интерфейса. Создаём класс человек: У человека поля: -имя -куртка -штаны -обувь. У человека есть 2 метода:
    // - одеться(вызываются методы надетьдеть у всех вещей) - раздеться (вызываются методы снять у всех вещей).

    public static void main(String[] args) {
        Человек man1 = new Человек();
        Человек man2 = new Человек();

        Человек name1 = new Человек();
        Человек name2 = new Человек();

        Штаны pants1 = new БрюкиШтаны();
        Штаны pants2 = new ДжинсыШтаны();

        Куртка jacket1 = new ЛетняяКуртка();
        Куртка jacket2 = new ЗимняяКуртка();

        Обувь shoes1 = new БотинкиОбувь();
        Обувь shoes2 = new КроссовкиОбувь();

        name1.setName("Петя");// 1-ый человек
        man1.setШтаны(pants1);
        man1.setКуртка(jacket2);
        man1.setОбувь(shoes1);

        System.out.print(name1.getName() + " ");
        man1.putOn();
        man1.putOff();
        System.out.println();

        name2.setName("Дима");// 2-ой человек
        man2.setШтаны(pants2);
        man2.setКуртка(jacket1);
        man2.setОбувь(shoes2);

        System.out.print(name2.getName() + " ");
        man2.putOn();
        man2.putOff();
        System.out.println();

    }
}
