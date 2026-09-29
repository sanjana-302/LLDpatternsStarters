package BehavioralDesignPattern.StrategyDesignPattern.PaymentSystemDesign;

public interface IPaymentStrategy {

    boolean makePayment(int amount);
}