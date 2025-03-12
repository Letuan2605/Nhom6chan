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
        System.out.println("BeforeClass: Chạy một lần trước tất cả các bài kiểm tra");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("AfterClass: Chạy một lần sau tất cả các bài kiểm tra");
    }

    @Before
    public void setUp() {
        product = new Product("P001", "Laptop", 1500.0);
        System.out.println("Before: Chạy trước mỗi bài kiểm tra");
    }

    @After
    public void tearDown() {
        System.out.println("After: Chạy sau mỗi bài kiểm tra");
    }

    @Test
    public void testGetProductId() {
        System.out.println("Đang chạy kiểm tra mã sản phẩm");
        assertEquals("P001", product.getProductId());
    }

    @Test
    public void testGetProductName() {
        System.out.println("Đang chạy kiểm tra tên sản phẩm");
        assertEquals("Laptop", product.getProductName());
    }

    @Test
    public void testGetPrice() {
        System.out.println("Đang chạy kiểm tra giá sản phẩm");
        assertEquals(1500.0, product.getPrice(), 0.001);
    }

    @Test
    public void testSetPrice() {
        System.out.println("Đang chạy kiểm tra cập nhật giá sản phẩm");
        product.setPrice(1600.0);
        assertEquals(1600.0, product.getPrice(), 0.001);
    }
}
