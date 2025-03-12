/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package productmanagement;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProductTest {
    private Product product;

    @BeforeClass
    public static void setUpClass() {
        System.out.println("BeforeClass: Run once before all tests");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("AfterClass: Run once after all tests");
    }

    @Before
    public void setUp() {
        product = new Product("P001", "Laptop", 1500.0);
        System.out.println("Before: Run before each test");
    }

    @After
    public void tearDown() {
        System.out.println("After: Run after each test");
    }

    @Test
    public void testGetProductId() {
        System.out.println("Running testGetProductId");
        assertEquals("P001", product.getProductId());
    }

    @Test
    public void testGetProductName() {
        System.out.println("Running testGetProductName");
        assertEquals("Laptop", product.getProductName());
    }

    @Test
    public void testGetPrice() {
        System.out.println("Running testGetPrice");
        assertEquals(1500.0, product.getPrice(), 0.001);
    }

    @Test
    public void testSetPrice() {
        System.out.println("Running testSetPrice");
        product.setPrice(1600.0);
        assertEquals(1600.0, product.getPrice(), 0.001);
    }
}
