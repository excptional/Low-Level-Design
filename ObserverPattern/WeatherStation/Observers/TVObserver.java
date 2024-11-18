package ObserverPattern.WeatherStation.Observers;

import ObserverPattern.WeatherStation.Observables.Observable;
import ObserverPattern.WeatherStation.Observables.WSObservable;

public class TVObserver implements Observer {

    Observable observable;

    public TVObserver(Observable observable) {
        this.observable = observable;
    }

    @Override
    public void update() {
        int temp = observable.getTemp();
        System.out.println("TV -> Temp is " + temp);
    }
}
