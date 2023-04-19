package adapter;

public interface XmlConfiguration {

  void setDbConfiguration(DBConfiguration dbConfiguration);

  void setDbConfiguration(String configuration);

  String getConnectionConfiguration();
}
