//. Check for Balanced Parentheses (()[]{} etc.)
/*real world use=>
 * 1)Compiler checks if your code has matching {}, (), []

   2)HTML/XML tag matching

   3)Expression validation in calculators
 */
/*
 * 🔍 Logic (Using Stack)
Use a stack to store opening brackets.

For each character in the string:

If it’s an opening bracket ( { [, push it onto the stack.

If it’s a closing bracket ) } ], check:

If stack is empty → ❌ Not balanced

If top of stack is matching open bracket → pop it

Else → ❌ Not balanced

In the end, if the stack is empty → ✅ Balanced.
 */

import java.util.Stack;
public class _11CheckforBalanceParenthesis {

    public static boolean isbalanced(String str){
          Stack<Character> stack = new Stack<>();

          for(char ch: str.toCharArray()){
            //push opening brackets
            if(ch =='(' || ch =='{' || ch =='['){
                stack.push(ch);
            }

            //handle closing brackeets
            else if(ch==')' || ch==']' || ch=='}') {
                if(stack.isEmpty()) return false;

                char top = stack.pop();

                if((ch == ')' && top != '(') ||
                (ch== '}' && top  != '{') || 
                (ch == ']' &&  top != '[')) {
                    return false;
                }   
            }
          }

          //if stack is empty in the end => its balanced
          return stack.isEmpty();
    }

    public static void main(String[] args){
        String input1 = "([{}])";
        String input2 = "{(}";
        String input3 = "{[[]}";

       
        System.out.println(input1 + " → " + isbalanced(input1)); 
        System.out.println(input2 + " → " + isbalanced(input2)); 
        System.out.println(input3 + " → " + isbalanced(input3));
    }
    
}
