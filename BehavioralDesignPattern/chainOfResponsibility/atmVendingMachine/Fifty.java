package BehavioralDesignPattern.chainOfResponsibility.atmVendingMachine;

public class Fifty extends IDenomination{
    int count = 15;
    int val = 50;

    @Override 
    public void vendMoney(int money){
        int cnt = money/val;

        if(count<=cnt){
            System.out.printf("Give {} notes to vend {}",cnt,money);
        }else{
            System.out.printf("Money Cannot be dispensed");
        }

    }
}
