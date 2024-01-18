package LinkedList.Prac.SinglylinkedList;

public class Main {

    public static void main(String args[]){
        LinkedList list = new LinkedList();
        list.insertAtBegin(new ListNode(3));
        list.insertAtBegin(new ListNode(2));
        list.insertAtBegin(new ListNode(1));
        list.insertAtTheEnd(new ListNode(4));
        list.insertAtTheEnd(new ListNode(5));
        list.insertAtPos(3,new ListNode(6));
        System.out.println(list);
//        System.out.println(list.deleteAtBeg());
//        System.out.println(list);
//        System.out.println(list.deleteAtEnd());
//        System.out.println(list);
//        System.out.println(list.deleteAtPos(3));
//        System.out.println(list);
        if(list.removeMatchedElement(3)==0){
            System.out.println("Element removed successfully");
        }
        System.out.println(list);
        list.clearList();
        System.out.println(list);

    }
}
