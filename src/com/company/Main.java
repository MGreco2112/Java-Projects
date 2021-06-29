package com.company;

import java.util.*;

public class Main {

    static List<Product> Products = new ArrayList<>();

    static void displayProducts(List name) {
        for (int i = 0; i < name.size(); i++) {
            System.out.println(name.get(i));
        }
    }

    static void displayProducts(String type) {
        for (Product product: Products) {
            if (type == "Fruit" && product instanceof Fruit) {
                System.out.println(((Fruit) product));
            } else if (type == "Meat" && product instanceof Meat) {
                System.out.println(((Meat) product));
            }
        }

    }


    static void displayProducts(List name, int index) {
        System.out.println(name.get(index));
    }



    public static void main(String[] args) {

        Products.add(new Fruit("Apple", 5, 2));
        Products.add(new Fruit("Banana", 7, 3));
        Products.add(new Fruit("Orange", 9, 4));
        Products.add(new Meat("Pork", 7, 8));
        Products.add(new Meat("Chicken", 9, 8));
        Products.add(new Meat("Beef", 10, 9));

//        displayProducts(Products);
//        displayProducts(Products, 4);
//        displayProducts.displayProducts(Products, "Fruit");
        displayProducts.displayProducts(Products, "Meat");


    }
}
