package BehavioralDesignPattern.StrategyDesignPattern.PaymentSystemDesign;

// always look from prespective of payment processor
public class PaymentProcessor {

    IPaymentStrategy paymentStrategy;

    void setPaymentStrategy(IPaymentStrategy p){
        this.paymentStrategy = p;
    }

    void processPayment(IPaymentStrategy p, int amount){
        setPaymentStrategy(p);
        paymentStrategy.makePayment(100);
    }
    
}
