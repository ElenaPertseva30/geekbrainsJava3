package ru.geekbrains.hwlesson1;

public class Main {

    public static void main(String[] args) {

        Apple a1 = new Apple();
        Apple a2 = new Apple();

        Orange o1 = new Orange();
        Orange o2 = new Orange();

        Box b1  = new Box();
        Box b2  = new Box();

        b1.addFruit(a1);
        b1.addFruit(a2);

        b2.addFruit(o1);
        b2.addFruit(o2);

        b1.getBox();
        System.out.println(b1.getBox());
        b1.getWeight();
        System.out.println(b1.getWeight());
        b2.getBox();
        System.out.println(b1.getBox());
        b2.getWeight();
        System.out.println(b2.getWeight());

    }

}
