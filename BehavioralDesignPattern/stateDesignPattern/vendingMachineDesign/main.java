package BehavioralDesignPattern.stateDesignPattern.vendingMachineDesign;

public class main {
    public static void main(String[] args) {
        // a list of state 
        // a list of methods that can be applied on these states
        // the output is always supposed to be again these states
        // eg - vending machine 

        // In high-performance systems or resource-constrained environments, 
        // creating new state instances on every single user click creates unnecessary garbage collection overhead.

        // The Pro-Tip: Since these states are usually stateless 
        // (they don't hold unique data for individual items), 
        // you can pre-initialize them as static final instances or singletons inside the Context or a State Factory, 
        // and simply return references to them!

        VendingMachineContext vc = new VendingMachineContext(new NoCoinState());
        System.out.println("product count is : " + vc.getProductCount());
        vc.insertCoin();
        vc.selectItem();
        vc.dispense();
        System.out.println("product count is : " + vc.getProductCount());

    }
}
