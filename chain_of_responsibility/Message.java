package chain_of_responsibility;

public class Message {
    enum enumType{
        compensationClaim,
        contactRequest,
        developmentSuggestion,
        generalFeedback
    }
    enumType type;
    String message;
    String senderEmail;
    int amount;

    public Message(enumType type, String message, String senderEmail){
        this.type = type;
        this.message = message;
        this.senderEmail = senderEmail;
    }

        public Message(enumType type, String message, String senderEmail, int amount){
        this.type = type;
        this.message = message;
        this.senderEmail = senderEmail;
        this.amount = amount;
    }

    public enumType getType(){
        return this.type;
    }
}
