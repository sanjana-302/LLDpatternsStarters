package StructuralDesignPatterns.Bridge;

public class Rectangle extends Shape{
    public int len;
    public int width;

    public Rectangle(Render r,int len,int width) {
            super(r);
            this.len = len;
            this.width = width;
    }
    
    @Override
    public void draw() {
        r.drawRectangle();
    }
    
}
