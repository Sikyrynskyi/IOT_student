package ua.lviv.iot.Manager;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class WriteParts {
    public final void writeToFile(final List<Part> parts){
        try (PrintWriter writer = new PrintWriter("ComputerCompany.csv")) {
            for (Part part : parts) {
                writer.println(part.getHeaders());
                writer.println(part.toCSV());
            }
        }

        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
