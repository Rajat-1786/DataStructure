package LinkedList.DoublyLInkedList;

public class Main {

    public static void main(String[] args){

        DoublyLinkedList list = new DoublyLinkedList();
        System.out.println(list);
        list.insertAtBegin(new ListNode("Rajat"));
        list.insertAtEnd(new ListNode("Rahul"));
        list.insertAtBegin(new ListNode("Hemu"));
        list.insertAtPos(new ListNode("Jhatua"), 2);
        System.out.println(list);

    }
}
