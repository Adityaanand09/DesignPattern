package ChainOfResponsibilityDP;

import java.util.HashMap;
import java.util.Map;

public abstract class logLevel {
    public static int INFO=1;
    public static int DEBUG=2;
    public static int ERROR=3;
    logLevel nextLogger;
    logLevel(logLevel nextLogger){
        Map<Integer, String > map = new HashMap<>();
        this.nextLogger = nextLogger;
    }

    public void log(int logLevel,  String message){
        if(nextLogger !=null){
            nextLogger.log(logLevel,message);
        }
    }
}


