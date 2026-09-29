package BehavioralDesignPattern.VisitorDesignPattern;

public class CompressVisitor implements IVisitor{

    @Override
    public void applyToFile(Image i) {
        System.out.println("Applying compression to image!");
    }

    @Override
    public void applyToFile(Video v) {
        System.out.println("Applying compression to video!");
    }

    @Override
    public void applyToFile(Text t) {
        System.out.println("Applying compression to file!");
    }
    
}
