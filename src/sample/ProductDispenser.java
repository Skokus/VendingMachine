package sample;

import java.util.ArrayList;

public class ProductDispenser {

    private Product product;
    private int count;
    private int limit;
    private String imageURL;
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

    public ProductDispenser(Product product, int count, int limit, String imageURL){
        this.product = product;
        this.count = count;
        this.limit = limit;
        this.imageURL = imageURL;
    }

    public ProductDispenser(Product product, int limit, String imageURL){
        this.product = product;
        this.count = limit;
        this.limit = limit;
        this.imageURL = imageURL;
    }

    public ProductDispenser(Product product, int limit){
        this.product = product;
        this.count = limit;
        this.limit = limit;
        this.imageURL = "photos/PrincePolo.png";
    }

    public Product getProduct(){
        return this.product;
    }

    public int getLimit(){
        return this.limit;
    }

    public int getCount(){
        return this.count;
    }

    public String getImageURL(){
        return this.imageURL;
    }
    public void putProduct(){
        if(count + 1 <= limit){
            count++;
        } else {
            throw new IllegalArgumentException ("Dispenser is full!");
        }
    }

    public void removeProduct(){
        if(count - 1 >= 0){
            count--;
        } else {
            throw new IllegalArgumentException ("Dispenser is empty!");
        }
    }

}
