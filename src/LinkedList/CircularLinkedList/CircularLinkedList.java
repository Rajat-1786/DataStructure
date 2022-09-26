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

        }
        else{

        }
    }

    //Add Element at End
    public void addAtEnd(CLLNode node){
        if(tail == null){

        }
        else{

        }
    }

    // Add Element at pos
    public void addAtPos(int pos,String name){

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
          result = tail.getName();
          CLLNode temp = tail.getNext();
          while(temp!=tail){
              result = result +", " + temp.getName();
              temp = temp.getNext();
          }
      }
        return result +"]";
    }

}
