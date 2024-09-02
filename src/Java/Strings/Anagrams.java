package Java.Strings;

import java.util.Arrays;

public class Anagrams {

    public static boolean checkAnagrams(String str1, String str2) {
        if (str1.length() == str2.length()) {
            char string1[] = str1.toCharArray();
            char string2[] = str2.toCharArray();

            Arrays.sort(string1);
            Arrays.sort(string2);

            for (int i = 0; i < string1.length; i++) {

                if (string1[i] != string2[i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str1 = "earth";
        String str2 = "heart";
        System.out.println(checkAnagrams(str1, str2));

    }
}
