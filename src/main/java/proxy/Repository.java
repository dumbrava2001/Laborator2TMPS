package proxy;

import java.util.UUID;

public interface Repository {
  Product getProductByName(String name);

  Product getProductById(UUID uuid);
}
