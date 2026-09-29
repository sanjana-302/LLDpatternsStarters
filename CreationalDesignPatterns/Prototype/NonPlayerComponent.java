package CreationalDesignPatterns.Prototype;

public class NonPlayerComponent implements Cloneable{
    int valueFromDB;
    int valueFromHeavyCalc;
    String name;
    String gender;
    String color;

    public NonPlayerComponent(String name,String gender,String color){
        this.name = name;
        this.gender = gender;
        this.color = color;
        // do this to portray Prototype pattern
        try {
            // Pause execution for 2000 milliseconds (2 seconds)
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("The sleep was interrupted!");
        }
        valueFromDB = 2;
        valueFromHeavyCalc = 2;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public void setColor(String color){
        this.color = color;
    }

    @Override 
    public NonPlayerComponent clone() throws CloneNotSupportedException {
        return (NonPlayerComponent) super.clone(); // Shallow copy of the character object
    }
}
