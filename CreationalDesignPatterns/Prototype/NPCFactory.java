package CreationalDesignPatterns.Prototype;

public class NPCFactory {
    NonPlayerComponent n;

    public NonPlayerComponent createNonPlayerComponent(String name,String gender,String color){
        n = new NonPlayerComponent(name,gender,color);
        return n;
    }

    public NonPlayerComponent alterNameOnly(String name) throws CloneNotSupportedException{
        NonPlayerComponent clone = n.clone();
        clone.setName(name);
        return clone;
    }

    public NonPlayerComponent alterGenderOnly(String gender) throws CloneNotSupportedException{
        NonPlayerComponent clone = n.clone();
        clone.setGender(gender);
        return clone;
    }

    public NonPlayerComponent alterColorOnly(String color) throws CloneNotSupportedException{
        NonPlayerComponent clone = n.clone();
        clone.setColor(color);
        return clone;
    }
}
