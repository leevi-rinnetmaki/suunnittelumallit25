package chain_of_responsibility;
import chain_of_responsibility.Message.enumType;

public class DevelopmentSuggestion extends Handler {

    @Override
    public void handle(Message message){
        if(message.getType() == enumType.developmentSuggestion){
            System.out.println("Thank you for your development suggestion. We will exam it thoroughly.");
            while(message!=null){
                message=null;
            }
        }else{
            super.handle(message);
        }
    }
}