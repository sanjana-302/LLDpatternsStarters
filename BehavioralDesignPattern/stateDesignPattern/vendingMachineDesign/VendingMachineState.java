package BehavioralDesignPattern.stateDesignPattern.vendingMachineDesign;

public interface VendingMachineState {
    public VendingMachineState insertCoin(VendingMachineContext v);
    public VendingMachineState selectItem(VendingMachineContext v);
    public VendingMachineState dispense(VendingMachineContext v);
    public VendingMachineState returnCoin(VendingMachineContext v);
    public VendingMachineState refill(VendingMachineContext v);
}
