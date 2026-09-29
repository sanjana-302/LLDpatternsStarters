package BehavioralDesignPattern.mementoPattern;

public class main {

    public static void main(String[] args) {
        // momento design pattern esentialy captures state of objects 
        // learn how to use queue and dequeue in java 
        Database o = new Database();
        o.addEntry("Sanjana","Best student");
        o.showCurrentDb();
        o.addEntry("Sujal", "2nd best student");
        o.showCurrentDb();
        o.addEntry("Aneesh", "OG");
        o.showCurrentDb();
        System.out.println("Undo now!!");
        o.undo();
        o.showCurrentDb();
        System.out.println("Undo now!!");
        o.undo();
        o.showCurrentDb();
    }
    
}
