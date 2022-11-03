package stack.stackExample;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class EvaluateInfixInOnePass {

    public static void main(String[] args){
        String[] infix = {"2","+","5","*","4","/","5","-","2"};
        int result = new EvaluateInfixInOnePass().evaluateInfixInOnePass(infix);
        System.out.println(result);
    }
    public int evaluateInfixInOnePass(String[] infix){

        //create an empty stack operator
        Stack<String> operator = new Stack<String>();

        //create an empty stack operand
        Stack<Integer> operand = new Stack<Integer>();

        List oper = Arrays.asList("+","-","*","/");
        //scan  each input in infix expression
        for(String s: infix){
            //if token is operator then check it operator is not empty then check prec if found higher precedence then pop it
            // and evaluate it by popping 2 operand and push result to operand if not high prec then push operator
            if(oper.contains(s)) {
                if (!operator.isEmpty() && prec(s) <= prec(operator.peek())) {
                    int a = operand.pop();
                    int b = operand.pop();
                    if (operator.peek().equals("+")) {
                        operand.push(a + b);
                    } else if (operator.peek().equals("-")) {
                        operand.push(b - a);
                    } else if (operator.peek().equals("*")) {
                        operand.push(a * b);
                    } else if (operator.peek().equals("/")) {
                        operand.push(b / a);
                    }
                    operator.pop();
                }
                operator.push(s);
            }
            else{      // if token is operand then push it to operand stack

                operand.push(Integer.parseInt(s));
            }
        }

        //while operator stack is not empty pop operator and pop 2 operand and evaluate it and push result to operand
        while(!operator.isEmpty()){
            int a = operand.pop();
            int b = operand.pop();
            if(operator.peek().equals("+")){
                operand.push(a+b);
            }
            else if(operator.peek().equals("-")){
                operand.push(b-a);
            }
            else if(operator.peek().equals("*")){
                operand.push(a*b);
            }
            else if(operator.peek().equals("/")){
                operand.push(b/a);
            }
            operator.pop();
        }
        return operand.peek();
    }

    private int prec(String ch){
        switch(ch){
            case "+":
            case "-":
                return 1;
            case "*":
            case "/":
                return 2;
        }
        return -1;
    }
}
