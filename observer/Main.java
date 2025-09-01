package observer;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        WeatherObserver observer1 = new WeatherObserver("Observer 1: Current temperature is %s degrees.");
        WeatherObserver observer2 = new WeatherObserver("Observer 2: Temperature updated to %s degrees.");

        weatherStation.addObserver(observer1);
        weatherStation.addObserver(observer2);

        Thread t = new Thread(weatherStation);
        t.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        weatherStation.removeObserver(observer2);

        
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        weatherStation.stopMeasuring();
    }
}
