package BehavioralDesignPattern.StrategyDesignPattern.PaymentSystemDesign;

public class main {
    public static void main() {
        System.out.println("Payment request arrived");
        String mode = "xyz";
        PaymentProcessor processor = new PaymentProcessor();
        if(Mode.Credit.toString()==mode){
            processor.processPayment(new CreditCardStrategy(), 100);
        }else if(Mode.Debit.toString()==mode){
            processor.processPayment(new DebitCardStrategy(), 100);
        }else if(Mode.UPI.toString()==mode){
            processor.processPayment(new UPIStrategy(), 100);
        }else{
            System.err.print("Enter a valid system to make payment");
        }
    }
}
