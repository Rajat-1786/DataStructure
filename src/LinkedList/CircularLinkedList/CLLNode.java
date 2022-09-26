package LinkedList.CircularLinkedList;

public class CLLNode {
    private String name;
    private CLLNode next;

    public CLLNode() {
        this.next = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CLLNode getNext() {
        return next;
    }

    public void setNext(CLLNode next) {
        this.next = next;
    }
}
