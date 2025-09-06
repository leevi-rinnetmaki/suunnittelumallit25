package chain_of_responsibility;
import java.util.ArrayList;

public class GeneralFeedback extends Handler {

    ArrayList<Message> garbage = new ArrayList<>();
    
    @Override
    public void handle(Message message){
        System.out.println("Thank you for your feedback!");
        garbage.add(message);
    }
}