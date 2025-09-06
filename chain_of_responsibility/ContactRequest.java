package chain_of_responsibility;
import chain_of_responsibility.Message.enumType;

public class ContactRequest extends Handler {

    @Override
    public void handle(Message message){
        if(message.getType() == enumType.contactRequest){
            if(message.senderEmail.equals("Jenny")){
                System.out.println("Your contact request has been approved.");
            }else{
                System.out.println("no");
            }
        }else{
            super.handle(message);
        }
    }
}