package LinkedList.Prac.SinglylinkedList;

public class LinkedList {
    private int length;

    ListNode head;

    public LinkedList(){
        this.length = 0;
        this.head = null;
    }

    public ListNode getHead(){
        return this.head;
    }

    public void insertAtBegin(ListNode node){
        node.next = head;
        head = node;
        length++;
    }

    public void insertAtTheEnd(ListNode node){
        if(head == null){
            insertAtBegin(node);
        }
        else {
            ListNode p = head;
            while (p.next != null) {
                p = p.next;
            }
            p.next = node;
        }
        length++;
    }

    public void insertAtPos(int pos, ListNode node){
        if(head == null){
            insertAtBegin(node);

        }
        else{
            ListNode p = head;
            for(int i=1;i<pos-1;i++){
                p = p.next;
            }
            node.next = p.next;
            p.next = node;

        }
        length++;
    }

    public int deleteAtBeg(){
        int element;
        if(head == null){
            return -1;
        }
        else{
            element = head.getData();
            head = head.next;
        }
        length--;
        return element;
    }

    public int deleteAtEnd(){
        int element;
        if(head==null){
            return -1;
        }
        else{

            ListNode p = head;
            while(p.next.next != null){
                p = p.next;
            }
            element = p.next.getData();
            p.next=null;
            length--;
        }
        return element;
    }

    public int deleteAtPos(int pos){
        int element;
        if(head==null){
            return -1;
        }
        else{
            ListNode p = head;
            for(int i = 1; i<pos-1; i++){
                p=p.next;
            }
            element = p.next.getData();
            p.next = p.next.next;
            length--;
        }
        return element;
    }

    public int removeMatchedElement(int element){
        if(head == null){
            return -1;
        }
        else{
            ListNode p = head;
            ListNode prev = null;
            while(p.getData() != element){
                prev = p;
                p = p.next;
            }
            prev.next = p.next;
            p.next = null;
            length--;
        }
        return 0;
    }

    public void clearList(){
        head=null;
        length = 0;
    }

    public int length(){
        return this.length;
    }

    public String toString(){
        StringBuffer result = new StringBuffer("[");
        if(head == null){
            return result.append("]").toString();
        }

        ListNode p = head.next;
        result.append(head.getData());

        while(p != null){
            result.append(",");
            result.append(p.getData());
            p = p.next;
        }

        return result.append("]").toString();
    }
}
