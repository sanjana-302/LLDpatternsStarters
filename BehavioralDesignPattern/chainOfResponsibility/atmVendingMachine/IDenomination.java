package BehavioralDesignPattern.chainOfResponsibility.atmVendingMachine;

abstract class IDenomination {
    protected  IDenomination n;
    public abstract void vendMoney(int money);
    public void setNextDenomination(IDenomination next){
        this.n = next;
    };
    
}