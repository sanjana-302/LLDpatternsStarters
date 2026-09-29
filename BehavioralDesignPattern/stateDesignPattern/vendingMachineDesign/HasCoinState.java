package BehavioralDesignPattern.stateDesignPattern.vendingMachineDesign;

public class HasCoinState implements VendingMachineState{

    @Override
    public VendingMachineState insertCoin() {
        return this;
    }

    @Override
    public VendingMachineState selectItem() {
        return new Dispense();
    }

    @Override
    public VendingMachineState dispense() {
        return this;
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
