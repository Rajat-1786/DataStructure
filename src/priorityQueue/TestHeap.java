package priorityQueue;

public class TestHeap {
    public static void main(String[] args){
        Heap pq = new Heap(10,1);

        pq.insert(5);
        pq.insert(1);
        pq.insert(2);
        pq.insert(4);
        pq.insert(3);

        System.out.println(pq);
        System.out.println(pq.getMax());
        System.out.println(pq.array[pq.parent(3)]);
        System.out.println(pq.array[pq.leftChild(0)]);
        System.out.println(pq.array[pq.rightChild(0)]);
        System.out.println(pq.deleteMax());
        System.out.println(pq);
        System.out.println(pq.getMax());


    }
}
