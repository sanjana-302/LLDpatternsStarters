package CreationalDesignPatterns.abstractFactory;

public class WindowsFactory implements GuiFactory{

    @Override
    public void createButton() {
        System.out.printf("Creating windows button!!");
    }

    @Override
    public void createWindow() {
        System.out.printf("Creating windows window pan!!");
    }
    
}
