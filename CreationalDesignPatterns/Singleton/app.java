package CreationalDesignPatterns.Singleton;

public class app {
    public static void main(String[] args) {
        LoggerClass log = new LoggerClass();
        log.log("from app class!");

        processOne p1 = new processOne();
        processTwo p2 = new processTwo();

        p1.call();
        p2.call();
    }
}
