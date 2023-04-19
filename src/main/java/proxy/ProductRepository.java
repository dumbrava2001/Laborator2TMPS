package proxy;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ProductRepository implements Repository {

  public ProductRepository() {
    System.out.println("Setting up the connection");
  }

  private final List<Product> productList = new ArrayList<>(List.of(
      new Product(UUID.randomUUID(), "Iphone 14", 25000),
      new Product(UUID.randomUUID(), "Iphone 14 pro", 30000),
      new Product(UUID.randomUUID(), "Iphone 14 pro Max", 37000),
      new Product(UUID.randomUUID(), "Iphone 11", 11000),
      new Product(UUID.randomUUID(), "Iphone 12", 15000)
  ));

  @Override
  public Product getProductByName(String name) {
    System.out.println("Sql query to database!");
    System.out.println("Mapping entity to objects!");

    return productList.stream()
        .filter(
            product -> product.getName().toLowerCase().trim().equals(name.toLowerCase().trim()))
        .findFirst()
        .orElseThrow();
  }

  @Override
  public Product getProductById(UUID uuid) {
    System.out.println("Sql query to database!");
    System.out.println("Mapping entity to objects!");

    return productList.stream()
        .filter(product -> product.getProductId().equals(uuid))
        .findFirst()
        .orElseThrow();
  }
}
