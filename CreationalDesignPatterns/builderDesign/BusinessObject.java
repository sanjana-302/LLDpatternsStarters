package CreationalDesignPatterns.builderDesign;

// Important things to learn here 
// Static and Non Static class behaviour in Java
public class BusinessObject {

    private final int prop1; // required
    private final int prop2; // required
    private final int prop3; // optional
    private final int prop4; // optional
    private final int prop5; // optional

    private BusinessObject(Builder b){
        this.prop1 = b.prop1;
        this.prop2 = b.prop2;
        this.prop3 = b.prop3;
        this.prop4 = b.prop4;
        this.prop5 = b.prop5;
    }

    @Override 
    public String toString(){
        return "["+"prop1 "+prop1+":"+"prop2 "+prop2+":"+"prop3 "+prop3+":"+"prop4 "+prop4+":"+"prop5 "+prop5+"]";
    }

    public static class Builder {

        private final int prop1; // required
        private final int prop2; // required

        private int prop3 = 0; // optional
        private int prop4 = 0; // optional
        private int prop5 = 0; // optional

        Builder(int p1,int p2){
            this.prop1 = p1;
            this.prop2 = p2;
        }

        Builder setProp3(int p3){
            this.prop3 = p3;
            return this;
        }

        Builder setProp4(int p4){
            this.prop4 = p4;
            return this;
        }

        Builder setProp5(int p5){
            this.prop5 = p5;
            return this;
        }

        BusinessObject build(){
            return new BusinessObject(this);
        }
    }
}
