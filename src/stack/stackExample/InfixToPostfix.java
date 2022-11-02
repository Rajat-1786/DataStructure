package stack.stackExample;

public class InfixToPostfix {
    public static void main(String[] args){
        String infix = "(A+B)*C-D";
        System.out.println("Infix Expression: "+infix);
        String postfix = new InfixToPostfix().infixToPostfix(infix);
        System.out.println("Postfix Expression: "+postfix);
    }
    public String infixToPostfix(String infix){
        //create stack
        int top = -1;
        char[] st = new char[infix.length()];

        //create a empty postfix expression
        StringBuffer postfix = new StringBuffer();

        //Scan every charatcer in infix expression
        for(int i=0;i<infix.length();i++){
            char ch = infix.charAt(i);

            /*if character is operand then add it to postfix expression. else if character is closing bracket then
            pop out every character from stack untill left parenthsis is encountered  and append it to postfix.
            else pop out character from stack untill lower priority chanracter is encountered or left parenthsis or an
            empty stack.
             */
            if((int)ch>=65 && (int)ch<=90){
                postfix.append(Character.valueOf(ch));
            }
            else if(ch==')'){
                while(st[top]!='('){
                    if(st[top]!='(')
                        postfix.append(st[top--]);
                }
                top--;
            }
            else{
                if(ch!='(') {
                    while (top != -1 && prec(ch) <= prec(st[top])) {
                        postfix.append(st[top--]);
                    }
                }
                st[++top] = ch;
            }
        }
        // pop out every character from stack and append it to postfix expression.
        while(top!=-1){
            postfix.append(st[top--]);
        }
        return postfix.toString();
    }

    private int prec(char ch){
        switch(ch){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
        }
        return -1;
    }
}
