package LinkedList.CircularLinkedList;

public class Main {
    public static void main(String[] args){
        CircularLinkedlist list = new CircularLinkedlist();
        list.insertAtBeg(2);
        list.insertAtBeg(1);
        list.insertAtEnd(3);
        list.insertAtEnd(5);
        list.insertAtPos(4,1);
        System.out.println(list);
        System.out.println(list.deleteAtBeg());
        System.out.println(list);
        System.out.println(list.deleteAtEnd());
        System.out.println(list);
        System.out.println(list.deleteAtPos(3));
        System.out.println(list);
    }
}
