package BehavioralDesignPattern.VisitorDesignPattern;

public abstract class IDocument {
    String name;
    String size;
    public IDocument(String name, String size){
        this.name = name;
        this.size = size;
    }
    // Because your collection is typed as List<IDocument>, 
    // the compiler only looks at the IDocument reference type during compilation. 
    // Since IDocument doesn't declare an accept(IVisitor v) method, 
    // the compiler blocks you from calling it, even though the underlying objects (Text, Image, Video) actually have it.
    public abstract void accept(IVisitor v);
}
