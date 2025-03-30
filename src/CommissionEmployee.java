// CommissionEmployee.java

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String securityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, securityNumber);
        if (grossSales < 0 || commissionRate < 0) throw new IllegalArgumentException("Sales and commission rate cannot be negative");
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    @Override
    public double getPaymentAmount() {
        return grossSales * commissionRate;
    }
}
