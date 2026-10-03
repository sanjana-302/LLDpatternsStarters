package DesignProblems.ParkingLotDesign.PaymentModule;

import DesignProblems.ParkingLotDesign.Vehicle;

public class CashStrategy extends AbstractPaymentStrategy{

    public CashStrategy(String selectPricingModel) {
            super(selectPricingModel);
        }
    
    @Override
    public void pay(Vehicle v) {
        System.out.println("Pay x amount for this parking ticket : " + this.pricingModel.calculatePrice(v));
    }
    
}
