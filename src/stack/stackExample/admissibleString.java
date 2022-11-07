package stack.stackExample;

public class admissibleString {
    public static void main(String[] args){

        String s ="SSSXXX";
        boolean flag = checkStringIsAdmissible(s);
        if(flag){
            System.out.println("String "+s+" is admissible");
        }
        else {
            System.out.println("String "+s+" is not admissible");
        }
    }

    public static boolean checkStringIsAdmissible(String s){
        int top =-1;
        boolean flag = false;
        int[] arr = new int[s.length()];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='S'){
                if(top!=s.length()){
                    arr[++top] = 1;
                }
                else{
                    return false;
                }
            }
            else if(ch=='X'){
                if(top!=-1){
                    arr[top--] = -1;
                }
                else{
                    return false;
                }
            }
        }

        if(top==-1){
            flag = true;
        }

        return flag;
    }
}
