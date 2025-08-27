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

    public String toXML(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append(String.format("<Department name=\"%s\">\n", name));
        for (Employee employee : employees) {
            sb.append(employee.toXML(indent + "  "));
        }
        for (Department department : departments) {
            sb.append(department.toXML(indent + "  "));
        }
        sb.append(indent).append("</Department>\n");
        return sb.toString();
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
