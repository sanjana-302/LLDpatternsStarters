package DesignProblems.ParkingLotDesign.CalculateFeeModule;

import DesignProblems.ParkingLotDesign.Vehicle;

public interface PricingModel {
    public Double calculatePrice(Vehicle v);
}
