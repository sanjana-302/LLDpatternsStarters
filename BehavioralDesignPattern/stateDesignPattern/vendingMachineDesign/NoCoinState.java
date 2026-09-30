package BehavioralDesignPattern.stateDesignPattern.vendingMachineDesign;

public class NoCoinState implements VendingMachineState{

    @Override
    public VendingMachineState insertCoin(VendingMachineContext v) {
        System.out.println("Changing to Has coin State");
        return new HasCoinState();
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
        return this;
    }
    
}
