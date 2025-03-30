// Employee.java

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public abstract class Employee implements Payable {
    private String firstName;
    private String lastName;
    private String securityNumber;

    public Employee(String firstName, String lastName, String securityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.securityNumber = securityNumber;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getSecurityNumber() { return securityNumber; }

    @Override
    public abstract double getPaymentAmount(); // must be implemented by subclasses

    @Override
    public void writeToFile() {
        Payable.super.writeToFile();
    }
}
