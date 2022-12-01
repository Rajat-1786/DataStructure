package Queue.QueueExample;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class example9 {
    public static void interLeavingQueue(Queue<Integer> q){
        Stack<Integer> s = new Stack<Integer>();
        Stack<Integer> s1 = new Stack<Integer>();
        int half = q.size()/2;
        for(int i =0 ;i<half;i++){
            s.push(q.poll());
        }
        while(!q.isEmpty()){
            s1.push(q.poll());
        }
        while(!s.isEmpty() || !s1.isEmpty()){
            q.offer(s.pop());
            q.offer(s1.pop());
        }
        System.out.println(q);
    }
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);
        q.offer(60);
        q.offer(70);
        q.offer(80);

        interLeavingQueue(q);
    }

}
