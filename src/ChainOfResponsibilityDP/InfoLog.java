package ChainOfResponsibilityDP;

public class InfoLog extends logLevel{
    InfoLog(logLevel nextLogger){
        super(nextLogger);
    }

    public void log(int logLevel, String message){
        if(logLevel == INFO){
            System.out.println("INFO: "+message);
        }else{
            super.log(logLevel,message);
        }
    }
}
