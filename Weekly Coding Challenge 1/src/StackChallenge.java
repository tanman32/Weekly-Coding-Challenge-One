import java.util.Stack;

public class StackChallenge {
    Stack<Integer> stack = new Stack<Integer>();
    public void getStack(){
        //Populate Stack
        for(int i = 0; i < 5; i++){
            stack.push((int)Math.round(Math.random() * 100));
        }

        //Display stack, populate
        for(int i : stack){
            System.out.print(i + " ");
        }
        System.out.println();

        //Push to stack
        stack.push(199);

        //Display stack, after push
        for(int i : stack){
            System.out.print(i + " ");
        }
        System.out.println();

        //Push to stack
        stack.pop();

        //Display stack, after push
        for(int i : stack){
            System.out.print(i + " ");
        }
        System.out.println();

        //Get max value
        int maxValue = 0;
        for(int i : stack){
            if(maxValue < i){
                maxValue = i;
            }
        }
        System.out.println(maxValue);
    }
}
