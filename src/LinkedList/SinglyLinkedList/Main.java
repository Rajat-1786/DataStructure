package LinkedList.SinglyLinkedList;

public class Main {

    public static void main(String[] args){
        LinkedList linkedList = new LinkedList();
        System.out.println(linkedList);
        linkedList.insertAtBegin(new ListNode("Rajat"));
        linkedList.insertAtEnd(new ListNode("Hemant"));
        linkedList.insertAtBegin(new ListNode("Ramu"));
        linkedList.insertAtPosition(new ListNode("Prince"), 3);
        System.out.println(linkedList);
        System.out.println(linkedList.Length());
//        System.out.println(linkedList.removeAtFirst());
//        System.out.println(linkedList);
//        System.out.println(linkedList.Length());
//        System.out.println(linkedList.removeAtLast());
//        System.out.println(linkedList);
//        System.out.println(linkedList.Length());
//        System.out.println(linkedList.removeMatchedElement("Hemant"));
//        System.out.println(linkedList.removeAtPos(4));
        System.out.println(linkedList.getPos("Rajat"));
        System.out.println(linkedList);
        System.out.println(linkedList.Length());

    }
}
