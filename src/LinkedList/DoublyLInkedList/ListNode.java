package LinkedList.DoublyLInkedList;

public class ListNode {
    private String name;

    private ListNode next;
    private ListNode prev;

    public ListNode(String name) {
        this.name = name;
        this.next = null;
        this.prev = null;
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

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode getPrev() {
        return prev;
    }

    public void setPrev(ListNode prev) {
        this.prev = prev;
    }
}
