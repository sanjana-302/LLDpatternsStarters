package BehavioralDesignPattern.chainOfResponsibility.atmVendingMachine;

public class atmVendingProcessor {

    public void dispenseMoney(){
        IDenomination hundred = new Hundred();
        IDenomination fifty = new Fifty();
        hundred.setNextDenomination(fifty);
        System.out.print(hundred);
        int amountToVend = 150;
        hundred.vendMoney(amountToVend);
    }
}