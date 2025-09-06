package chain_of_responsibility;
import chain_of_responsibility.Message.enumType;

public class Main {
    public static void main(String[] args) {
        Handler compensationClaim = new CompensationClaim();
        Handler contactRequest = new ContactRequest();
        Handler developmentSuggestion = new DevelopmentSuggestion();
        Handler generalFeedback = new GeneralFeedback();

        compensationClaim.setNextHandler(contactRequest);
        contactRequest.setNextHandler(developmentSuggestion);
        developmentSuggestion.setNextHandler(generalFeedback);

        Handler handler = compensationClaim;



        Message brokenLeg = new Message(enumType.compensationClaim, "I broke my sixth spinal disk, because of your company. I demand compensation.", "Jean-Luc", 200);
        Message hireYou = new Message(enumType.contactRequest, "I would like a nice massage.", "Geordi");
        Message haveFun = new Message(enumType.contactRequest, "Want to meet and have some fun.", "Jenny");
        Message acupuncture = new Message(enumType.developmentSuggestion, "Acupuncture is great. You should offer it as a service!", "O'Brien");
        Message hadFun = new Message(enumType.generalFeedback, "It was ok.", "Kirk");

        handler.handle(brokenLeg);
        handler.handle(hireYou);
        handler.handle(haveFun);
        handler.handle(acupuncture);
        handler.handle(hadFun);

    }
}