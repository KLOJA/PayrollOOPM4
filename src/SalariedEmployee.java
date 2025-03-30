// SalariedEmployee.java

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String securityNumber, double weeklySalary) {
        super(firstName, lastName, securityNumber);
        if (weeklySalary < 0) throw new IllegalArgumentException("Salary cannot be negative");
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double getPaymentAmount() {
        return weeklySalary;
    }
}
