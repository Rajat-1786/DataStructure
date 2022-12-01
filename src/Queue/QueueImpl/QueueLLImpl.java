package Queue.QueueImpl;

public class QueueLLImpl {
    private int length = 0;
    QueueLL front,rear;

    public QueueLLImpl(){
        this.length = 0;
        this.front = null;
        this.rear = null;
    }

    public void enQueue(int data){
        QueueLL node = new QueueLL(data);
        if(front==null){
            front = node;
            rear = node;
            front.setNext(null);
        }
        else{
            rear.setNext(node);
            rear = rear.getNext();
        }
        length++;
    }

    public int deQueue(){
        int data;
        if(isEmpty()){
            throw new RuntimeException("Queue is Empty");
        }
        else{
            data = front.getData();
            front = front.getNext();
            length--;
        }
        return data;
    }


    public boolean isEmpty(){
        if(length==0)
            return true;
        return false;
    }

    public String toString(){
        String str = "";
        QueueLL temp=front;
        while(temp!=null) {
            str = str + Integer.valueOf(temp.getData())+"\t";
            temp = temp.getNext();
        }
        return str;
    }
}
