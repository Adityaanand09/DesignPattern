package ObserverDP.Observable;

import ObserverDP.Observer.IObserver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class IphoneObservable implements IObservable{
    List<IObserver> observers;
    ScheduledExecutorService sc = Executors.newScheduledThreadPool(10);
    Map<IObserver, ScheduledFuture<?>>mp = new HashMap<>();
    public IphoneObservable(){
        observers = new ArrayList<>();
    }
    /**
     * @param observer
     */
    @Override
    public void add(IObserver observer) {
        observers.add(observer);
        ScheduledFuture<?> x = sc.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                observer.update();
            }
        }, 5, 10, TimeUnit.SECONDS);
        mp.put(observer,x);
    }

    /**
     * @param observer
     */
    @Override
    public void remove(IObserver observer) {
        observers.remove(observer);
    }

    /**
     *
     */
    @Override
    public void sendNotification() {
        for(IObserver observer:observers){
            observer.update();
        }
    }
}
