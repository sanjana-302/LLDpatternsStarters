package CreationalDesignPatterns.Singleton;

public class processTwo {
    // uncomment to see multiple instances being created
    // LoggerClass log;

    Log log;

    public processTwo(){
        // uncomment to see multiple instances being created
        // log = new LoggerClass(); 
        // log = LoggerClassSingleInstance.getLogger();
        log = LoggerClassThreadSafe.getLogger();

    }
    public void call(){
        log.log("From process two with logger address at - " + log);
    }
}