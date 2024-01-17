package LinkedList.UnRolledLinkedList;

public class Node {
    int size;
    int[] array;
    Node next;

    Node(int capacity) {
        this.array = new int[capacity];
        this.next = null;
        this.size=0;
    }
}
