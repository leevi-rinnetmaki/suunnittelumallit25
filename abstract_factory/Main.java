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

        buttonA.setText("Eka button");
        buttonB.setText("Toka button");

        buttonA.display();
        buttonB.display();

        textFieldA.setText("Eka text field");
        textFieldB.setText("Toka text field");

        textFieldA.display();
        textFieldB.display();

        checkboxA.setText("Eka checkbox");
        checkboxB.setText("Toka checkbox");

        checkboxA.display();
        checkboxB.display();

    }
}
