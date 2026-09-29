package BehavioralDesignPattern.VisitorDesignPattern;

public class Text extends IDocument{
    
    public Text(String name, String size) {
            super(name, size);
            //TODO Auto-generated constructor stub
    }
    
        public void accept(IVisitor v){
        v.applyToFile(this);
    };
}
