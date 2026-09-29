package CreationalDesignPatterns.Singleton;

public class LoggerClassSingleInstance implements Log{

    private static LoggerClassSingleInstance appInstance;

    private LoggerClassSingleInstance(){}; // private constructor that cannot be invoked outside of class

    public static LoggerClassSingleInstance getLogger(){
        if(appInstance==null){
            appInstance = new LoggerClassSingleInstance();
        }
        return appInstance;
    }

    @Override 
    public void log(String s){
        System.out.println("Log : " + s);
    }
}