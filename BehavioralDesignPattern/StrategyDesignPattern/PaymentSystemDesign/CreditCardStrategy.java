package BehavioralDesignPattern.StrategyDesignPattern.PaymentSystemDesign;

public class CreditCardStrategy implements IPaymentStrategy{
    
    @Override 
    public boolean makePayment(int amount){
        // Check connectivity with bank 
        // validate CVV
        System.out.print("Payment by credit card done!");
        return true;
    }
}
