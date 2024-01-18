package LinkedList.CircularLinkedList;


public class CircularLinkedlist {
    private int length;
    CLLNode tail;
    public CircularLinkedlist() {
        this.length = 0;
        this.tail = null;
    }

    public int Length(){
        return this.length;
    }

    public String toString() {
        StringBuffer result = new StringBuffer("[");
        if (tail == null) {
            return result.append("]").toString();
        }
        result.append(tail.next.getData());
        CLLNode p = tail.next;


        while (p.next != tail) {
            result.append(",");
            result.append(p.next.getData());
            p = p.next;
        }

        if (length != 1) {
            result.append(",");
            result = result.append(tail.getData());
        }
        return result.append("]").toString();
    }

    public void insertAtBeg(int data){
        CLLNode node = new CLLNode(data);
        if(tail == null){
            tail = node;
            tail.next = tail;
        }
        else{
            node.next = tail.next;
            tail.next = node;
            node = null;
        }
        length++;
    }
    public void insertAtEnd(int data){
        CLLNode node = new CLLNode(data);
        if(tail == null){
            tail = node;
            tail.next = tail;
        }
        else{
            node.next = tail.next;
            tail.next = node;
            tail = node;
            node = null;
        }
        length++;
    }

    public void insertAtPos(int data,int pos){
        if(tail==null){
            insertAtBeg(data);
        }
        else if(pos == 1){
            insertAtBeg(data);
        }
        else{
            CLLNode node = new CLLNode(data);
            CLLNode p = tail.next;
            for(int i=1;i<pos-1;i++){
                p = p.next;
            }
            node.next = p.next;
            p.next = node;
            node =null;
            length++;
        }
    }

    public int deleteAtBeg(){
        if(tail == null){
            return -1;
        }
        else {
            int element = tail.next.getData();
            CLLNode temp = tail.next;
            tail.next = temp.next;
            temp.next = null;
            temp = null;
            length--;
            return element;
        }
    }

    public int deleteAtEnd(){
        if(tail == null){
            return -1;
        }
        else{
            int element;
            CLLNode p = tail.next;
            while(p.next!=tail){
                p=p.next;
            }
            CLLNode temp = tail;
            element = tail.getData();
            p.next = tail.next;
            tail.next = null;
            tail = null;
            tail = p;
            length--;
            return element;
        }
    }

    public int deleteAtPos(int pos){
        if(tail ==null){
            return -1;
        }
        else if(pos == 1){
            return deleteAtBeg();
        }
        else if(pos==length){
            return deleteAtEnd();
        }
        else{
            int element;
            CLLNode p = tail.next;
            for(int i=1;i<pos-1;i++){
                p = p.next;
            }
            CLLNode temp = p.next;
            p.next = temp.next;
            temp.next = null;
            element = temp.getData();
            temp = null;
            length--;
            return element;
        }
    }

    public void clearList(){
        tail = null;
        length=0;
    }
}
