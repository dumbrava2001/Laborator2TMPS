package composite;

import java.util.HashSet;
import java.util.Set;

public class ManagerEmployee implements Employee{

  private final String name;
  private Department department;
  private double salary;

  private final Set<Employee> managedEmployees = new HashSet<>();

  public ManagerEmployee(String name, Department department, double salary) {
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

  public Set<Employee> getManagedEmployees(){
    return managedEmployees;
  }

  public void addEmployee(Employee employee){
    managedEmployees.add(employee);
  }

  public void removeEmployee(Employee employee) {
    managedEmployees.remove(employee);
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }
}
