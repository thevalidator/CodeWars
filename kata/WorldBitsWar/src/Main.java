public class Main {

    public static void main(String[] args) {

        int[] numbers = new int[] {2, -34, 32, 90, 3, -5, -40};
        System.out.println(bitsWar(numbers));

    }

    public static String bitsWar(int[] numbers) {
        int even = 0;
        int odds = 0;
        for (int n : numbers) {
            if(n == 0) {
                continue;
            }
            int bits = Integer.bitCount(Math.abs(n)) * n / Math.abs(n);
            if (n % 2 == 0) {
                even = even + bits;
            } else {
                odds = odds + bits;
            }
        }

        if (odds > even) {
            return "odds win";
        } else if (odds < even) {
            return "evens win";
        } else {
            return "tie";
        }
    }

}
