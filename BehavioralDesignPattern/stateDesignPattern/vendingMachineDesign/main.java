package BehavioralDesignPattern.stateDesignPattern.vendingMachineDesign;

public class main {
    public static void main(String[] args) {
        // a list of state 
        // a list of methods that can be applied on these states
        // the output is always supposed to be again these states
        // eg - vending machine 

        VendingMachineContext vc = new VendingMachineContext(new NoCoinState());
        System.out.println("product count is : " + vc.getProductCount());
        vc.insertCoin();
        vc.selectItem();
        vc.dispense();
        System.out.println("product count is : " + vc.getProductCount());

    }
}
