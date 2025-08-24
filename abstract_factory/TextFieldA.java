package abstract_factory;

public class TextFieldA extends TextField {
    @Override
    void display(String text) {
        System.out.println(text+":\n------------\n|          |\n|          |\n------------\n");
    }
}
