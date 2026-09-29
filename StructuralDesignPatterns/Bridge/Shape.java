package StructuralDesignPatterns.Bridge;

public abstract class Shape {
    public Render r;
    public Shape(Render r){
        this.r = r;
    }
    public abstract void draw();
}
