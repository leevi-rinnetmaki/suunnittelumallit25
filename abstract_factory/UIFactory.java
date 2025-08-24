package abstract_factory;

public abstract class UIFactory {
    public abstract Button createButton();
    public abstract TextField createTextField();
    public abstract Checkbox createCheckbox();
}