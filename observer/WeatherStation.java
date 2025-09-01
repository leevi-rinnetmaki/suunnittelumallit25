package observer;

import java.util.ArrayList;

public class WeatherStation implements WeatherStationInterface, Runnable {

    int temperature;
    int maxTemperature;
    int minTemperature;
    boolean keepMeasuring = false;

    ArrayList<WeatherObserver> observers = new ArrayList<>();

    public WeatherStation() {
        this.temperature = (int)(Math.random()*61)-30;
        this.maxTemperature = 30;
        this.minTemperature = -30;
    }

    @Override
    public void addObserver(WeatherObserver observer) {
        observers.add(observer);    
    }

    @Override
    public void removeObserver(WeatherObserver observer){
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(int temperature){
        for (WeatherObserver observer : observers){
            observer.update(temperature);
        }
    }

    @Override
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public void run() {
        keepMeasuring = true;
        while(keepMeasuring){
            double rand = Math.random();
            if(rand>=0.9){
                if(temperature < maxTemperature){
                    temperature++;
                    notifyObservers(temperature);

                }
            }else if(rand>=0.8){
                if(temperature > minTemperature){
                    temperature--;
                    notifyObservers(temperature);

                }
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Measurement interrupted");
                break;
            }
        }
    }

    @Override
    public void stopMeasuring() {
        keepMeasuring = false;
    }
}
