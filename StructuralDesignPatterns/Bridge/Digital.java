package StructuralDesignPatterns.Bridge;

public class Digital implements Render{

    @Override
    public void drawRectangle() {
        System.out.print("From digital draw rectangle!");
    }

    @Override
    public void drawCircle() {
        System.out.print("From digital draw circle!");
    }
    
}
