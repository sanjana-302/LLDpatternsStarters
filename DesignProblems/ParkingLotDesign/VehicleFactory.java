package DesignProblems.ParkingLotDesign;

import java.time.LocalDateTime;

public class VehicleFactory {

    public Vehicle createVehicle(String type,String uniqueId){
        LocalDateTime currenDate = LocalDateTime.now();
        ParkingTicket pt = new ParkingTicket(currenDate);
        if(type.equalsIgnoreCase("CAR")){
            return new Car(uniqueId, pt);
        }else if(type.equalsIgnoreCase("TRUCK")){
            return new Truck(uniqueId, pt);
        }
        return new OtherVehicle(uniqueId, pt);
    }
}
