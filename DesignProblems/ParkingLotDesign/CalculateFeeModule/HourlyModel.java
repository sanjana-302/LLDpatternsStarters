package DesignProblems.ParkingLotDesign.CalculateFeeModule;

import DesignProblems.ParkingLotDesign.Vehicle;

public class HourlyModel implements PricingModel{

    @Override
    public Double calculatePrice(Vehicle v) {
        Double start = (double) v.getStartTIme().getNano();
        Double end = (double) v.getEndTime().getNano();

        if(end==start) return (double) 10;
        return (double) (end-start)*20;
    }
    
}
