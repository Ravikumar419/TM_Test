package dataLoad;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class DataLoadTransform {
    public static void main(String[] args) {
        String csvFilePath = "C:\\Users\\gunna\\Downloads\\CIMB-20230727T114117Z-001\\CIMB\\CIMB_WEB_AUTOMATION\\app\\in\\InstrumentDetails.csv"; // Replace with the actual file path

        try (Reader reader = new FileReader(csvFilePath);
                CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT)) {

               for (CSVRecord csvRecord : csvParser) {
                   // Assuming "ID" is in the first column (index 0) and "Name" is in the second column (index 1)
                   String id = csvRecord.get(0);
                   String name = csvRecord.get(1);

                   // Print the values to the console
                   System.out.println("ID: " + id);
                   System.out.println("Name: " + name);

                   // You can perform any other operations with the values here
               }
           } catch (IOException e) {
               e.printStackTrace();
           }

    }
}

