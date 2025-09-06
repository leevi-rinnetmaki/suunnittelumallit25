package chain_of_responsibility;
import chain_of_responsibility.Message.enumType;

public class CompensationClaim extends Handler {

    private boolean validClaims = false;
    
    @Override
    public void handle(Message message){
        if(message.getType() == enumType.compensationClaim){
            if(validClaims){
                System.out.println("There has been an error in the system. Please, make another claim in the future.");
            }else{
                System.out.println("Unfortunately your compensation claim is not valid. Please make sure to provide valid compensation claims in the future.");
            }
        }else{
            super.handle(message);
        }
    }

    public void setValidClaimsTrue(){
        validClaims = false;
    }

    public void setValidClaimsFalse(){
        validClaims = false;
    }
}
