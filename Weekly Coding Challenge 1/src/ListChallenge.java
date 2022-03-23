import java.util.List;

public class ListChallenge {
    public int getNode(List listOne, List listTwo){
        int counter = 0;
        while(true){
            if(listOne.get(counter) == listTwo.get(counter)){
                return (int) listOne.get(counter);
            }
            counter++;
        }
    }
}
