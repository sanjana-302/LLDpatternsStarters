package BehavioralDesignPattern.VisitorDesignPattern;

public class Image extends IDocument{
    public Image(String name, String size) {
            super(name, size);
            //TODO Auto-generated constructor stub
        }
    
        public void accept(IVisitor v){
        v.applyToFile(this);
    };
}
