package StructuralDesignPatterns.Bridge;

public class Pixelated implements Render {

    @Override
    public void drawCircle() {
        System.out.print("From pixelated draw circle!");
    }

    @Override
    public void drawRectangle() {
        // TODO Auto-generated method stub
        System.out.print("From pixelated draw rectangle!");
    }
    
}
