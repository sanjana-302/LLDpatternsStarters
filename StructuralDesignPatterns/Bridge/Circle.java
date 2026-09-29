package StructuralDesignPatterns.Bridge;

public class Circle extends Shape{

    int radius;

    public Circle(Render r,int radius) {
            super(r);
            this.radius = radius;
    }
    
    @Override
    public void draw() {
        r.drawCircle();
    }
    
}
