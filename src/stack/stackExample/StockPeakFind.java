package stack.stackExample;

public class StockPeakFind{

    public static void main(String[] args){
        int[] arr = new int[]{6,3,2,5,7};

        int[] spans = findSpansFast(arr);
        for(int i: spans){
            System.out.println(i);
        }
    }

    public static int[] findSpans(int[] input){
        int[] spans = new int[input.length];
        for(int i=0;i<input.length;i++){
            int span = 1;
            int j = i-1;
            while(j>=0 && input[j]<=input[j+1]){
                span++;
                j--;
            }
            spans[i] = span;
        }

        return spans;
    }

    public static int[] findSpansFast(int[] input){
        int[] spans = new int[input.length];
        int p=0, top=-1;
        int[] stack = new int[input.length];
        for(int i=0;i<input.length;i++){
            while(top!=-1 && input[i]>input[stack[top]])
            {
                stack[top--] = -1;
            }
            if(top==-1){
                p = -1;
            }
            else
                p = stack[top];

            spans[i] = i-p;
            stack[++top] = i;
        }
        return spans;
    }
}
