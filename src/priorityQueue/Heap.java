package priorityQueue;

import java.util.Arrays;

public class Heap {
    int[] array;
    int count;
    int capacity;
    int heap_type;

    public Heap(int capacity,int heap_type){
        this.capacity = capacity;
        this.heap_type = heap_type;
        this.count = 0;
        this.array = new int[capacity];
    }

    public int parent(int i){
        if(i<=0 || i>=this.count)
            return -1;
        return (i-1)/2;
    }

    public int leftChild(int i){
        int left = 2*i+1;
        if(left>=this.count)
            return -1;
        return left;
    }

    public int rightChild(int i){
        int right = 2 * i + 2;
        if(right>=this.count)
            return -1;
        return right;
    }

    public int getMax(){
        if(this.count==0)
            return -1;
        return this.array[0];
    }

    public void percolate_down(int i){
        int l,r,max,temp;
        l = leftChild(i);
        r = rightChild(i);
        if(l!=-1 && this.array[l]>this.array[i]){
            max = l;
        }else{
            max = i;
        }

        if(r!=-1 && this.array[r]>this.array[i])
            max = r;

        if(max!=i){
            temp = this.array[i];
            this.array[i]= this.array[max];
            this.array[max] = temp;
            percolate_down(max);
        }
    }

    public void insert(int data){
        int i;
        if(this.count == this.capacity)
            Resize();
        this.count++;
        i=this.count-1;
        this.array[i] = data;
        while(i>=0 && this.array[i]>this.array[(i-1)/2]){
            int temp = this.array[i];
            this.array[i] = this.array[(i-1)/2];
            this.array[(i-1)/2] = temp;
            i = (i-1)/2;
        }
    }

    public void Resize(){
        int[] old_array = new int[this.capacity];
        System.arraycopy(this.array,0, old_array,this.count-1,this.capacity);
        this.array = new int[this.capacity*2];
        for(int i=0;i<this.capacity;i++){
            this.array[i] = old_array[i];
        }
        this.capacity = this.capacity *2;
        old_array = null;
    }

    public int deleteMax(){
        int  data = this.array[0];
        this.array[0] = this.array[this.count-1];

        percolate_down(0);
        this.array[count-1] = 0;
        this.count--;
        return data;
    }

    public void destroy(){
        this.count = 0;
        this.array = null;
    }

    @Override
    public String toString() {
        return "Heap{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
