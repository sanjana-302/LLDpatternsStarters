package BehavioralDesignPattern.stateDesignPattern.vendingMachineDesign;

public class VendingMachineContext {


    private  VendingMachineState currentState;
    private int productCount = 10;
    private int coins = 0;

    public VendingMachineContext(VendingMachineState c){
        currentState = c;
    }

    public int getProductCount(){
        return productCount;
    }

    public void setProductCount(int n){
        productCount = n;
    }

    public int getCoinCount(){
        return coins;
    }

    public VendingMachineState insertCoin() {
        // on similar lines for coin also - move this to no coin state rather than premature change in context
        this.coins++;
        return currentState=this.currentState.insertCoin(this);
    }

    public VendingMachineState selectItem() {
        return currentState=this.currentState.selectItem(this);
    }

    public VendingMachineState dispense() {
        return currentState=this.currentState.dispense(this);
    }

    public VendingMachineState returnCoin() {
        return currentState=this.currentState.returnCoin(this);
    }

    public VendingMachineState refill() {
        return currentState=this.currentState.refill(this);
    }
    
}
