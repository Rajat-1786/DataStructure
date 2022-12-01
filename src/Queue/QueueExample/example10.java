package Queue.QueueExample;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class example10 {
    public static void reverseQueueFirstKElement(int k, Queue<Integer> q){
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = 0;i<k;i++){
            stack.push(q.poll());
        }
        while(!stack.isEmpty()){
            q.offer(stack.pop());
        }
        for(int i=0;i<q.size()-k;i++){
            q.offer(q.poll());
        }
        System.out.println(q);
    }

    public static void main(String[] args){
        int k = 4;
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);
        q.offer(60);
        q.offer(70);
        q.offer(80);

        reverseQueueFirstKElement(k,q);
    }
}
