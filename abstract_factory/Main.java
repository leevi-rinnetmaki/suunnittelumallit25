package abstract_factory;

public class Main {
    public static void main(String[] args) {
        UIFactory AFactory = new AFactory();
        UIFactory BFactory = new BFactory();

        Button buttonA = AFactory.createButton();
        Button buttonB = BFactory.createButton();

        TextField textFieldA = AFactory.createTextField();
        TextField textFieldB = BFactory.createTextField();

        Checkbox checkboxA = AFactory.createCheckbox();
        Checkbox checkboxB = BFactory.createCheckbox();

        buttonA.display("Hello, motitotrsad");
        buttonB.display("Hello, motitotrsad");

        textFieldA.display("Hello, motitotrsad");
        textFieldB.display("Hello, motitotrsad");

        checkboxA.display("Hello, motitotrsad");
        checkboxB.display("Hello, motitotrsad");

    }
}
