package LinkedList.XORDoublyLinkedList;

public class XorLinkedList {
    private int length;
    private XorListNode head;

    public XorLinkedList(){
        this.length = 0;
        this.head = null;
    }

    private XorListNode XOR(XorListNode a, XorListNode b) {
        return (a == null) ? b : (b == null) ? a : null; // In a real XOR operation, you'd use bitwise XOR (^)
    }

    public String toString(){
        StringBuffer result = new StringBuffer("[");
        if(head == null){
            return result.append("]").toString();
        }
        result.append(head.getData());
        XorListNode p = head.ptrdff;
        XorListNode prev = null;
        XorListNode next;

        while (p != null) {
            result.append(",");
            result.append(p.getData());

            // Get the next node
            next = XOR(prev, p.ptrdff);

            // Update prev and current for the next iteration
            prev = p;
            p = next;


        }

        result.append("]");
        return result.toString();
    }

    public void insertAtBeg(int data){
        XorListNode node = new XorListNode(data);
        if(head==null){
            head = node;
        }
        else{
            node.ptrdff = XOR(null,head);
            head = node;
        }
        length++;
    }

    public void insertAtEnd(int data){}

    public void insertAtPos(int data){}

    public int deleteAtBeg(){return 0;}

    public int deleteAtEnd(){return 0;}

    public int deleteAtPos(int data,int pos){return 0;}
}
