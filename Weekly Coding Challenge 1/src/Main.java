import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Integer> llistOne = new LinkedList<Integer>();
        llistOne.add(3);
        llistOne.add(7);
        llistOne.add(8);
        llistOne.add(10);

        List<Integer> llistTwo = new LinkedList<Integer>();
        llistTwo.add(99);
        llistTwo.add(1);
        llistTwo.add(8);
        llistTwo.add(10);

        ListChallenge list = new ListChallenge();
        int displayVal = list.getNode(llistOne,llistTwo);
        System.out.println("Node value: " + displayVal);

        //Part 2
        StackChallenge stack = new StackChallenge();
        stack.getStack();
    }
}
