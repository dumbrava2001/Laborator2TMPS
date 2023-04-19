package adapter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MainConvertor {

  public static void main(String[] args) {
    ObjectMapper objectMapper = new ObjectMapper();
    DBConfiguration configuration = new DBConfiguration("jdbs:PostreSQL", "admin", "postgres");
    XmlConfiguration xmlConfiguration = new JsonToXmlConfiguration();
    xmlConfiguration.setDbConfiguration(configuration);
    System.out.println(xmlConfiguration.getConnectionConfiguration());

    try {
      System.out.println(objectMapper.writeValueAsString(configuration));
      xmlConfiguration.setDbConfiguration(objectMapper.writeValueAsString(configuration));

      System.out.println(xmlConfiguration.getConnectionConfiguration());
    } catch (JsonProcessingException e) {
      throw new RuntimeException(e);
    }
  }
}
