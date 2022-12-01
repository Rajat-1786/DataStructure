package Queue.QueueImpl;

import java.util.Stack;

public class QueueWith2Stack {
    private Stack s1 = new Stack();
    private Stack s2 = new Stack();

    public void enqueue(Integer data){
        s1.push(data);
    }

    public int dequeue(){
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return (int) s2.pop();
    }


}
