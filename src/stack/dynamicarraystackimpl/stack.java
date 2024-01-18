package stack.dynamicarraystackimpl;

public class stack {
    private int capacity = 16;
    int top = -1;
    int[] stackRep;

    public stack(){
        stackRep = new int[capacity];
    }

    public int getCapacity(){
        return this.capacity;
    }
    public stack(int capacity){
        this.capacity = capacity;
        stackRep = new int[this.capacity];
    }

    public int size(){
        return top+1;
    }

    public boolean isEmpty(){
        return top == -1 ? true:false;
    }
    public boolean isFull(){
        return top+1 == capacity ? true : false;
    }

    public void push(int data) {
        if(isFull()){
            expand();
        }
        stackRep[++top] = data;
    }

    public int pop(){
        if(size()==(capacity-(capacity*3)/4)){
            shrink();
        }
        return stackRep[top--];
    }

    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("stack is Empty");
        }
        return stackRep[top];
    }

    void expand(){
        int newCapacity = capacity * 2;
        int[] newStack = new int[newCapacity];
        System.arraycopy(stackRep,0,newStack,0,size());
        stackRep = newStack;
        capacity = newCapacity;
    }

    void shrink(){
        int newCapacity = capacity/2;
        int[] newStack = new int[newCapacity];
        System.arraycopy(stackRep,0,newStack,0,size());
        stackRep = newStack;
        capacity = newCapacity;
    }

    public String toString(){
        StringBuilder result = new StringBuilder("[");
        if(isEmpty()){
            return result.append("]").toString();
        }
        int itr = 0;
        result.append(stackRep[itr++]+"");
        while(itr<size()){
            result.append(",");
            result.append(stackRep[itr++]+"");
        }
        result.append("]");
        return result.toString();
    }
}
