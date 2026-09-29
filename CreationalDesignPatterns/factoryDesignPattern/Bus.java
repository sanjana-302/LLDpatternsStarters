package CreationalDesignPatterns.factoryDesignPattern;

public class Bus implements Vehicle{

    @Override
    public void start() {
        System.out.printf("{} is starting",this.getClass().getSimpleName());
    }

    @Override
    public void stop() {
        System.out.printf("{} is stopped",this.getClass().getSimpleName());
    }
    
}
