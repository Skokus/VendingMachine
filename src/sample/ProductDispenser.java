package sample;

public class ProductDispenser {
    private Product product;
    private int count;
    private int limit;
    private String imageURL;

    public ProductDispenser(Product product, int count, int limit, String imageURL){
        this.product = product;
        this.count = count;
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
