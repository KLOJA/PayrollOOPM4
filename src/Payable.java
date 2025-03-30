// Payable.java

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public interface Payable {
    default double getPaymentAmount() // calculate payment amount
    {
        return 0;
    }

    default void writeToFile() {
        try (FileWriter writer = new FileWriter("paystub.txt", true)) {
            writer.write(this.toString() + " - Payment: " + getPaymentAmount() + " - Date: " + LocalDate.now() + "\n");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}



