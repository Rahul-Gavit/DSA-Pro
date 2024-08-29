# Bracket Validation Algorithm

## Overview

The `isValid` function checks whether a given string of brackets is valid. A string of brackets is considered valid if:

1. Every opening bracket has a corresponding closing bracket.
2. The brackets are properly nested.

For example:

- `"()"` is valid.
- `"()[]{}"` is valid.
- `"(]"` is invalid.
- `"([)]"` is invalid.
- `"{[]"}` is valid.

## Approach

The function uses a stack data structure to validate the brackets. The approach can be broken down into the following steps:

1. **Initialize a Stack**:

   - Use a stack to keep track of opening brackets.

2. **Iterate Through the String**:

   - For each character in the string:
     - **Opening Bracket**:
       - If the character is an opening bracket (`'('`, `'{'`, `'['`), push it onto the stack.
     - **Closing Bracket**:
       - If the character is a closing bracket (`')'`, `'}'`, `']'`):
         - Check if the stack is empty. If it is, this means there's no matching opening bracket for the current closing bracket, so return `false`.
         - Otherwise, check the top of the stack for the corresponding opening bracket:
           - If the top of the stack matches the expected opening bracket for the current closing bracket, pop the stack.
           - If it doesn't match, return `false`.

3. **Final Check**:
   - After processing all characters, if the stack is empty, it means all opening brackets had corresponding closing brackets in the correct order, so return `true`.
   - If the stack is not empty, return `false`, indicating that there are unmatched opening brackets.
