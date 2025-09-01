package observer;

public interface WeatherStationInterface {

    public void addObserver(WeatherObserver observer);

    public void removeObserver(WeatherObserver observer);

    public void notifyObservers(int temperature);

    public void setTemperature(int temperature);

    //public void measureTemperature();

    public void stopMeasuring();
}
