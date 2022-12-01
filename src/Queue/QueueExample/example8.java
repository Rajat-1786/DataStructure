package Queue.QueueExample;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class example8 {
    public static boolean checkStackPairwiseOrder(Stack<Integer> stack){
        Queue<Integer> q = new LinkedList<Integer>();
        while(!stack.isEmpty()){
            q.offer(stack.pop());
        }
        while(!q.isEmpty()){
            stack.push(q.poll());
        }
        while(!stack.isEmpty()){
            int n = stack.pop();
            q.offer(n);
            if(!stack.isEmpty()){
                int m = stack.pop();
                q.add(m);
                if(Math.abs(n-m)!=1)
                    return false;
            }
        }
        while(!q.isEmpty()){
            stack.push(q.poll());
        }
        return true;
    }

    public static  void main(String[] args){
        Stack<Integer> stack  = new Stack<Integer>();
        stack.push(4);
        stack.push(5);
        stack.push(-2);
        stack.push(-6);
        stack.push(20);

        if(checkStackPairwiseOrder(stack)){
            System.out.println("stack element is consecutervly pairedwise");
        }
        else{
            System.out.println("not paired wise");
        }


    }
}
