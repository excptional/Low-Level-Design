package ObserverPattern.WeatherStation;

import ObserverPattern.WeatherStation.Observables.Observable;
import ObserverPattern.WeatherStation.Observables.WSObservable;
import ObserverPattern.WeatherStation.Observers.MobileObserver;
import ObserverPattern.WeatherStation.Observers.TVObserver;
import ObserverPattern.WeatherStation.Observers.Observer;

public class Main {

    public static void main(String[] args) {

        Observable observable = new WSObservable();

        Observer observer1 = new MobileObserver(observable);
        Observer observer2 = new TVObserver(observable);
        Observer observer3 = new MobileObserver(observable);

        observable.register(observer1);
        observable.register(observer2);
        observable.register(observer3);

        observable.setTemp(45);
        observable.setTemp(18);
        observable.setTemp(18);

    }

}
