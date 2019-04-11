package homework4;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class IP2Country {
	
    int binarySearch(Object arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the
            // middle itself
            if (Integer.parseInt(((String[]) arr[mid])[0]) == x) {
                return mid;
            }

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (Integer.parseInt(((String[]) arr[mid])[0]) > x) {
                return binarySearch(arr, l, mid - 1, x);
            }

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }

    public static void main(String args[]) {

        String csvFile = "C:\\Users\\Dario Susic\\eclipse-workspace\\Homeworks\\src\\csv\\IP2Country.csv";
        String line = "";
        String cvsSplitBy = ",";
        ArrayList<String[]> a = new ArrayList<>();
        Object[] objArray = null;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String header = br.readLine();
            while ((line = br.readLine()) != null) {
                String[] country = line.split(cvsSplitBy);
                a.add(country);
            }
            objArray = a.toArray();
        } catch (IOException e) {
            System.out.println("Exception occured: " + e);
        }

        IP2Country ip = new IP2Country();
        int n = objArray.length;
        int x = IP2Country.Ip2IpNumber("1.0.178.0");
        int result = ip.binarySearch(objArray, 0, n - 1, x);
        if (result == -1) {
            System.out.println("IP not present");
        } else {
            System.out.println("Country: " + ((String[]) objArray[result])[3] + " City: " + ((String[]) objArray[result])[5]);
        }

    }
    
    /*public int Number2IP(int ipnum) {
		return ipnum;
    	
    }*/

    public static int Ip2IpNumber(String ip) {

        //So, w = 202, x = 186, y = 13 and z = 4
        //IP Number = 16777216*202 + 65536*186 + 256*13 + 4
        final int w = 16777216;
        final int x = 65536;
        final int y = 256;

        String[] nums = ip.split("\\.");
        return (16777216 * Integer.parseInt(nums[0]))
                + (65536 * Integer.parseInt(nums[1]))
                + (256 * Integer.parseInt(nums[2]))
                + Integer.parseInt(nums[3]);
    }
}
