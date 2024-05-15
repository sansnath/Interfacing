package interfacing;

public class MainInterface {
    public static void main(String[] args) {
        Invoice[] employeeInvoice = {
                new Invoice("Laptop", 2, 500000),
                new Invoice("Pulpen", 5, 2000),
                new Invoice("Pisang", 10, 3000),
                new Invoice("Aqua", 10, 3500)
        };
        Employee employee = new Employee("2351513", "Antonius", 5000000, employeeInvoice);
        System.out.println(employee.toString());
    }
}
