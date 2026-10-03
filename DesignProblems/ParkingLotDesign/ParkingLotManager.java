package DesignProblems.ParkingLotDesign;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import DesignProblems.ParkingLotDesign.ParkingSlotModule.ParkingSlot;
import DesignProblems.ParkingLotDesign.ParkingSlotModule.ParkingSlotCar;
import DesignProblems.ParkingLotDesign.ParkingSlotModule.ParkingSlotOther;
import DesignProblems.ParkingLotDesign.ParkingSlotModule.ParkingSlotTruck;
import DesignProblems.ParkingLotDesign.PaymentModule.CashStrategy;
import DesignProblems.ParkingLotDesign.PaymentModule.PaymentStrategy;
import DesignProblems.ParkingLotDesign.PaymentModule.UPIStrategy;

public final class ParkingLotManager {

    private List<ParkingSlot> availableSlots = new ArrayList<>();
    private PaymentStrategy paymentStrategy;
    private VehicleFactory vehicleFactory;

    public ParkingLotManager(){
        ParkingSlot car1 = new ParkingSlotCar(1);
        ParkingSlot car2 = new ParkingSlotCar(2);
        ParkingSlot truck1 = new ParkingSlotTruck(3);
        ParkingSlot other = new ParkingSlotOther(4);
        availableSlots.add(car1);
        availableSlots.add(car2);
        availableSlots.add(truck1);
        availableSlots.add(other);
        vehicleFactory = new VehicleFactory();
    }

    public Vehicle createVehicle(String type, String number){
        return vehicleFactory.createVehicle(type, number);
    }

    public ParkingSlot assignParkingLot(Vehicle v){
        for (ParkingSlot p : availableSlots) {
            // 1. Check if the slot is free
            if (!p.isOccupied()) {
                
                // 2. Check if the slot type matches the vehicle type
                if (v instanceof Car && p instanceof ParkingSlotCar) {
                    p.parkVehicle(v);
                    return p;
                } 
                else if (v instanceof Truck && p instanceof ParkingSlotTruck) {
                    p.parkVehicle(v);
                    return p;
                } 
                else if (v instanceof OtherVehicle && p instanceof ParkingSlotOther) {
                    p.parkVehicle(v);
                    return p;
                }
            }
        }
        
        System.out.println("Sorry, no available parking slots found for this vehicle type!");
        return null;
    }

    public void exitVehicle(String paymentMethod, Vehicle v,String feeModel){
        this.paymentStrategy = getPaymentStrategy(paymentMethod,feeModel);
        v.getParkingTicket().setEndDate(LocalDateTime.now());
        this.paymentStrategy.pay(v); 
    }

    private PaymentStrategy getPaymentStrategy(String paymentMethod,String feeModel){
        if(paymentMethod.equalsIgnoreCase("CASH")){
            return new CashStrategy(feeModel);
        }

        return new UPIStrategy(feeModel);
    }
    
}
