package SinglyLinkedList;

public class LinkedList {
    private int length;
    private ListNode head;

    public LinkedList(){
        this.length = 0;
        this.head = null;
    }

    public ListNode getHead(){
        return this.head;
    }

    // Insert at Begin of te list
    public void insertAtBegin(ListNode node){
        if(head == null){
            head = node;
            length++;
        }
        else{
            node.setNext(head);
            head = node;
            length++;
        }
    }

    //Insert at End of the List
    public void insertAtEnd(ListNode node){
        if(head == null){
            head = node;
            length++;
        }
        else{
            ListNode temp = head;
            while(temp.getNext()
                    != null){
               temp = temp.getNext();
            }
            temp.setNext(node);
            length++;
        }
    }

    //Insert at Specified Position
    public void insertAtPosition(ListNode node, int pos){

    }

    public int Length(){
        return length;
    }

    @Override
    public String toString() {
        String result = "[";
        if(head == null){
            return result + "]";
        }
        result = result + head.getName();
        ListNode temp = head.getNext();
        while(temp != null){
            result = result + ", " + temp.getName();
            temp = temp.getNext();
        }
        return result + "]";
    }
}
