package stack.stackExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PostfixEvaluation {
    public static void main(String[] args){
        String[] postfix = {"1","2","3","*","+","5","-"};
        int result = new PostfixEvaluation().evaluatePostfix(postfix);
        System.out.println(result);
    }

    public int evaluatePostfix(String[] exp){

        //create a empty stack
        int top = -1;
        int[] st = new int[exp.length];
        int result = 0;

        List operator = Arrays.asList("+","-","*","/");
        //scan the postfix expression
        for(String s: exp){
            //if the character is operator pop 2 element from stack perform operation and push result in to stack
            if(operator.contains(s)){
                int a = st[top--];
                int b = st[top--];
                if(s.equals("+"))
                    result =a+b;
                else if(s.equals("-"))
                    result = b-a;
                else if(s.equals("*"))
                    result = a*b;
                else if(s.equals("/"))
                    result = b/a;
                st[++top] = result;
            }
            else{
                //if character is operand push it to stack
                st[++top] = Integer.parseInt(s);
            }
        }

        //return result
        return st[top];
    }
}
