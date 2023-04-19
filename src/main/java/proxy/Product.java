package proxy;

import java.util.UUID;

public class Product {

  private final UUID productId;

  private String name;

  private double price;

  public Product(UUID productId, String name, double price) {
    this.productId = productId;
    this.name = name;
    this.price = price;
  }

  public UUID getProductId() {
    return productId;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "Product{" +
        "productId=" + productId +
        ", name='" + name + '\'' +
        ", price=" + price +
        '}';
  }
}
