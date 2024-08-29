# Duplicate Parenthesis Detection Algorithm

## Overview

The `duplicateParanthesis` function checks whether a given expression contains duplicate parentheses. Duplicate parentheses are those that do not affect the structure or evaluation of the expression. For example, in the expression `"(a + (b))"`, the inner parentheses around `b` are redundant.

## Approach

The function uses a stack data structure to detect redundant parentheses. The approach can be broken down into the following steps:

1. **Initialize a Stack**:

   - Use a stack to keep track of characters in the expression.

2. **Iterate Through the Expression**:

   - For each character in the expression:
     - **Closing Parenthesis `)`**:
       - When a closing parenthesis is encountered:
         - Initialize a counter to count the number of characters between the corresponding opening parenthesis and the closing parenthesis.
         - Pop characters from the stack until the opening parenthesis `(` is encountered.
         - If the counter is less than 1, it means there are no characters between the parentheses, indicating duplicate parentheses. In this case, return `true`.
         - Otherwise, pop the opening parenthesis from the stack.
     - **Opening Parenthesis `(` or Other Characters**:
       - Push all characters (including opening parentheses) onto the stack.

3. **Return Result**:
   - If no duplicate parentheses are detected throughout the expression, return `false`.
