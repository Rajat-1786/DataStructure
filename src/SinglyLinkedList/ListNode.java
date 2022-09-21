package SinglyLinkedList;

public class ListNode {
    private String name;
    private ListNode next;

    public ListNode(String name){
        this.name = name;
        this.next = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListNode getNext() {
        return next;

    }

    public void setNext(ListNode node) {
        this.next = node;
    }
}
