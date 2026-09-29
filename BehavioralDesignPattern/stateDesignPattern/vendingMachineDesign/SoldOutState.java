package BehavioralDesignPattern.stateDesignPattern.vendingMachineDesign;

public class SoldOutState implements VendingMachineState{

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
        return this;
    }

    @Override
    public VendingMachineState returnCoin() {
        return this;
    }

    @Override
    public VendingMachineState refill() {
        return new NoCoinState();
    }
    
}
