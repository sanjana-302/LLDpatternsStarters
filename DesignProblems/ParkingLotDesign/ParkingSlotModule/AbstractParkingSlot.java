package DesignProblems.ParkingLotDesign.ParkingSlotModule;

import DesignProblems.ParkingLotDesign.Vehicle;

public abstract class AbstractParkingSlot implements ParkingSlot{
    private int identityNumber;
    private Boolean isOccupied;
    private Vehicle v;

    public AbstractParkingSlot(int id){
        this.identityNumber = id;
        isOccupied = false;
        v = null;
    }

    @Override
    public void setIdentityNumber(int i) {
        this.identityNumber = i;
    }

    @Override
    public Boolean isOccupied() {
        return isOccupied;
    }

    @Override
    public Vehicle getParkedVehicle() {
        return v;
    }

    @Override
    public void parkVehicle(Vehicle v) {
        isOccupied = true;
        this.v = v;

        System.out.println("Vehicle is parked now!");
    }

    @Override 
    public void unparkVehicle() {
        isOccupied = false;
        this.v = null;

        System.out.println("Vehicle is unparked now, please pay your bill!");
    }
}
