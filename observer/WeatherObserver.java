package observer;

public class WeatherObserver implements WeatherObserverInterface {

    String uniqueMessage;

    public WeatherObserver(String uniqueMessage) {
        // uniqueMessage should contain a %s where temperature will be inserted
        this.uniqueMessage = uniqueMessage;
    }

    @Override
    public void update(int temperature) {
        // Insert temperature at the placeholder position
        System.out.println(String.format(uniqueMessage, temperature));
    }
}
