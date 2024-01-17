package LinkedList.UnRolledLinkedList;

public class UnRolledLinkedList {
    int NODE_CAPACITY = 5;
    private Node head;
    private Node tail;

    public UnRolledLinkedList(){
        this.head = null;
        this.tail = null;
    }

    public void insert(int data){
        if(head==null){
            head = new Node(NODE_CAPACITY);
            head.array[head.size] = data;
            head.size++;
            tail = head;
        }else{
            if(tail.size == NODE_CAPACITY){
                Node node = new Node(NODE_CAPACITY);
                node.array[node.size] = data;
                node.size++;
                tail.next = node;
                tail = node;
            }
            else{
                tail.array[tail.size] = data;
                tail.size++;
            }
        }
    }

    public void insertAtNode(int index,int data,Node node){

    }

    public int remove(int data){
        int element = -1;
        Node temp = head;
        while(temp!=null){
            for(int i=0;i<temp.size;i++){
                if(temp.array[i]==data){
                    element = temp.array[i];
                    for(int j = i;j<temp.size-1;j++){
                        int next = temp.array[j+1];
                        temp.array[j] = next;
                    }
                    temp.array[temp.size-1]=-1;
                    break;
                }
            }
            temp = temp.next;
        }
        return element;
    }

    public int removeAtNode(int index, Node node){

        return -1;
    }

    public String toString(){
        StringBuilder result =new StringBuilder("[");
        if(head==null){
            return result.append("]").toString();
        }

        Node temp = head;
        while(temp!=null){
            result.append("[");
            result.append(""+temp.array[0]);
            for(int i=1;i<temp.size;i++){
                result.append(",");
                result.append(temp.array[i]+"");
            }
            result.append("]");
            temp = temp.next;
        }
        result.append("]");
        return result.toString();
    }
}
