package Ex2;

import java.util.Arrays;
import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Write first word");
        String word1 = input.nextLine();
        System.out.println("Write second word");
        String word2 = input.nextLine();
        input.close();

        System.out.println(isTheSame(word1,word2));
    }

//    private static void wordToLowerCase(String word1, String word2) {
//        word1 = word1.toLowerCase();
//        word2 = word2.toLowerCase();
//    }

    private static void sortArrays(char[] chars1, char[] chars2) {
        Arrays.sort(chars1);
        Arrays.sort(chars2);
    }

    private static boolean isArrayEqual(char[] chars1, char[] chars2) {
        if (Arrays.equals(chars1, chars2)) {
            return true;
        } else
            return false;
    }

    static boolean isTheSame(String word1, String word2) {
        if (word1 == null && word2 == null) {
            return true;
        } else if (word1 == null || word2 == null || (word1.length() != word2.length())) {
            return false;
        } else {
//            wordToLowerCase(word1, word2);
            word1 = word1.toLowerCase();
            word2 = word2.toLowerCase();

            char[] chars1 = word1.toCharArray();
            char[] chars2 = word2.toCharArray();

            sortArrays(chars1, chars2);

            return isArrayEqual(chars1, chars2);
        }
    }


}
