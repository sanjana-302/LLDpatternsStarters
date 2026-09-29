package BehavioralDesignPattern.stateDesignPattern.vendingMachineDesign;

public class Dispense implements VendingMachineState{

    Boolean noItems;
    
    @Override
    public VendingMachineState insertCoin() {
        return this;
    }

    @Override
    public VendingMachineState selectItem() {
        return this;
    }

    @Override
    public VendingMachineState dispense() {
        if(noItems) return new SoldOutState();
        return new NoCoinState();
    }

    @Override
    public VendingMachineState returnCoin() {
        return new NoCoinState();
    }

    @Override
    public VendingMachineState refill() {
        return this;
    }
    
}
