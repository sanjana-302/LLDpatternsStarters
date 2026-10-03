package DesignProblems.ParkingLotDesign;

import java.time.LocalDateTime;

public class Truck implements Vehicle{

    private String uniqueId;
    private ParkingTicket p;

    public Truck(String uId, ParkingTicket p){
        this.uniqueId = uId;
        this.p = p;
    }

    @Override
    public String getUniqueId() {
        return uniqueId;
    }

    @Override
    public LocalDateTime getStartTIme() {
        return this.p.getStartDate();
    }

    @Override
    public LocalDateTime getEndTime() {
        return this.p.getEndDate();
    }

    @Override
    public ParkingTicket getParkingTicket() {
        return p;
    }
    
}
