package abstract_factory;

public abstract class Checkbox {
    String text;

    abstract void display();

    void setText(String text){
        this.text = text;
    }
}
