// BasePlusCommissionEmployee.java

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String securityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, securityNumber, grossSales, commissionRate);
        if (baseSalary < 0) throw new IllegalArgumentException("Base salary cannot be negative");
        this.baseSalary = baseSalary;
    }

    @Override
    public double getPaymentAmount() {
        return baseSalary + super.getPaymentAmount();
    }
}
