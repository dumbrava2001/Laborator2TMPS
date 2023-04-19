package composite;

import java.util.Set;

public class MainComposite {

  public static void main(String[] args) {
    Employee employee1 = new BaseEmployee("Employee 1", Department.IT, 2500);
    Employee employee2 = new BaseEmployee("Employee 2", Department.IT, 2600);
    Employee employee3 = new BaseEmployee("Employee 3", Department.IT, 2000);
    Employee employee4 = new BaseEmployee("Employee 4", Department.SALES, 1500);

    ManagerEmployee managerEmployeeIT = new ManagerEmployee("Manager1", Department.IT, 3500);
    managerEmployeeIT.addEmployee(employee1);
    managerEmployeeIT.addEmployee(employee2);
    managerEmployeeIT.addEmployee(employee3);

    ManagerEmployee managerEmployeeSales = new ManagerEmployee("Manager2", Department.SALES, 4000);
    managerEmployeeSales.addEmployee(employee4);

    ManagerEmployee regionalManager = new ManagerEmployee("Regional Manager", Department.ALL, 6000);

    regionalManager.addEmployee(managerEmployeeIT);
    regionalManager.addEmployee(managerEmployeeSales);

    printEmployee(regionalManager);
    printManagedEmployees(regionalManager.getManagedEmployees());
  }
  private static void printManagedEmployees(Set<Employee> employeeSet){
    for (Employee employee : employeeSet){
      printEmployee(employee);
      if (employee instanceof ManagerEmployee){
        printManagedEmployees(((ManagerEmployee) employee).getManagedEmployees());
      }
    }
  }
  private static void printEmployee(Employee employee) {
    System.out.println("Name:" + employee.getName() +
        "\n\tDepartment:" + employee.getDepartment() +
        "\n\tSalary:" + employee.getSalary());
  }
}
