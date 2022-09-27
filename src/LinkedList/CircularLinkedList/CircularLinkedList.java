package LinkedList.CircularLinkedList;

public class CircularLinkedList {
    private int length = 0;
    private CLLNode tail;

    public CircularLinkedList() {
        this.tail = null;
    }

    //add element to the starting
    public void addAtStart(CLLNode node){
        if(tail == null){
            tail = node;
            tail.setNext(tail);
        }
        else{
            node.setNext(tail.getNext());
            tail.setNext(node);
        }
        length++;
    }

    //Add Element at End
    public void addAtEnd(CLLNode node){
        addAtStart(node);
        tail = tail.getNext();
    }

    // Add Element at pos
    public void addAtPos(int pos,String name){

    }

    //remove from start
    public String removeAtStart(){
        String result;
        if(tail==null){
            result = "List is empty";
        }
        else{
            CLLNode temp = tail.getNext();
            tail.setNext(temp.getNext());
            result = temp.getName();
            temp=null;
            length--;
        }
        return result;
    }

    //remove element at ENd
    public String removeAtEnd(){
        String result;
        if(tail==null){
            result = "List is Empty";
        }
        else{
            CLLNode temp = tail.getNext();
            while(temp.getNext()!=tail){
                temp = temp.getNext();
            }
            temp.setNext(tail.getNext());
            result = tail.getName();
            tail = temp;
            length--;
            temp = null;
        }
        return result;
    }

    //remove from anywhere
    public String remove(String name){
        String result = "";
        if(tail == null){
            result="List is Empty";
        }
        else{
            CLLNode temp = tail.getNext();
            CLLNode prev = tail;
            if(tail.getName().equals(name)){
                result = removeAtEnd();
            }
            else{
               while(temp!=tail){
                   if(temp.getName().equals(name)){
                       prev.setNext(temp.getNext());
                       result = temp.getName();
                       temp=null;
                       length--;
                       break;
                   }
                   prev = temp;
                   temp = temp.getNext();
               }
            }
        }
        return result;
    }

    //check element is exist or not;
    public boolean contains(String data){
        boolean res = false;
        if(tail != null) {
            CLLNode temp = tail.getNext();
            if (tail.getName().equals(data))
                res = true;
            else {
                while (temp != tail) {
                    if (temp.getName().equals(data)) {
                        res = true;
                        break;
                    }
                    temp = temp.getNext();
                }
            }
        }
        return res;
    }
    //get Length of LinkedList
    public int getLength(){
        return length;
    }

    // Clear all Element
    public void clear(){
        tail = null;
        length =0;
    }

    @Override
    public String toString() {
      String result = "[";
      if(tail == null){
          return result+"]";
      }
      else{
          result = result + tail.getNext().getName();
          CLLNode temp = tail.getNext();
          while(temp.getNext()!=tail){
              result = result +", " + temp.getNext().getName();
              temp = temp.getNext();
          }
          if(length!=1)
              result = result + ", "+ tail.getName();
      }
        return result +"]";
    }

}
