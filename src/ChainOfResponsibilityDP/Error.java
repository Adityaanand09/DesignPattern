package ChainOfResponsibilityDP;

public class Error extends logLevel {
    Error(logLevel nextLogger){
        super(nextLogger);
    }

    public void log(int logLevel, String message){
        if(logLevel == ERROR){
            System.out.println("ERROR: "+message);
        }else{
            System.out.println("WRONG LEVEL");
        }
    }
}
