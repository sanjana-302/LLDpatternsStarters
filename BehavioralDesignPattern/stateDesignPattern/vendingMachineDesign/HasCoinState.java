package BehavioralDesignPattern.stateDesignPattern.vendingMachineDesign;

public class HasCoinState implements VendingMachineState{

    @Override
    public VendingMachineState insertCoin(VendingMachineContext v) {
        return this;
    }

    @Override
    public VendingMachineState selectItem(VendingMachineContext v) {
        System.out.println("Changing to dispense state");
        return new Dispense();
    }

    @Override
    public VendingMachineState dispense(VendingMachineContext v) {
        return this;
    }

    @Override
    public VendingMachineState returnCoin(VendingMachineContext v) {
        return new NoCoinState();
    }

    @Override
    public VendingMachineState refill(VendingMachineContext v) {
        return this;
    }
    
}
