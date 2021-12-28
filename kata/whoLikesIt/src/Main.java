import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        long start, end;
        String[] names = new String[99999999];
        Arrays.fill(names, "NAME");

        start = System.nanoTime();
        whoLikesItConcat(names);
        end = System.nanoTime();
        System.out.println("Concat time: " + (end - start) + " ns");

        start = System.nanoTime();
        whoLikesItSB(names);
        end = System.nanoTime();
        System.out.println("StringBuilder time: " + (end - start) + " ns");

        start = System.nanoTime();
        whoLikesItCase(names);
        end = System.nanoTime();
        System.out.println("Case time: " + (end - start) + " ns");

        System.out.println("========");

        start = System.nanoTime();
        whoLikesItConcat(names);
        end = System.nanoTime();
        System.out.println("Concat time: " + (end - start) + " ns");

        start = System.nanoTime();
        whoLikesItSB(names);
        end = System.nanoTime();
        System.out.println("StringBuilder time: " + (end - start) + " ns");

        start = System.nanoTime();
        whoLikesItCase(names);
        end = System.nanoTime();
        System.out.println("Case time: " + (end - start) + " ns");

        System.out.println("========");

        start = System.nanoTime();
        whoLikesItSB(names);
        end = System.nanoTime();
        System.out.println("StringBuilder time: " + (end - start) + " ns");

        start = System.nanoTime();
        whoLikesItFormat(names);
        end = System.nanoTime();
        System.out.println("Format time: " + (end - start) + " ns");

        start = System.nanoTime();
        whoLikesItConcat(names);
        end = System.nanoTime();
        System.out.println("Concat time: " + (end - start) + " ns");

        System.out.println("========");

        start = System.nanoTime();
        whoLikesItConcat(names);
        end = System.nanoTime();
        System.out.println("Concat time: " + (end - start) + " ns");

        start = System.nanoTime();
        whoLikesItFormat(names);
        end = System.nanoTime();
        System.out.println("Format time: " + (end - start) + " ns");

        start = System.nanoTime();
        whoLikesItSB(names);
        end = System.nanoTime();
        System.out.println("StringBuilder time: " + (end - start) + " ns");

    }

    public static String whoLikesItSB(String... names) {
        StringBuilder str = new StringBuilder();
        if(names.length == 0) {
            return str.append("no one likes this").toString();
        }
        if(names.length == 1) {
            return str.append(names[0]).append(" likes this").toString();
        }
        if(names.length == 2) {
            return str.append(names[0]).append(" and ").append(names[1]).append(" like this").toString();
        }
        if(names.length == 3) {
            return str.append(names[0]).append(", ").append(names[1]).append(" and ").append(names[2])
                    .append(" like this").toString();
        }
        return str.append(names[0]).append(", ").append(names[1]).append(" and ")
                .append(Integer.toString(names.length - 2)).append(" others like this").toString();
    }


    public static String whoLikesItConcat(String... names) {
        if(names.length == 0) {
            return "no one likes this";
        }
        if(names.length == 1) {
            return names[0].concat(" likes this");
        }
        if(names.length == 2) {
            return names[0].concat(" and ").concat(names[1]).concat(" like this");
        }
        if(names.length == 3) {
            return names[0].concat(", ").concat(names[1]).concat(" and ").concat(names[2]).concat(" like this");
        }
        return names[0].concat(", ").concat(names[1]).concat(" and ").concat(Integer.toString(names.length - 2))
                .concat(" others like this");
    }


    public static String whoLikesItCase(String... names) {
        switch (names.length) {
            case 0: return "no one likes this";
            case 1: return String.format("%s likes this", names[0]);
            case 2: return String.format("%s and %s like this", names[0], names[1]);
            case 3: return String.format("%s, %s and %s like this", names[0], names[1], names[2]);
            default: return String.format("%s, %s and %d others like this", names[0], names[1], names.length - 2);
        }
    }

    public static String whoLikesItFormat(String... names) {
        if(names.length == 0) {
            return "no one likes this";
        }
        if(names.length == 1) {
            return String.format("%s likes this", names[0]);
        }
        if(names.length == 2) {
            return String.format("%s and %s like this", names[0], names[1]);
        }
        if(names.length == 3) {
            return String.format("%s, %s and %s like this", names[0], names[1], names[2]);
        }
        return String.format("%s, %s and %d others like this", names[0], names[1], names.length - 2);
    }


}
