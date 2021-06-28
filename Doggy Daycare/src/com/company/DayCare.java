package com.company;


import java.util.ArrayList;

public class DayCare {

    public static void addAnimal(Animal newAnimal, ArrayList<Animal> desiredList) {
        desiredList.add(newAnimal);
    }

    public static void displayAnimals(ArrayList<Animal> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Dog) {
                System.out.println("Dog\n" + list.get(i));
            } else if (list.get(i) instanceof Cat) {
                System.out.println("Cat\n" + list.get(i));
            }
        }
    }

    public static void removeAnimal(String name, ArrayList<Animal> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).name.equals(name)) {
                list.remove(i);
            }
        }
    }

    public static void animalNoises(ArrayList<Animal> list) {
        for (int i = 0; i < list.size(); i++) {


            System.out.println(list.get(i).name + " goes " + list.get(i).speak());
        }
    }



}
