public class Main {
    public static void main(String[] args) {

        int[] numbers = new int[] {34, 2, 5, 0, 12, 5, 7, 13};
        System.out.println(bitsBattle(numbers));

    }

    static String bitsBattle(int[] numbers) {
        int even = 0;
        int odds = 0;
        for (int n : numbers) {
            if(n == 0) {
                continue;
            }
            if (n % 2 == 0) {
                even = even + (int) Integer.toBinaryString(n).chars().filter(c -> c == 48).count();
            } else {
                odds = odds + (int) Integer.toBinaryString(n).chars().filter(c -> c == 49).count();
            }
        }

        if (odds > even) {
            return "odds win";
        } else if (odds < even) {
            return  "evens win";
        } else {
            return  "tie";
        }
    }

}
