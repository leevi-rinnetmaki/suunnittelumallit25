package composite;

import java.util.ArrayList;
import java.util.List;

public class Organization {
    List<Department> departments = new ArrayList<>();

    public Organization() {
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void removeDepartment(Department department) {
        departments.remove(department);
    }

    public void showTotalSalary(){
        double totalSalary = 0;
        for (Department department: departments){
            for (Employee employee: department.employees){
                totalSalary += employee.getSalary();
            }
            for (Department subDepartment: department.departments){
                totalSalary += subDepartment.getSalary();
            }
        }
        System.out.println("Total Salary: " + totalSalary);
    }

    public String toXML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<Organization>\n");
        for (Department department : departments) {
            sb.append(department.toXML("  "));
        }
        sb.append("</Organization>\n");
        return sb.toString();
    }
}
