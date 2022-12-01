package Queue.QueueExample;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Example5 {
    public static Stack example5(LinkedList queue){
        Stack stack = new Stack();
        System.out.println(queue);
        while(!queue.isEmpty()) {
            stack.push(queue.poll());
        }
        System.out.println(stack);
        while(!stack.isEmpty()){
            queue.offer(stack.pop());
        }
        System.out.println(queue);
        while(!queue.isEmpty()){
            stack.push(queue.poll());
        }
        System.out.println(stack);
        return stack;
    }

    public static void main(String[] args){
        LinkedList queue = new LinkedList();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);

        Stack stack = example5(queue);
    }
}
