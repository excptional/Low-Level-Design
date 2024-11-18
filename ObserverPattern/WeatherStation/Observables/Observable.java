package ObserverPattern.WeatherStation.Observables;

import ObserverPattern.WeatherStation.Observers.Observer;

public interface Observable {

    void register(Observer observer);
    void remove(Observer observer);
    void notifyStations();
    int getTemp();
    void setTemp(int newTemp);

}
