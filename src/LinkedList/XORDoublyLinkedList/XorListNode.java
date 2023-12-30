package LinkedList.XORDoublyLinkedList;

public class XorListNode {
    private int data;
    XorListNode ptrdff;

    public XorListNode(int data){
        this.data = data;
        this.ptrdff = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public XorListNode getNode() {
        return ptrdff;
    }

    public void setNode(XorListNode node) {
        this.ptrdff = node;
    }
}
