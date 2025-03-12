/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productmanagement;

/**
 *
 * @author ADMIN
 */
// Class Product đại diện cho một sản phẩm trong hệ thống
// Định nghĩa lớp Product để biểu diễn thông tin về một sản phẩm

public class Product {
    private String productId;
    private String productName;
    private double price;

    // Constructor
    public Product(String productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    // Getter và Setter
    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}



