package BehavioralDesignPattern.VisitorDesignPattern;

public interface IVisitor {

    public void applyToFile(Image i);
    public void applyToFile(Video v);
    public void applyToFile(Text t);
    
}
