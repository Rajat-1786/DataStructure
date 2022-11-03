package stack.stackExample;

import java.util.Stack;

public class StackReversalUsingPushAndPop {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("Before reversal: "+ stack);
        reverseStack(stack);
        System.out.println("After reversal: "+stack);
    }
    public static void reverseStack(Stack<Integer> stack){
        if(stack.isEmpty())return;
        int temp =  stack.pop();
        reverseStack(stack);
        insertAtBottom(stack, temp);
    }
    public static void insertAtBottom(Stack<Integer> stack,int data){
        if(stack.isEmpty()){
            stack.push(data);
            return;
        }
        int temp = stack.pop();
        insertAtBottom(stack,data);
        stack.push(temp);
    }
}
