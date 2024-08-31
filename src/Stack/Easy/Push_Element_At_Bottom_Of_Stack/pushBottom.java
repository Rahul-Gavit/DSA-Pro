package Stack.Easy.Push_Element_At_Bottom_Of_Stack;

import java.util.Stack;

public class pushBottom {

    public static void pushElBottom(Stack<Integer> s, int data) {

        // Base Case: if stack is empty then push the data
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        // step 1: remove element
        int top = s.pop();

        // step 2: call pushElBottom
        pushElBottom(s, data);

        // step 3: push top
        s.push(top);
    }

    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }

        int top = s.pop();
        reverseStack(s);
        pushElBottom(s, top);

    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushElBottom(s, 4);

        while (!s.isEmpty()) {
            System.out.print(s.peek() + " ");
            s.pop();
        }
    }
}
