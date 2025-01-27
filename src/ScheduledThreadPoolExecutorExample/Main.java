package ScheduledThreadPoolExecutorExample;

import java.util.concurrent.*;

public class Main {
    public static void main(String args[]){
        ScheduledExecutorService sc = Executors.newScheduledThreadPool(5);

        sc.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("call alert function");
            }
        },5, 5, TimeUnit.SECONDS);
    }
}
