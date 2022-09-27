package LinkedList.CircularLinkedList;

public class Main {
    public static void main(String[] args){
        CircularLinkedList clist = new CircularLinkedList();
        clist.addAtStart(new CLLNode("Rajni"));
        clist.addAtEnd(new CLLNode("Saomya"));
        clist.addAtEnd(new CLLNode("Ram Kishan"));
        clist.addAtEnd(new CLLNode("Hari Kishan"));
        clist.addAtStart(new CLLNode("Ram Bhajan"));
        System.out.println(clist);
//        System.out.println(clist.removeAtEnd());
//        System.out.println(clist.removeAtStart());
//        System.out.println(clist.remove("Ram Bhajan"));
        System.out.println(clist.contains("Ram Kishan"));
        System.out.println(clist);

    }
}
