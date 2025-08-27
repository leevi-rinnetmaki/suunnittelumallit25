package abstract_factory;

public class ButtonB extends Button {
    @Override
    void display() {
        System.out.println("\n------------\n{"+text+"}\n------------\n");
    }
}
