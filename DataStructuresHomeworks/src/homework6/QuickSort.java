package homework6;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class QuickSort {

    public static void main(String[] args) {

        String csvFile = "C:\\Users\\Dario Susic\\eclipse-workspace\\DataStructuresHomeworks\\src\\csv\\IP2Country.csv";;
        String line = "";
        String cvsSplitBy = ",";
        ArrayList<String[]> a = new ArrayList<>();

        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] country = line.split(cvsSplitBy);
                a.add(country);

                count++;

            }
            Object[] objArray = a.toArray();

            //MergeSort mms = new MergeSort();
            //mms.sort(objArray);
            QuickSort qs = new QuickSort();
            qs.sort(objArray);

            writeCsvFile(qs.getArray());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void writeCsvFile(Object[] arr) {
        //CSV file header
        final String FILE_HEADER = "Start Ip,End Ip,Country Code,Country,Region,City";
        final String NEW_LINE_SEPARATOR = "\n";
        final String COMMA_DELIMITER = ",";
        FileWriter fileWriter = null;
        String fileName = "src\\csv\\IPSorted.csv";
        try {
            fileWriter = new FileWriter(fileName);

            //Write the CSV file header
            fileWriter.append(FILE_HEADER);

            //Add a new line separator after the header
            fileWriter.append(NEW_LINE_SEPARATOR);

            for (Object arr1 : arr) {
                fileWriter.append(((String[]) arr1)[0]);
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(((String[]) arr1)[1]);
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(((String[]) arr1)[2]);
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(((String[]) arr1)[3]);
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(((String[]) arr1)[4]);
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(((String[]) arr1)[5]);
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(NEW_LINE_SEPARATOR);
            }

            System.out.println("CSV file was created successfully !!!");

        } catch (IOException e) {
            System.out.println("Error in CsvFileWriter !!!");
        } finally {

            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
            }

        }
    }

    public static void bubbleSort(Object[] args) {
        int count = 0;
        for (Object arg : args) {
            for (String item : ((String[]) arg)) {
                System.out.print(item + " ");
            }
            System.out.println("");
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < args.length - 1; i++) {
            for (int j = 0; j < args.length - i - 1; j++) {
                String a = (((String[]) args[j])[5]);
                String b = (((String[]) args[j + 1])[5]);
                if (a.compareTo(b) > 0) {
                    count++;
                    System.out.println(count);
                    String[] temp = (String[]) args[j];
                    args[j] = args[j + 1];
                    args[j + 1] = temp;
                }
            }
        }
        long end = System.currentTimeMillis();
        long finsih = (end - start) / 1000;
        System.out.println(finsih);
        System.out.println("********************\n******************\n*****************\n*************");
        for (Object arg : args) {
            for (String item : ((String[]) arg)) {
                System.out.print(item + " ");
            }
            System.out.println("");
        }

    }

}
