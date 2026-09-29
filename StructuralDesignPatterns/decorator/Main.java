package StructuralDesignPatterns.decorator;

public class Main {

    // The idea to make decorators inherit on top of implementations 
    // is to just reduce boiler code
    // whatever you have done is also right
    public static void main(String[] args) {
        // Mario normieMario = new Mario(10, 10);
        // Mario quickmario = new MarioWithHighSpeed(10, 10);
        // normieMario.getMarioSpeed();
        // quickmario.getMarioSpeed();

        IMario m = new Mario();
        System.out.printf("******** Normal Mario does this all!! *******");
        m.getAction();
        System.out.printf("\nScore now is : " + m.getScoreMultiplier());
        IMario supeMario = new SuperMarioDecorator(m);
        System.out.printf("\n******* Super Mario does this all!! ***********");
        supeMario.getAction();
        System.out.printf("Score now is : " + supeMario.getScoreMultiplier());
        System.out.printf("\n******* Minimizer Mario does this all!! ***********");
        IMario minMario = new MimimizerDecorator(supeMario);
        minMario.getAction();
        System.out.printf("Score now is : " + minMario.getScoreMultiplier());

    }
    
}
