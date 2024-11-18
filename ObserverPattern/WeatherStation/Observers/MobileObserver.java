package ObserverPattern.WeatherStation.Observers;

import ObserverPattern.WeatherStation.Observables.Observable;
import ObserverPattern.WeatherStation.Observables.WSObservable;

public class MobileObserver implements Observer {

    Observable observable;

    public MobileObserver(Observable observable) {
        this.observable = observable;
    }

    @Override
    public void update() {
        int temp = observable.getTemp();
        System.out.println("Mobile -> Temp is " + temp);
    }
}
