package StructuralDesignPatterns.decorator;

public class MimimizerDecorator implements IMario{

    IMario mario;

    public MimimizerDecorator(IMario m){
        mario = m;
    }

    @Override
    public void getAction() {
        mario.getAction();
        System.out.printf("\nMade you walk slow now!!\n");
    }

    @Override
    public int getScoreMultiplier() {
        return mario.getScoreMultiplier()*-1;
    }
    
}
