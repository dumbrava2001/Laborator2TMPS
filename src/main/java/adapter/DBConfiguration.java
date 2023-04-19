package adapter;

public class DBConfiguration {

  private String jdbcDriver;

  private String username;

  private String password;

  public DBConfiguration(String jdbcDriver, String username, String password) {
    this.jdbcDriver = jdbcDriver;
    this.username = username;
    this.password = password;
  }

  public DBConfiguration() {
  }

  public String getJdbcDriver() {
    return jdbcDriver;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }
}
