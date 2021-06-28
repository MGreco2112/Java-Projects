package com.company;

import java.util.ArrayList;

public class Main {

    static ArrayList<Animal> daycareAnimals = new ArrayList<>();

    public static void main(String[] args) {

//        Dog holly = new Dog(4, "Small", "Holly", "Yip-Yip!", "Short", "Cavishon", "#337", Boolean.TRUE, Boolean.TRUE);
//        holly.speak();


        DayCare.addAnimal(new Dog(4, "Small", "Holly", "", "Short", "Cavishon", "#337", Boolean.TRUE, Boolean.TRUE)
                        , daycareAnimals);
        DayCare.addAnimal(new Cat(4, "Small", "Zippy", "Calico", "", Boolean.TRUE, Boolean.TRUE, Boolean.FALSE,
                        Boolean.FALSE), daycareAnimals);

        DayCare.displayAnimals(daycareAnimals);
        DayCare.animalNoises(daycareAnimals);

        DayCare.removeAnimal("Zippy", daycareAnimals);

        DayCare.displayAnimals(daycareAnimals);






    }
}
