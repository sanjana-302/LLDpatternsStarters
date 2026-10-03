package DesignProblems.ParkingLotDesign.CalculateFeeModule;

import DesignProblems.ParkingLotDesign.Vehicle;

public class DailyModel implements PricingModel{

    @Override
    public Double calculatePrice(Vehicle v) {
        Double start = (double) v.getStartTIme().getDayOfMonth();
        Double end = (double) v.getEndTime().getDayOfMonth();

        if(end==start) return (double) 100;
        return (double) (end-start)*200;
    }
    
}
