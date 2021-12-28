import java.net.Inet4Address;

public class Main {
    public static void main(String[] args) {

        System.out.println(persistence(39));
        System.out.println(persistence(999));
        System.out.println(persistence(4));

    }

    public static int persistence(long n) {
        int times = 0, multiply;
        String nToString = String.valueOf(n);
        while(nToString.length() > 1) {
            times++;
            multiply = 1;
            for (int i = 0; i < nToString.length(); i++) {
                multiply *= Character.getNumericValue(nToString.charAt(i));
            }
            nToString = String.valueOf(multiply);
        }
        return times;
    }
}
