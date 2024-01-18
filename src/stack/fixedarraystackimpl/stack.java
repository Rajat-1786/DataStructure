package stack.fixedarraystackimpl;

public class stack {
    private int capacity = 10;
    int top = -1;
    int[] stackRep;

    public stack(){
        stackRep = new int[capacity];
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
            throw new RuntimeException("Stack is full");
        }
        stackRep[++top] = data;
    }

    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("Stack is Empty");
        }
        return stackRep[top--];
    }

    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("stack is Empty");
        }
        return stackRep[top];
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
