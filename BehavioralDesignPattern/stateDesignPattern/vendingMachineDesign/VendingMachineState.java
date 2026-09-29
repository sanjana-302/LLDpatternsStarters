package BehavioralDesignPattern.stateDesignPattern.vendingMachineDesign;

public interface VendingMachineState {
    public VendingMachineState insertCoin();
    public VendingMachineState selectItem();
    public VendingMachineState dispense();
    public VendingMachineState returnCoin();
    public VendingMachineState refill();
}
