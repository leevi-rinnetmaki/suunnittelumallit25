package abstract_factory;

public class ButtonA extends Button {
    @Override
    void display() {
        System.out.println("\n------------\n["+text+"]\n------------\n");
    }
}
