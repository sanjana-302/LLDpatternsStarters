package CreationalDesignPatterns.abstractFactory;

public class MacFactory implements GuiFactory{

    @Override
    public void createButton() {
        System.out.printf("Creating mac button!!");
    }

    @Override
    public void createWindow() {
        System.out.printf("Creating mac's window pan!!");
    }
    
}
