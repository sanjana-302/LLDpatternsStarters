package BehavioralDesignPattern.VisitorDesignPattern;

public class EmailVisitor implements IVisitor{

    @Override
    public void applyToFile(Image i) {
        System.out.println("Sending image as email!");
    }

    @Override
    public void applyToFile(Video v) {
        System.out.println("Sending video as email!");
    }

    @Override
    public void applyToFile(Text t) {
        System.out.println("Sending text as email!");
    }
    
}
