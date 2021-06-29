package com.company;

public class Meat extends Product{

    public Meat(String name, int quantity, int price) {
        super(name, quantity, price);
    }

    public String saleDays() {
        return "50% Off Wednesday's & Saturday's!";
    }

    public String toString() {
        if (quantity > 0) {
            return "There are " + quantity + " " + name + "s in stock. The cost is $" + price + "\n" + saleDays();
        }
        return name + " is out of stock.";
    }
}
