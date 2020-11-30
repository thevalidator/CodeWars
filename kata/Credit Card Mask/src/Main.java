public class Main {

    public static void main(String[] args) {

        System.out.println(maskify("4556364607935616"));

    }

    public static String maskify(String str) {
        if(str.length() < 5) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder(str);
        String mask = "";
        for(int i = 0; i < str.length() - 4; i++) {
            mask = mask.concat("#");
        }
        stringBuilder.replace(0, str.length() - 4, mask);
        return stringBuilder.toString();
    }

/*    public static String maskify(String str) {
        return str.replaceAll(".(?=.{4})", "#");
    }*/

}
