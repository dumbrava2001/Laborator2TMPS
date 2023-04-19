package proxy;

public class MainProxy {

  public static void main(String[] args) {
    Repository repository = new ProductRepositoryProxy();

    Product iphone14Pro = repository.getProductByName("iphone 14 Pro");
    System.out.println(iphone14Pro);

    System.out.println("Same request");
    Product iphone14ProCached = repository.getProductByName("iphone 14 Pro");
    System.out.println(iphone14ProCached);

    System.out.println("Returning cached product by id");
    Product productById = repository.getProductById(iphone14Pro.getProductId());
    System.out.println(productById);
  }

}
