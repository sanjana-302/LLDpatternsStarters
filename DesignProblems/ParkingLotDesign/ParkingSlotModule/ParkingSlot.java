package DesignProblems.ParkingLotDesign.ParkingSlotModule;

import DesignProblems.ParkingLotDesign.Vehicle;

// enumerated 
public interface ParkingSlot {
    public void setIdentityNumber(int i);
    public Boolean isOccupied();
    public Vehicle getParkedVehicle();
    public void parkVehicle(Vehicle v);
    public void unparkVehicle();
}