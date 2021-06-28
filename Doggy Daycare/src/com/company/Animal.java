package com.company;

public class Animal {

    int legs;
    String size;
    String name;
    Boolean isFixed;
    Boolean isOwned;


    public Animal (int legs, String size, String name, Boolean isFixed, Boolean isOwned) {
        this.legs = legs;
        this.size = size;
        this.name = name;
        this.isFixed = isFixed;
        this.isOwned = isOwned;
    }

    public String speak() {
        return "---";
    }

}
