public class Main {
    public static void main(String[] args) {

        System.out.println(getMiddle("test"));
        System.out.println(getMiddle("qwert5qwert"));
        System.out.println(getMiddle("middle"));

    }

    public static String getMiddle(String word) {
        if(word.length() % 2 == 0) {
            return word.substring(word.length() / 2 - 1, word.length() / 2 + 1);
        } else {
            return word.substring(word.length() / 2, word.length() / 2 + 1);
        }
    }
}
