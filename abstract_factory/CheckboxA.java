package abstract_factory;

public class CheckboxA extends Checkbox {
    @Override
    void display(String text) {
        System.out.println("\n"+text+": [x]\n");
    }
}
