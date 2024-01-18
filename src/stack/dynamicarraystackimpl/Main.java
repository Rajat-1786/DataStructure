package stack.dynamicarraystackimpl;

public class Main {
    public static void main(String[] args){
        stack stc = new stack();
        System.out.println(stc);
        System.out.println(stc.getCapacity());
        for(int i=1;i<=17;i++){
            stc.push(i);
        }
        System.out.println(stc);
        System.out.println(stc.getCapacity());
        for(int i=1;i<=10;i++){
            stc.pop();
        }
        System.out.println(stc);
        System.out.println(stc.getCapacity());
//        System.out.println(stc.pop());
//        System.out.println(stc);
//        System.out.println(stc.peek());
    }
}
