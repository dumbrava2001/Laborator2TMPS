package composite;

public class BaseEmployee implements Employee {

  private final String name;

  private Department department;

  private double salary;

  public BaseEmployee(String name, Department department, double salary) {
    this.name = name;
    this.department = department;
    this.salary = salary;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public Department getDepartment() {
    return department;
  }

  @Override
  public double getSalary() {
    return salary;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }
}
