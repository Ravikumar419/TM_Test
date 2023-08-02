package dataLoad;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

import java.util.ArrayList;
import java.util.List;

public class DataLoadTransform {
    public static String InstrumentDetails = "./app\\in\\InstrumentDetails.csv";
    public static String PositionDetails = "./app\\in\\PositionDetails.csv";
    public static String PositionReport = "./app\\out\\PositionReport.csv";
    static String id1;
    static String name;
    static String isin;
    static String unitPrice;
    static String id2;
    static String instrumentID;
    static String Quantity;

    public static void main(String[] args) {
        try (Reader reader = new FileReader(InstrumentDetails);
             CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT)) {

            for (CSVRecord csvRecord : csvParser) {
                id1 = csvRecord.get(0);
                name = csvRecord.get(1);
                isin = csvRecord.get(2);
                unitPrice = csvRecord.get(3);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<String> positionReportData = new ArrayList<>();

        try (Reader reader = new FileReader(PositionDetails);
             CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT)) {
        	// Skip the header row
            csvParser.iterator().next();
            for (CSVRecord csvRecord : csvParser) {
                id2 = csvRecord.get(0);
                instrumentID = id1;
                Quantity = csvRecord.get(2);

            int ID = Integer.parseInt(id1);
            int PositionID = Integer.parseInt(id2);
            int ISIN = Integer.parseInt(isin);
            int QUANTITY = Integer.parseInt(Quantity);
            int UNITPRICE = Integer.parseInt(unitPrice);
            int TotPrice = QUANTITY * UNITPRICE;

                // string representing the row data and add it to the list
                String rowData = ID + "," + PositionID + "," + ISIN + "," + QUANTITY + "," + TotPrice;
                positionReportData.add(rowData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Generate the "PositionReport.csv" file and save it in "/app/out"
        try (FileWriter fileWriter = new FileWriter(PositionReport)) {
            // Write the header
            fileWriter.write("ID,PositionID,ISIN,Quantity,Total Price\n");

            // Write the data from the list
            for (String rowData : positionReportData) {
                fileWriter.write(rowData + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
