package BehavioralDesignPattern.StrategyDesignPattern.PaymentSystemDesign;

public class DebitCardStrategy implements IPaymentStrategy{

    @Override 
    public boolean makePayment(int amount){
        // Check connectivity with bank 
        // validate OTP
        System.out.print("Payment by debit card done!");
        return true;
    }
}
