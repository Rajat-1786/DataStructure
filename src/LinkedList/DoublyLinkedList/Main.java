package LinkedList.Prac.DoublyLinkedList;

public class Main {
    public static void main(String[] args){
        DLinkedList list = new DLinkedList();
        list.insertAtBeg(2);
        list.insertAtBeg(1);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtPos(5,4);
        list.insertAtPos(7,1);
        System.out.println(list);
        System.out.println(list.deleteAtBeg());
        System.out.println(list);
        System.out.println(list.deleteAtEnd());
        System.out.println(list + "\n" + "length: " + list.length());
//        System.out.println(list.deleteAtPos(4));
        System.out.println(list.deleteMatched(5));
        System.out.println(list);
        list.clearList();
        System.out.println(list);
    }
}
