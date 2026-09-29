package StructuralDesignPatterns.decorator;

public class SuperMarioDecorator implements IMario{

    IMario mario;

    public SuperMarioDecorator(IMario m){
        mario = m;
    }

    @Override
    public void getAction() {
        mario.getAction();
        System.out.printf("\nAdded more action of jumping!\n");
    }

    @Override
    public int getScoreMultiplier() {
        return mario.getScoreMultiplier()*100;
    }
    
}
