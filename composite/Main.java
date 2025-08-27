package composite;

public class Main {
    public static void main(String[] args) {
        Organization organization = new Organization();

        Department sales = new Department("Sales");
        sales.addEmployee(new Employee("Alice", 1d));
        sales.addEmployee(new Employee("Bob", 1d));

        Department engineering = new Department("Engineering");
        engineering.addEmployee(new Employee("Charlie", 1d));
        engineering.addEmployee(new Employee("David", 800d));

        Department specialEngineering = new Department("SpecialEngineering");
        specialEngineering.addEmployee(new Employee("Eve", 1d));
        specialEngineering.addEmployee(new Employee("Frank", 1d));
        engineering.addDepartment(specialEngineering);

        organization.addDepartment(sales);
        organization.addDepartment(engineering);

        System.out.println(organization.toXML());
        organization.showTotalSalary();
    }
}
