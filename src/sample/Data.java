package sample;

import sample.ProductDispenser;

import java.util.ArrayList;

public class Data {
    public static ArrayList<ProductDispenser> productDispensers = new ArrayList<ProductDispenser>(){
        {
            add(new ProductDispenser(new Product(1, "PrincePolo", 1.00), 10, "photos/PrincePolo.png"));
            add(new ProductDispenser(new Product(2, "CocaCola", 2.00), 10, "photos/CocacolaCan.png"));
            add(new ProductDispenser(new Product(3, "Twix", 2.50), 10,  "photos/Twix.png"));
            add(new ProductDispenser(new Product(4, "Haribo", 5.00), 10, "photos/HariboSmakRadości.png"));
            add(new ProductDispenser(new Product(5, "KitKat", 2.00), 10, "photos/Kitkat.png"));
            add(new ProductDispenser(new Product(6, "Mars", 2.50), 10, "photos/Mars.png"));
            add(new ProductDispenser(new Product(7, "MilkyWay", 2.50), 10, "photos/Milkyway.png"));
        }
    };
}