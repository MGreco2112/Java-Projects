package com.company;

public class Cat extends Animal{
    String pattern;
    String noise;
    Boolean wasStray;
    Boolean hasShots;

    public Cat (int legs, String size, String name, String pattern, String noise, Boolean wasStray, Boolean isFixed,
                Boolean isOwned, Boolean hasShots) {
        super(legs, size, name, isFixed, isOwned);

        this.pattern = pattern;
        this.wasStray = wasStray;
        this.hasShots = hasShots;
        this.noise = noise;

    }

    public String speak() {

        if (!this.noise.equals("")) {
            return this.noise;
        } else {
            return "Beow!!!";
        }
    }

    public String toString() {
        return String.format("Name: %s, Size: %s, Legs: %s, Pattern: %s", this.name, this.size, this.legs,
                this.pattern);
    }

}
