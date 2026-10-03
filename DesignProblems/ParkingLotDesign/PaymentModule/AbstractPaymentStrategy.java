package DesignProblems.ParkingLotDesign.PaymentModule;

import DesignProblems.ParkingLotDesign.CalculateFeeModule.DailyModel;
import DesignProblems.ParkingLotDesign.CalculateFeeModule.HourlyModel;
import DesignProblems.ParkingLotDesign.CalculateFeeModule.PricingModel;

public abstract class AbstractPaymentStrategy implements PaymentStrategy{
    protected PricingModel pricingModel;

    public AbstractPaymentStrategy(String selectPricingModel){
        if(selectPricingModel.equalsIgnoreCase("DAILY")){
            this.pricingModel = new DailyModel();
        }else{
            this.pricingModel = new HourlyModel();
        }
    }
}
