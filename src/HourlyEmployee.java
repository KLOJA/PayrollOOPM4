// HourlyEmployee.java

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String securityNumber, double wage, double hours) {
        super(firstName, lastName, securityNumber);
        if (wage < 0 || hours < 0) throw new IllegalArgumentException("Wage and hours cannot be negative");
        this.wage = wage;
        this.hours = hours;
    }

    @Override
    public double getPaymentAmount() {
        return wage * hours;
    }
}
