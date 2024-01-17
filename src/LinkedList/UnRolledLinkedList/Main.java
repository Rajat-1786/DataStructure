package LinkedList.UnRolledLinkedList;

public class Main {
    public static void main(String[] args){
        UnRolledLinkedList list = new UnRolledLinkedList();
        System.out.println(list);
        for(int i=1;i<=10;i++){
            list.insert(i);
        }
        System.out.println(list);
        System.out.println(list.remove(7));
        System.out.println(list);
    }
}
