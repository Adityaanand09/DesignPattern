package ChainOfResponsibilityDP;

public class main {

    public static void main(String args[]) {
        logLevel logger = new InfoLog(new DebugLog(new Error(null)));
        logger.log(logLevel.ERROR,"error log");
    }
}
