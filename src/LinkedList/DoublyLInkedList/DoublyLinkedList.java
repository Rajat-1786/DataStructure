package LinkedList.DoublyLInkedList;

public class DoublyLinkedList {

    private ListNode head;

    private int length;

    public DoublyLinkedList() {
        this.head = null;
        this.length = 0;
    }

    //Return length
    public int getLength(){
        return length;
    }

    //Add Element in the starting
    public  void insertAtBegin(ListNode node){
        if(head==null){
            head = node;
        }
        else{
            node.setNext(head);
            head=node;
        }
        length++;
    }

    // Add Element in the End
    public void insertAtEnd(ListNode node){
        if(head == null){
            head =  node;
        }
        else{
            ListNode temp = head;
            while(temp.getNext()!=null){
                temp = temp.getNext();
            }
            node.setPrev(temp);
            temp.setNext(node);
        }
        length++;
    }

    //Add Element at position
    public void insertAtPos(ListNode node, int pos){
        if(pos<0){
            pos = 0;
        }else if(pos>length){
            pos=length;
        }
        if(head ==null){
            head=node;
        }
        else if(pos == 0 || pos == 1){
            node.setNext(head);
            head.setPrev(node);
            head=node;
        }
        else{
            ListNode temp = head;
            for(int i=1;i<pos-1;i++){
                temp=temp.getNext();
            }
            node.setNext(temp.getNext());
            temp.getNext().setPrev(node);
            node.setPrev(temp);
            temp.setNext(node);
        }
        length++;
    }

    //Remove Element from starting
    public String removeAtBegin(){
        String result ;
        if(head==null){
            result = "List is Empty";
        }
        else{
            ListNode temp = head;
            head = head.getNext();
            temp.setNext(null);
            head.setPrev(null);
            result = temp.getName();
            temp=null;
        }
        return result;
    }

    //Remove Element from End
    public String removeAtEnd(){
        String result ;
        if(head==null){
            result = "List is Empty";
        }
        else{
            ListNode temp = head;
            while(temp.getNext()!=null){
                temp=temp.getNext();
            }
            temp.getPrev().setNext(null);
            temp.setPrev(null);
            result = temp.getName();
            temp=null;
        }
        return result;
    }

    //remove Matched Element
    public String removeMatched(String tobeMatch){
        String result = "";
        if(head==null){
            result = "List is Empty";
        }
        else {
            ListNode temp = head.getNext();
            if (head.getName().equals(tobeMatch)) {
                result = head.getName();
                temp = head;
                head = head.getNext();
                head.setPrev(null);
                temp.setNext(null);
                temp = null;
            } else {
                ListNode prev = head;
                while (temp != null) {
                    if (temp.getName().equals(tobeMatch)) {
                        if(temp.getNext()==null){
                            temp.getPrev().setNext(null);
                            temp.setPrev(null);
                            result = temp.getName();
                            temp=null;

                        }
                        else {
                            prev = temp.getPrev();
                            prev.setNext(temp.getNext());
                            temp.getNext().setPrev(prev);
                            result = temp.getName();
                            temp = null;
                            prev = null;

                        }
                        break;
                    }
                    temp = temp.getNext();
                }
            }
        }
        return result;
    }

    //Clear List
    public void clear(){
        head = null;
        length = 0;
    }

    @Override
    public String toString() {
        String result = "[";
        if(head==null){
            return result +"]";
        }
        result = result + head.getName();
        ListNode temp = head.getNext();
        while(temp!=null) {
            result = result +", "+ temp.getName();
            temp = temp.getNext();
        }
        return result +"]";
    }
}
