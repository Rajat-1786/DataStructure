package LinkedList.SinglyLinkedList;

public class LinkedList {
    private int length;
    private ListNode head;

    public LinkedList(){
        this.length = 0;
        this.head = null;
    }

    public ListNode getHead(){
        return this.head;
    }

    // Insert at Begin of te list
    public void insertAtBegin(ListNode node){
        if(head == null){
            head = node;
            length++;
        }
        else{
            node.setNext(head);
            head = node;
            length++;
        }

    }

    //Insert at End of the List
    public void insertAtEnd(ListNode node){
        if(head == null){
            head = node;
            length++;
        }
        else{
            ListNode temp = head;
            while(temp.getNext()
                    != null){
               temp = temp.getNext();
            }
            temp.setNext(node);
            length++;
        }
    }

    //Insert at Specified Position
    public void insertAtPosition(ListNode node, int pos){
        if(pos<0){
            pos=0;
        }
        else if(pos>length){
            pos=length;
        }
        if(head == null){
            head = node;
            length++;
        }
        else if(pos==0 || pos ==1){
            this.insertAtBegin(node);
        }else{
            ListNode temp = head;
            for(int i=1 ; i<pos-1;i++){
                temp = temp.getNext();
            }
            node.setNext(temp.getNext());
            temp.setNext(node);
            length++;
        }

    }

    //delete the first Element
    public String removeAtFirst(){
        ListNode temp=head;
        head = temp.getNext();
        String name = temp.getName();
        temp=null;
        length--;
        return name;
    }

    //delete the last element
    public String removeAtLast() {
        ListNode temp = head;
        ListNode prev = null;
        if (temp == null) {
            return "LinkedList is empty";
        } else {
            while (temp.getNext() != null) {
                prev = temp;
                temp = temp.getNext();
            }
            prev.setNext(null);
            String name = temp.getName();
            length--;
            temp = null;
            prev = null;
            return name;
        }
    }

    //remove Matched Element
    public String removeMatchedElement(String toBeMatch){
        String name;
        if(head==null){
            name = "No Element found in LinkedList";
        }
        else {
            ListNode temp,prev;
            temp=head;
            prev=null;
            if(head.getName().equals(toBeMatch)){
                head=temp.getNext();
                name = temp.getName();
                temp=null;
                length--;
            }
            else {
                while (!temp.getName().equals(toBeMatch)) {
                    prev = temp;
                    temp = temp.getNext();
                }
                prev.setNext(temp.getNext());
                name = temp.getName();
                temp = null;
                prev = null;
                length--;
            }

        }
        return name;
    }

    //Remove the matched Element
    public String removeAtPos(int pos){
        String name;
        if(pos<0 || pos>length){
            name="Invalid Position";
        }
        else{
            if(head==null){
                name="Linked List is empty";
            }
            else{
                ListNode temp,prev =null;
                temp=head;
                if(pos==1){
                    head=temp.getNext();
                    name = temp.getName();
                    temp=null;
                    length--;
                }
                else {
                    for (int i = 1; i < pos; i++) {
                        prev = temp;
                        temp = temp.getNext();
                    }
                    prev.setNext(temp.getNext());
                    name = temp.getName();
                    temp = null;
                    prev = null;
                    length--;
                }
            }
        }
        return name;
    }
    public int Length(){
        return length;
    }

    public void clearList(){
        head=null;
        length=0;
    }

    public int getPos(String name){
        int pos = 1;
        if(head==null){
            pos= -1;
        }
        else {
            ListNode temp = head;
            while(temp!=null){
                if(temp.getName().equals(name)){
                    return pos;
                }
                pos++;
                temp=temp.getNext();
            }
        }
        return pos;
    }

    @Override
    public String toString() {
        String result = "[";
        if(head == null){
            return result + "]";
        }
        result = result + head.getName();
        ListNode temp = head.getNext();
        while(temp != null){
            result = result + ", " + temp.getName();
            temp = temp.getNext();
        }
        return result + "]";
    }
}
