package Tests;

import org.junit.Test;
import sample.Product;

import java.util.ArrayList;
import java.util.Collections;

import static junit.framework.TestCase.assertEquals;

public class ProductTest {

    @org.junit.Test
    public void testToString() {
        Product product = new Product(1, "Prince Polo", 2.50);
        assertEquals("1. Prince Polo 2,50", product.toString());
    }

    @org.junit.Test
    public void testSorting() {
        ArrayList<Product> products = new ArrayList<Product>();
        products.add(new Product(5, "Prince Polo", 2.50));
        products.add(new Product(2, "Prince Polo", 2.50));
        products.add(new Product(4, "Prince Polo", 2.50));
        products.add(new Product(1, "Prince Polo", 2.50));
        Collections.sort(products);
        for(int i = 0; i < 4; i++){
            System.out.println(products.get(i).getId());
        }
    }

}