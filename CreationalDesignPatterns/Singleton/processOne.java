package CreationalDesignPatterns.Singleton;

public class processOne {
    // uncomment to see multiple instances being created
    // LoggerClass log;

    Log log;

    public processOne(){
        // uncomment to see multiple instances being created
        // log = new LoggerClass(); 
        // log = LoggerClassSingleInstance.getLogger();
        log = LoggerClassThreadSafe.getLogger();

    }
    public void call(){
        log.log("From process one with logger address at - " + log);
    }
}