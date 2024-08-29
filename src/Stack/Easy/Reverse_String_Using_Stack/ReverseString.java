package Stack.Easy.Reverse_String_Using_Stack;

import java.util.Stack;

public class ReverseString {

    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;

        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder newString = new StringBuilder("");
        while (!s.isEmpty()) {
            char curr = s.pop();
            newString.append(curr);
        }

        return newString.toString();

    }

    public static void main(String[] args) {
        String str = "ABC";
        String result = reverseString(str);
        System.out.println(result);

    }
}
