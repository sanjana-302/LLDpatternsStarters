package BehavioralDesignPattern.StrategyDesignPattern.PaymentSystemDesign;

public class UPIStrategy implements IPaymentStrategy{
    
    @Override 
    public boolean makePayment(int amount){
        // Check connectivity with bank 
        // check connectivity with central system
        System.out.print("Payment by UPI done!");
        return true;
    }
}
