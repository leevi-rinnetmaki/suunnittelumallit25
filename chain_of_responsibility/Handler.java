package chain_of_responsibility;

public abstract class Handler {

    Handler nextHandler;
    public void handle(Message message){
        if(nextHandler != null){
            nextHandler.handle(message);
        }
    }

    public void setNextHandler(Handler nextHandler){
        this.nextHandler = nextHandler;
    }
}
