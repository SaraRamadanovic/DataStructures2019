package homework4;

public class Main {

	public static void main(String[] args) {
        /*
        w = int ( IP Number / 16777216) % 256
        x = int ( IP Number / 65536 ) % 256
        y = int ( IP Number / 256 ) % 256
        z = int ( IP Number ) % 256
         */
        int ipnumber = 16822784;
        int a = ipnumber / 16777216 % 256;
        int b = ipnumber / 65536 % 256;
        int c = ipnumber / 256 % 256;
        int d = ipnumber % 256;

        System.out.print(a + "." + b + "." + c + "." + d + "\n");
    }

}
