package ChainOfResponsibilityDP;

public class DebugLog extends logLevel{
    DebugLog(logLevel nextLogger){
        super(nextLogger);
    }

    public void log(int logLevel, String message){
        if(logLevel == DEBUG){
            System.out.println("DEBUG: "+message);
        }else{
            super.log(logLevel,message);
        }
    }
}
