package StructuralDesignPatterns.decorator;

public class Mario implements IMario{

    @Override
    public void getAction() {
        System.out.printf("\nRunning normally!");
    }

    @Override
    public int getScoreMultiplier() {
        return 1;
    }
}
