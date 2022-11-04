package stack.stackImpl;

public class ThreeStackInOneArray {
    private int[] dataArray;
    private int topOne,topTwo,topThree,BaseThree;
    private int size;

    public ThreeStackInOneArray(int size){
        if(size<3)
            throw new RuntimeException("size<3 not allowed");
        this.size = size;
        topOne = -1;
        topTwo = size;
        BaseThree = size/2;
        topThree = BaseThree;
    }

    public void push(int stackId){
        if(stackId==1){

        }
        else if(stackId==2){

        }
        else if(stackId ==3){

        }
        else
            throw new RuntimeException("Invalid stack ID");
    }

    public void pop(int stackId){
        if(stackId==1){

        }
        else if(stackId==2){

        }
        else if(stackId ==3){

        }
        else
            throw new RuntimeException("Invalid stack ID");
    }

    public void top(int stackId){
        if(stackId==1){

        }
        else if(stackId==2){

        }
        else if(stackId ==3){

        }
        else
            throw new RuntimeException("Invalid stack ID");
    }

}
