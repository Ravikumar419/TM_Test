package dataLoad;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//Author: rpendyala19@gmail.com

public class DataProcess {
    public static void main(String[] args) {
        String inputFilePath1 = "C:\\Users\\gunna\\Downloads\\CIMB-20230727T114117Z-001\\CIMB\\CIMB_WEB_AUTOMATION\\app\\in\\InstrumentDetails.csv";
        String inputFilePath2 = "C:\\Users\\gunna\\Downloads\\CIMB-20230727T114117Z-001\\CIMB\\CIMB_WEB_AUTOMATION\\app\\in\\PositionDetails.csv";
        String outputFilePath = "C:\\Users\\gunna\\Downloads\\CIMB-20230727T114117Z-001\\CIMB\\CIMB_WEB_AUTOMATION\\app\\out\\PositionReport.csv";
        // Process Input File 1 (InstrumentDetails.csv)
        try (FileReader fileReader = new FileReader(inputFilePath1);
             CSVParser csvParser = CSVFormat.DEFAULT.withHeader("ID", "Name", "ISIN", "Unit Price").parse(fileReader)) {

            for (CSVRecord record : csvParser) {
                String id = record.get("ID");
                String name = record.get("Name");
                String isin = record.get("ISIN");
                String unitPrice = (record.get("Unit Price"));

                System.out.println("ID: " + id + ", Name: " + name + ", ISIN: " + isin + ", Unit Price: " + unitPrice);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        
     // Process Input File 2 (PositionDetails.csv)
        try (FileReader fileReader = new FileReader(inputFilePath2);
             CSVParser csvParser = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(fileReader)) {

            for (CSVRecord record : csvParser) {
            	
				String id = String.valueOf(record.get("ID"));
                String instrumentId = String.valueOf(record.get("InstrumentID"));
                String quantity = String.valueOf(record.get("Quantity"));
                // Load data into the database and perform data transformation
                // Implement your database logic and data transformation here
                System.out.println("ID: " + id + ", InstrumentID: " + instrumentId + ", Quantity: " + quantity);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        
     // Generate the "PositionReport.csv" file and save it in "/app/out"
        try (FileWriter fileWriter = new FileWriter(outputFilePath)) {
            // Write the header
            fileWriter.write("ID,PositionID,ISIN,Quantity,Total Price\n");

            // Write the data (dummy data for demonstration)
            fileWriter.write("1,1001,XYZ123,50,5000\n");
            fileWriter.write("2,1002,ABC789,75,7500\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
    }

}
