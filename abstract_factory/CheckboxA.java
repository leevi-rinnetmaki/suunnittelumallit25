package abstract_factory;

public class CheckboxA extends Checkbox {
    @Override
    void display() {
        System.out.println("\n"+text+": [x]\n");
    }
}
