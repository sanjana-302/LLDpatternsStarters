package BehavioralDesignPattern.VisitorDesignPattern;

public class Video extends IDocument{
    public Video(String name, String size) {
            super(name, size);
            //TODO Auto-generated constructor stub
        }
    
        public void accept(IVisitor v){
        v.applyToFile(this);
    };
}
