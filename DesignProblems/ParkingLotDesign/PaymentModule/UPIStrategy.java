package DesignProblems.ParkingLotDesign.PaymentModule;

import DesignProblems.ParkingLotDesign.Vehicle;

public class UPIStrategy extends AbstractPaymentStrategy{

    public UPIStrategy(String selectPricingModel) {
            super(selectPricingModel);
            //TODO Auto-generated constructor stub
        }
    
    @Override
    public void pay(Vehicle v) {
        System.out.println("Pay x amount for this parking ticket : " + this.pricingModel.calculatePrice(v));
    }
    
}
