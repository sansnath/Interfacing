package interfacing;

public class Employee implements Pembayaran {
    private String registrationNumber;
    private String name;
    private double salaryPerMonth;
    private Invoice[] invoices;

    public Employee(String registrationNumber, String name, double salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    public double getPayableAmount() {
        double totalInvoiceAmount = 0;
        for (Invoice invoice : invoices) {
            totalInvoiceAmount += invoice.getPayableAmount();
        }
        return salaryPerMonth - totalInvoiceAmount;
    }

    public String toString() {
        String productInvoice = "";
        double totalInvoice = 0.0;
        for (Invoice invoice : invoices) {
            productInvoice += invoice.toString();
        }
        for (Invoice invoice : invoices) {
            totalInvoice += invoice.getPayableAmount();
            productInvoice += invoice.toString();
        }
        return "Employee Name: " + name + "\n" +
                "Registration Number: " + registrationNumber + "\n" +
                "Salary Per Month: $" + salaryPerMonth + "\n" +
                "\nInvoices:" + productInvoice + "\n\nTotal Invoice Price: " + totalInvoice +
                "\nTotal Salary After Deduction: $" + getPayableAmount() + "\n";
    }
}
