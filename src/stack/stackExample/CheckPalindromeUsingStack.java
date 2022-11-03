package stack.stackExample;

public class CheckPalindromeUsingStack {

    public static void main(String[] args){
        String s= "ababaXababa";
        if(checkPalindromeNotUsingStack(s)){
            System.out.println("String is Palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }
    }

    public static boolean checkPalindrome(String s){
        char[] inputChar =s.toCharArray();
        char[] stack = new char[s.length()];
        int i = 0;
        int top = -1;
        while(inputChar[i]!='X'){
            stack[++top]=inputChar[i];
            i++;
        }
        i++;
        while(i<inputChar.length){
            if(top==-1){
                return false;
            }
            if(inputChar[i]!=stack[top--]){
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean checkPalindromeNotUsingStack(String s){
        int i=0, j = s.length()-1;
        while(i<j && s.charAt(i) == s.charAt(j)){
            i++;
            j--;
        }
        if(i<j){
            return false;
        }
        else
            return true;
    }
}
