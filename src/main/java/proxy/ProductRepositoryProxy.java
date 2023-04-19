package proxy;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ProductRepositoryProxy implements  Repository{
  private final ProductRepository productRepository;
  private List<Product> cachedProducts;

  public ProductRepositoryProxy() {
    this.productRepository = new ProductRepository();
    this.cachedProducts = new ArrayList<>();
  }


  @Override
  public Product getProductByName(String name) {
    if (cachedProducts.isEmpty()) {
      var product = productRepository.getProductByName(name);
      cachedProducts.add(product);
      System.out.println("Returned from repo!");
      return product;
    }
    System.out.println("Returned from cache!");
    return cachedProducts.stream()
        .filter(product -> product.getName().toLowerCase().trim().equals(name.toLowerCase().trim()))
        .findFirst()
        .orElseThrow();
  }

  @Override
  public Product getProductById(UUID uuid) {
    if (cachedProducts.isEmpty()) {
      var product = productRepository.getProductById(uuid);
      cachedProducts.add(product);
      System.out.println("Returned from repo!");
      return product;
    }
    System.out.println("Returned from cache!");
    return cachedProducts.stream()
        .filter(product -> product.getProductId().equals(uuid))
        .findFirst()
        .orElseThrow();
  }

  public void clearCache(){
    cachedProducts.clear();
  }
}
