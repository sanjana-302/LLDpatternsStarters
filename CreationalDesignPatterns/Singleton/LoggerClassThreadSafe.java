package CreationalDesignPatterns.Singleton;

public class LoggerClassThreadSafe implements Log{
    private static LoggerClassThreadSafe appInstance;

    private LoggerClassThreadSafe(){}; // private constructor that cannot be invoked outside of class

    public static LoggerClassThreadSafe getLogger(){
        if(appInstance==null){
            synchronized(LoggerClassThreadSafe.class){
                if(appInstance==null){
                    appInstance = new LoggerClassThreadSafe();
                }
            }
        }
        return appInstance;
    }
    @Override 
    public void log(String s){
        System.out.println("Log : " + s);
    }
}