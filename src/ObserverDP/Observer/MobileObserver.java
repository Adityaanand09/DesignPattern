package ObserverDP.Observer;

import ObserverDP.Observable.IObservable;

public class MobileObserver implements IObserver{
    String mobileNumber;
    String name;

    IObservable observable;
    public MobileObserver(String phNo, String userName, IObservable observable){
        this.mobileNumber = phNo;
        this.name = userName;
        this.observable =observable;
    }
    @Override
    public void update() {
        sendMessage();
    }

    public void sendMessage(){
        System.out.println("Send message to "+name+" at mobile number "+mobileNumber);
        System.out.println("sendNotification called by thread: " + Thread.currentThread().getName());
    }
}
