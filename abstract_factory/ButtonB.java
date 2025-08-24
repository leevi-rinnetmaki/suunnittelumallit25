package abstract_factory;

public class ButtonB extends Button {
    @Override
    void display(String text) {
        System.out.println("\n------------\n{"+text+"}\n------------\n");
    }
}
