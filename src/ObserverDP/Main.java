package ObserverDP;

import ObserverDP.Observable.IObservable;
import ObserverDP.Observable.IphoneObservable;
import ObserverDP.Observer.IObserver;
import ObserverDP.Observer.MobileObserver;

import java.util.concurrent.*;

public class Main {
    public static void main(String args[]) throws InterruptedException {
        IObservable iphoneObservable = new IphoneObservable();

        IObserver user1 = new MobileObserver("8953917060","Aditya",iphoneObservable);
        IObserver user2 = new MobileObserver("7571818181","Ayush",iphoneObservable);
        iphoneObservable.add(user1);
        Thread.sleep(5000);
        iphoneObservable.add(user2);

        Thread.sleep(15 * 60 * 1000);

    }
}
