package zadatak3;

import java.util.Random;
import java.util.Set;

public class AUXCLS {

    public static void addFiveRandomElements(Set<String> set) {

        for (int i = 0; i < 5; i++) {
            String str = stringBuilder();
            set.add(str);
        }
    }

    private static String stringBuilder() {
        String alph = "ABCDEFGHIJKLMNOabcdefghijklmno";
        StringBuilder sb = new StringBuilder(6);

        for (int i = 0; i < sb.capacity(); i++) {
            Random random = new Random();
            char randChar = alph.charAt(random.nextInt(alph.length()));

            sb.append(randChar);
        }

        return sb.toString();
    }

    public static void searchSet(Set<String> set) {

        boolean isPresent = false;

        for (String element : set) {
            if (element.equalsIgnoreCase("Nema ga")){
                System.out.println("'Nema ga' is part of the given set");
                isPresent = true;
                break;
            }
        }
        if (!isPresent) {
            System.out.println("'Nema ga' is NOT part of the given set");
        }
    }

    public static void printSet(Set<String> set) {
        System.out.println("----------" + set.getClass().getSimpleName() + "----------");
        for (String str : set) {
            System.out.println(str);
        }
    }

    public static void removeFromSet(Set<String> set, String str) {
        set.remove(str);
        System.out.println("Removed '" + str + "' from " + set.getClass().getSimpleName());
    }
}
