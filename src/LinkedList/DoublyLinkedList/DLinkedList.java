package LinkedList.Prac.DoublyLinkedList;

public class DLinkedList {
    int length = 0;
    private DLLNode head;

    public DLinkedList(){
        this.length = 0;
        this.head = null;
    }

    public DLLNode getHead(){
        return head;
    }

    public int length(){
        return this.length;
    }

    public String toString(){
        StringBuffer result = new StringBuffer("[");
        if(head == null){
            return result.append("]").toString();
        }
        result.append(head.getData());
        DLLNode p = head.next;
        while(p!=null){
            result.append(",");
            result.append(p.getData());
            p = p.next;
        }
        result.append("]");
        return result.toString();
    }

    public void insertAtBeg(int data){
        DLLNode node = new DLLNode(data);
        if(head == null) {
            head = node;
        }
        else{
            node.next = head;
            head.prev = node;
            head = node;
        }
        length++;
    }

    public void insertAtEnd(int data){
        DLLNode node = new DLLNode(data);
        if(head == null){
            head = node;
        }
        else{
            DLLNode p = head;
            while(p.next != null){
                p = p.next;
            }
            p.next = node;
            node.prev= p;
        }
        length++;
    }

    public void insertAtPos(int data, int pos){
        DLLNode node = new DLLNode(data);
        if(head == null){
            head = node;
        }
        else if(pos==1){
            insertAtBeg(data);
        }
        else{
            DLLNode p = head;
            for(int i=1;i<pos-1;i++){
                p = p.next;
            }
            node.next = p.next;
            p.next.prev = node;
            node.prev = p;
            p.next = node;
            length++;
        }

    }

    public int deleteAtBeg(){

        if(head == null){
            return -1;
        }
        else{
            int element = head.getData();
            DLLNode temp = head;
            head = temp.next;
            head.prev = null;
            temp.next = null;
            temp = null;
            length--;
            return element;
        }
    }

    public int deleteAtEnd(){
        if(head == null){
            return -1;
        }
        else{
            DLLNode p = head;
            while(p.next.next!=null){
                p = p.next;
            }
            int element = p.next.getData();
            p.next.prev = null;
            p.next = null;
            length--;
            return element;
        }

    }

    public int deleteAtPos(int pos){
        if(head == null){
            return -1;
        }
        else if(pos==1){
            return deleteAtBeg();
        }
        else if(pos==length){
            return deleteAtEnd();
        }
        else{
            DLLNode p = head;
            for(int i=1;i<pos-1;i++){
                p = p.next;
            }
            int element = p.next.getData();
            DLLNode temp = p.next;
            p.next = temp.next;
            temp.prev = null;
            temp.next.prev = p;
            temp.next = null;
            temp = null;
            length--;
            return element;
        }
    }

    public int deleteMatched(int data){
        if(head == null){
            return -1;
        }
        else if(data==head.getData()){
            return deleteAtBeg();
        }
        else{
            DLLNode p = head.next;
            DLLNode prev = null;
            while(p.getData()!=data){
                prev = p;
                p = p.next;
            }
            if(p==null){
                return 0;
            }
            else if(p.next==null){
                return deleteAtEnd();
            }
            else{
                prev.next = p.next;
                p.prev = null;
                p.next.prev = prev;
                p.next = null;
                p=null;
                length--;
            }

            return data;
        }
    }

    public void clearList(){
        head = null;
        length = 0;
    }
}
