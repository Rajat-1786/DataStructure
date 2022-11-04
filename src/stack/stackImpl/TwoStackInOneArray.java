package stack.stackImpl;

public class TwoStackInOneArray {
    private int[] dataArray;
    private int topOne;
    private int topTwo;
    private int size;

    public TwoStackInOneArray(int size){
        if(size<2)
            throw new RuntimeException("Size<2 is not allowed");
        this.size = size;
        dataArray = new int[size];
        topOne = -1;
        topTwo = size;
    }

    public void push(int stackId,int data){
        if(stackId==1){
            if(topOne+1 != topTwo){
                dataArray[++topOne] = data;
            }
            else
                throw new RuntimeException("stack1 is full");
        }
        else if(stackId==2){
            if(topTwo-1 != topOne){
                dataArray[--topTwo] = data;
            }
            else
                throw new RuntimeException("stack2 is full");
        }
        else{
            throw new RuntimeException("Input is valid!");
        }
    }

    public int pop(int stackId){
        if(stackId==1){
            if(topOne!=-1){
                int data = dataArray[topOne];
                dataArray[topOne] = -1;
                topOne--;
                return data;
            }
            else
                throw new RuntimeException("stack1 is empty");
        }
        else if(stackId==2){
            if(topTwo!=size){
                int data = dataArray[topTwo];
                dataArray[topTwo] = -1;
                topTwo++;
                return data;
            }
            else
                throw new RuntimeException("Stack2 is empty");
        }
        return -1;
    }

    public int top(int stackId){
        if(stackId==1){
            if(topOne!=-1)
                return dataArray[topOne];
        }
        else if(stackId==2){
            if(topTwo!=size)
                return dataArray[topTwo];
        }
        else
            throw new RuntimeException("Invalid stack ID");
        return -1;
    }

    public boolean isEmpty(int stackId){
        if(stackId ==1){
            if(topOne==-1){
                return true;
            }
            else
                return  false;
        }
        else if(stackId==2){
            if(topTwo==size){
                return true;
            }
            else
                return false;
        }
        else
            return true;
    }


}

