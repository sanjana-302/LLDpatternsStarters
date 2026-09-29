package BehavioralDesignPattern.chainOfResponsibility.atmVendingMachine;

public class Hundred extends IDenomination{
    int count = 10;
    int val = 100;

    @Override 
    public void vendMoney(int money){
        int cnt = money/val;
        // logic is wrong but responsibility is passing correctly
        if(cnt<=count){
            System.out.printf("Give {} notes to vend {}",cnt,money);
            count = count - cnt;
        }else{
            n.vendMoney(money - (cnt*100));
        }

    }

}
