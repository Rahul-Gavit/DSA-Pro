package Stack.Medium.Duplicate_Parantheses;

import java.util.Stack;

public class duplicate_parantheses {

    public static boolean duplicateParanthesis(String expr) {
        // Write your code here
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);
            // closing
            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true;
                } else {
                    s.pop();
                }
            }

            // opening
            else {
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "((a+b))";
        System.out.println(duplicateParanthesis(str));
    }
}
