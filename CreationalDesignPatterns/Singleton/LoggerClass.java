package CreationalDesignPatterns.Singleton;

public class LoggerClass implements Log{

    @Override 
    public void log(String s){
        System.out.println("Log : " + s);
    }
}