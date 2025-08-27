package abstract_factory;

public abstract class Button {
    String text;

    abstract void display();

    void setText(String text){
        this.text = text;
    }
}
