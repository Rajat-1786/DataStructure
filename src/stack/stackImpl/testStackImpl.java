package stack.stackImpl;

public class testStackImpl {
    public static void main(String[] args){
        TwoStackInOneArray stack = new TwoStackInOneArray(4);
        stack.push(1,10);
        stack.push(2,20);
        stack.push(1,11);
        stack.push(2,19);
//        stack.push(2,3);
        System.out.println(stack.top(2));
        System.out.println(stack.top(1));
    }
}
