package CreationalDesignPatterns.abstractFactory;

public class Main {
    public static void main(String[] args) {
        // Factory design patttern deals with focusing on creating same type of objects
        // Abstract factory deals with creating multiple type of objects from same family
        // Esentially, in factory we create a single product -> create vehicle
        // But in, Abstract we create a group of related products 

        GuiFactory window = new WindowsFactory();
        window.createButton();
        window.createWindow();
        GuiFactory mac = new MacFactory();
        mac.createButton();
        mac.createWindow();
    }
}
