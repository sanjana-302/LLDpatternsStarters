package BehavioralDesignPattern.stateDesignPattern.vendingMachineDesign;

public class NoCoinState implements VendingMachineState{

    @Override
    public VendingMachineState insertCoin() {
        return new HasCoinState();
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
        return this;
    }
    
}
