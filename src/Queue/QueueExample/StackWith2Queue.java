package Queue.QueueExample;

import java.util.LinkedList;
import java.util.Queue;

public class StackWith2Queue {
    private Queue<Integer> q1 = new LinkedList<Integer>();
    private Queue<Integer> q2 = new LinkedList<Integer>();

    public void push(int data){
        if(q1.isEmpty())
            q2.offer(data);
        else
            q1.offer(data);
    }

    public int pop(){
        int i=0,size;
        if(q2.isEmpty()){
            size = q1.size();
            while(i<size-1){
                q2.offer(q1.poll());
                i++;
            }
            return q1.poll();
        }
        else {
            if(q1.isEmpty()){
                size = q2.size();
                while(i<size-1){
                    q1.offer(q2.poll());
                    i++;
                }

            }
            return q2.poll();
        }
    }
}
