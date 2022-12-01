package Queue.QueueExample;

import Queue.QueueImpl.QueueLL;
import Queue.QueueImpl.QueueLLImpl;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class QReverse {
    public static QueueLLImpl reverseQueue(QueueLLImpl queue){
        Stack s1 = new Stack();
        while(!queue.isEmpty()){
            s1.push(queue.deQueue());
        }
        while(!s1.isEmpty()) {
            queue.enQueue((int)s1.pop());
        }

        return queue;
    }
}
