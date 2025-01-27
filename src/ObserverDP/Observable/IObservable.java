package ObserverDP.Observable;

import ObserverDP.Observer.IObserver;

public interface IObservable {
    void add(IObserver observer);
    void remove(IObserver observer);
    void sendNotification();
}
