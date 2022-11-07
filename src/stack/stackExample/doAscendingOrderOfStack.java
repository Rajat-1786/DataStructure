package stack.stackExample;

import java.util.Stack;

public class doAscendingOrderOfStack {
    public static void main(String[] args){
        Stack<Integer> input = new Stack<Integer>();
        input.push(6);
        input.push(3);
        input.push(5);input.push(4);input.push(2);
        input.push(1);
        Stack<Integer>  output = getAscendingOrder(input);
        System.out.println(output);
        for(Integer i: output){
            System.out.println(i);
        }


    }

    public static Stack<Integer> getAscendingOrder(Stack<Integer> input){
        Stack<Integer> aStack  = new Stack<Integer>();
        while(!input.isEmpty()){
            int temp = input.pop();
            while(!aStack.isEmpty() && aStack.peek()>temp){
                input.push(aStack.pop());
            }
            aStack.push(temp);
        }
        return aStack;
    }
}
