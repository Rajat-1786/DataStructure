package Queue.QueueImpl;

import Queue.QueueExample.QReverse;
import Queue.QueueExample.StackWith2Queue;

public class TestQueue {
    public static void main(String[] args) throws IllegalAccessException {
//        QueueLLImpl queue = new QueueLLImpl();
//        queue.enQueue(1);
//        queue.enQueue(2);
//        System.out.println(queue);
//        QueueLLImpl revQ = QReverse.reverseQueue(queue);
//        System.out.println(revQ);

//        QueueWith2Stack q2s  = new QueueWith2Stack();
//        q2s.enqueue(1);
//        q2s.enqueue(2);
//        q2s.enqueue(3);
//        System.out.println(q2s.dequeue());
//        System.out.println(q2s.dequeue());
//        System.out.println(q2s.dequeue());

        StackWith2Queue stack = new StackWith2Queue();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.pop());
        System.out.println(stack.pop());




//        System.out.println(4<<2);
    }
}
