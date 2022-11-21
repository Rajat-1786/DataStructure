package Queue.QueueImpl;

import javax.print.CancelablePrintJob;
import java.util.Arrays;

public class QueueDC {
    int[] arr;
    private int size,front, rear;
    public static int CAPACITY = 16;

    public QueueDC(){
        arr = new int[CAPACITY];
        size = 0;
        front = 0;
        rear = 0;
    }

    public QueueDC(int cap){
        CAPACITY = cap;
        arr = new int[cap];
        size = 0;
        front = 0;
        rear = 0;
    }

    public void enQueue(int data) throws IllegalAccessException {
        if(isFull()){
            expand();
        }
        size++;
        arr[rear] = data;
        rear = (rear+1)%CAPACITY;

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
            arr[front] = Integer.MIN_VALUE;
            front = (front+1)%CAPACITY;
        }
        return data;
    }

    private void expand(){
        int length = size();
        int[] newArr = new int[length<<1];
        for(int i=front;i <= rear;i++){
            newArr[i-front] = arr[i%CAPACITY];
        }
        arr = newArr;
        front = 0;
        rear = size - 1;
        CAPACITY *=2;
    }

    private void shrink(){
        int length = size();
        int[] newArr;
        if(length<<2 <= CAPACITY){
            newArr = new int[CAPACITY/2];
            System.arraycopy(arr,0,newArr,0,length+1);
            arr = newArr;
        }
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
