package composite;

import java.util.ArrayList;
import java.util.List;

public class Department implements OrganizationComponent {
    String name;
    List<Department> departments = new ArrayList<>();
    List<Employee> employees = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    @Override
    public double getSalary() {
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        for (Department department : departments) {
            totalSalary += department.getSalary();
        }
        return totalSalary;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void removeDepartment(Department department) {
        departments.remove(department);
    }
}
