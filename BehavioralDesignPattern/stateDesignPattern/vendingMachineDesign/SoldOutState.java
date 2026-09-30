package BehavioralDesignPattern.stateDesignPattern.vendingMachineDesign;

public class SoldOutState implements VendingMachineState{

    @Override
    public VendingMachineState insertCoin(VendingMachineContext v) {
        return this;
    }

    @Override
    public VendingMachineState selectItem(VendingMachineContext v) {
        return this;
    }

    @Override
    public VendingMachineState dispense(VendingMachineContext v) {
        return this;
    }

    @Override
    public VendingMachineState returnCoin(VendingMachineContext v) {
        return this;
    }

    @Override
    public VendingMachineState refill(VendingMachineContext v) {
        return new NoCoinState();
    }
    
}
