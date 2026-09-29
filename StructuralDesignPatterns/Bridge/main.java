package StructuralDesignPatterns.Bridge;

// If you are swapping out how a job is done (different ways to sort, different ways to pay, 
// different ways to route a map). That's Strategy.
// If you are structuring your code to connect two independent class hierarchies 
// so they can scale separately without creating a messy web of subclasses. That's Bridge.

public class main {
    public static void main(String[] args) {
        Render pix = new Pixelated();
        Render dig = new Digital();
        Shape circle = new Circle(pix, 7);
        Shape rectangle = new Rectangle(dig, 10, 5);
        circle.draw();
        System.out.print("\n");
        rectangle.draw();
    }
}
