package ObserverPattern.WeatherStation.Observables;

import ObserverPattern.WeatherStation.Observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class WSObservable implements Observable {

    List<Observer> observers = new ArrayList<>();
    int temp = 0;

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyStations() {
        for (Observer observer: observers) {
            observer.update();
        }
    }

    @Override
    public int getTemp() {
        return temp;
    }

    @Override
    public void setTemp(int newTemp) {
        if(temp != newTemp) {
            temp = newTemp;
            notifyStations();
        }
    }
}
