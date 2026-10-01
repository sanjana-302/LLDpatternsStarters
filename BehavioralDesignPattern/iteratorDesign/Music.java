package BehavioralDesignPattern.iteratorDesign;

public class Music extends Iterable{

    private String name;

    public Music(Iterator i) {
        super(i);
    }

    public void setName(String name){
        this.name = name;
    }

    public void getName(String name){
        this.name = name;
    }
    
    @Override
    public boolean equals(Object obj) {
        // 1. Check if both references point to the exact same object
        if (this == obj) return true;
        
        // 2. Check if the object is null or of a different class
        if (obj == null || getClass() != obj.getClass()) return false;
        
        // 3. Cast and compare the 'name' field
        Music music = (Music) obj;
        return java.util.Objects.equals(name, music.name);
    }

    @Override
    public int hashCode() {
        // Generate a hash code based on the 'name' field
        return java.util.Objects.hash(name);
    }
    
}
