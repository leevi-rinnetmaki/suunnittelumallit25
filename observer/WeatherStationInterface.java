package observer;

import java.util.ArrayList;

public interface WeatherStationInterface {

    ArrayList<WeatherObserver> observers = new ArrayList<>();

    public void addObserver(WeatherObserver observer);

    public void removeObserver(WeatherObserver observer);

    public void notifyObservers(int temperature);

    public void setTemperature(int temperature);

    //public void measureTemperature();

    public void stopMeasuring();
}
