package Stack.Easy.Valid_Parantheses;

import java.util.Stack;

public class ValidParantheses {

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // step 1: opening bracket case
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }
            // step 2: closing bracket case
            else {

                // stack empty means ')' closing come first invalid
                if (st.isEmpty()) {
                    return false;
                }

                // check corresponding opening with closing
                if ((st.peek() == '(' && ch == ')')
                        || (st.peek() == '{' && ch == '}')
                        || (st.peek() == '[' && ch == ']')) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }

        // check no char remaining in stack
        if (st.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String str = "(([{}]))";

        System.out.println(isValid(str));
    }
}
