package stack.fixedarraystackimpl;

public class Main {
    public static void main(String[] args){
        stack stc = new stack();
        System.out.println(stc);

        for(int i=1;i<=10;i++){
            stc.push(i);
        }
        System.out.println(stc);
        System.out.println(stc.pop());
        System.out.println(stc);
        System.out.println(stc.peek());
    }
}
