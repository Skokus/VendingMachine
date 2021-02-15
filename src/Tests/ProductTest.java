package Tests;

import org.junit.Test;
import sample.Product;

import static junit.framework.TestCase.assertEquals;

public class ProductTest {

    @org.junit.Test
    public void testToString() {
        Product product = new Product(1, "Prince Polo", 2.50);
        assertEquals("1. Prince Polo 2,50", product.toString());
    }

}