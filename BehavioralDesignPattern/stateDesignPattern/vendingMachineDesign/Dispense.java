package BehavioralDesignPattern.stateDesignPattern.vendingMachineDesign;

public class Dispense implements VendingMachineState{
    
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
        if(v.getProductCount()>0){
            v.setProductCount(v.getProductCount()-1);
            System.out.println("Changing to initial out");
            return new NoCoinState();
        }
        System.out.println("Changing to sold out");
        return new SoldOutState();
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
