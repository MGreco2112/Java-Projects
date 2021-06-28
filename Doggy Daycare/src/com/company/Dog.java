package com.company;

public class Dog extends Animal{

    String breed;
    String chipId;
    String snoutLength;
    String noise;


    public Dog(int legs, String size, String name, String noise, String snoutLength, String breed, String chipId,
               Boolean isFixed,
               Boolean isOwned) {
        super(legs, size, name, isFixed, isOwned);
        this.breed = breed;
        this.chipId = chipId;
        this.snoutLength = snoutLength;
        this.noise = noise;
    }

    public String speak() {

        if (!this.noise.equals("")) {
            return this.noise;
        } else {
            return "Awoo!!!";
        }
    }

    public String toString() {
        return String.format("Name: %s, Size: %s, Legs: %s, Breed: %s, Snout Length: %s, Chip Number: %s", this.name,
                this.size, this.legs, this.breed, this.snoutLength, this.chipId);
    }


}
