package com.company;

import java.util.List;

public class displayProducts {

//        static void displayProducts(List name, String type) {
//        for (Object product: name) {
//            if (type == "Fruit" && product instanceof Fruit) {
//                System.out.println(((Fruit) product));
//            } else if (type == "Meat" && product instanceof Meat) {
//                System.out.println(((Meat) product));
//            }
//        }
//    }

    static void displayProducts(List name, String type) {
        for (Object product: name) {
            switch (type) {

                case "Fruit" :
//                    System.out.println("True");
                    if (product instanceof Fruit) {
                        System.out.println(((Fruit) product));
                    }
                    break;

                case "Meat" :
                    if (product instanceof Meat) {
                        System.out.println(((Meat) product));
                    }
                    break;
            }
        }
    }

}
