package Queue.QueueImpl;

public class QueueLL {
    private int data;
    QueueLL next;

    public QueueLL(int data){
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public QueueLL getNext() {
        return next;
    }

    public void setNext(QueueLL next) {
        this.next = next;
    }
}
