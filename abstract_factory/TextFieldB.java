package abstract_factory;

public class TextFieldB extends TextField {
    @Override
    void display() {
        System.out.println(text+":\n------------------------\n|                      |\n|                      |\n------------------------\n");
    }
}
