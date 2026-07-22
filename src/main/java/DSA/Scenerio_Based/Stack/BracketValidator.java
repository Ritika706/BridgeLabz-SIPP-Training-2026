package main.java.DSA.Scenerio_Based.Stack;


import java.util.Stack;

public class BracketValidator {

    public static boolean isBalanced(String str) {

        Stack<Character> stack = new Stack<>();

        for(char ch : str.toCharArray()) {

            if(ch=='(' || ch=='{' || ch=='[') {
                stack.push(ch);
            }

            else {

                if(stack.isEmpty())
                    return false;

                char top = stack.pop();

                if(ch==')' && top!='(')
                    return false;

                if(ch=='}' && top!='{')
                    return false;

                if(ch==']' && top!='[')
                    return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        String s1="{[()]}";
        String s2="{[(])}";

        System.out.println(isBalanced(s1));
        System.out.println(isBalanced(s2));

    }
}