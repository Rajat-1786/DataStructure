package Queue.QueueImpl;

import javax.print.CancelablePrintJob;
import java.util.Arrays;

public class QueueSC {
    int[] arr;
    int size,front, rear;
    public static int CAPACITY = 16;

    public QueueSC(){
        arr = new int[CAPACITY];
        size = 0;
        front = 0;
        rear = 0;
    }

    public QueueSC(int cap){
        CAPACITY = cap;
        arr = new int[cap];
        size = 0;
        front = 0;
        rear = 0;
    }

    public void enQueue(int data) throws IllegalAccessException {
        if(isFull()){
            throw new IllegalAccessException("Queue is Full");
        }
        else
        {
            size++;
            arr[rear] = data;
            rear = (rear+1)%CAPACITY;
        }
    }

    public int deQueue() throws IllegalAccessException{
        int data=0;
        if(isEmpty()){
            throw new IllegalAccessException("Queue is Empty");
        }
        else
        {
            size--;
            data = arr[front%CAPACITY];
            front = (front+1)%CAPACITY;
        }
        return data;
    }

    public boolean isEmpty(){
        if(size==0)
            return true;
        return false;
    }

    public boolean isFull(){
        if(size==CAPACITY)
            return true;
        return false;
    }

    public int size(){
        return size;
    }

    @Override
    public String toString() {
        String QueueStr = "{";
        for(int i=0;i<size;i++){
            QueueStr += Integer.toString(arr[(front+i)%CAPACITY]);
            if(i<size-1) {
                QueueStr += ", ";
            }
        }
        QueueStr += "}";
        return QueueStr;
    }
}
