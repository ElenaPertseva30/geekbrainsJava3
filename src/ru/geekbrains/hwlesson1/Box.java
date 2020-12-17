package ru.geekbrains.hwlesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class Box <T extends Fruit>{

    ArrayList<T> box = new ArrayList<>();

    public Box(T... fruits) {
        box = new ArrayList<>(Arrays.asList(fruits));
    }

    public ArrayList<T> getBox() {
        return box;
    }

    public void addFruit(T fruits) {
        box.add(fruits);
    }

    public float getWeight() {
        float generalWeight = 0.0f;
        for (int i = 0; i < box.size(); i++) {
            generalWeight = generalWeight + box.get(i).getWeight();
        }
        return generalWeight;
    }

    public boolean compare(Box box) {
        return this.getWeight() == box.getWeight();
    }
    public void addFruitsToAnotherBox(Box<T> anotherBox) {
        anotherBox.box.addAll(this.box);
        this.box.clear();

    }

}



