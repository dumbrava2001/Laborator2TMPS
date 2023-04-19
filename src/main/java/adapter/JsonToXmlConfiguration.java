package adapter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class JsonToXmlConfiguration implements XmlConfiguration{

  private DBConfiguration dbConfiguration;

  private final XmlMapper xmlMapper;
  private final ObjectMapper jsonMapper;

  public JsonToXmlConfiguration() {
    this.xmlMapper = new XmlMapper();
    this.jsonMapper = new JsonMapper();
  }

  @Override
  public void setDbConfiguration(DBConfiguration dbConfiguration) {
    this.dbConfiguration = dbConfiguration;
  }

  @Override
  public void setDbConfiguration(String configuration) {
    try {
      this.dbConfiguration = jsonMapper.readValue(configuration, DBConfiguration.class);
    } catch (JsonProcessingException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public String getConnectionConfiguration() {
    try {
      return xmlMapper.writeValueAsString(dbConfiguration);
    } catch (JsonProcessingException e) {
      throw new RuntimeException(e);
    }
  }
}
