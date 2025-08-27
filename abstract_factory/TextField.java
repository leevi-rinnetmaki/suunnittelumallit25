package abstract_factory;

public abstract class TextField {
    String text;

    abstract void display();

    void setText(String text){
        this.text = text;
    }
}
