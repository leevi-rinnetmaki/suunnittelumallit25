package composite;

public class Employee implements OrganizationComponent {
    String name;
    Double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    public String toXML(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("<Employee>\n");
        sb.append(indent).append("  <Name>").append(name).append("</Name>\n");
        sb.append(indent).append("  <Salary>").append(String.format("%.2f", salary)).append("</Salary>\n");
        sb.append(indent).append("</Employee>\n");
        return sb.toString();
    }
}
