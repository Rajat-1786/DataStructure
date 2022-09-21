package SinglyLinkedList;

public class Main {

    public static void main(String[] args){
        LinkedList linkedList = new LinkedList();
        System.out.println(linkedList);
        linkedList.insertAtBegin(new ListNode("Rajat"));
        linkedList.insertAtEnd(new ListNode("Hemant"));
        linkedList.insertAtBegin(new ListNode("Ramu"));
        System.out.println(linkedList);
        System.out.println(linkedList.Length());

    }
}
