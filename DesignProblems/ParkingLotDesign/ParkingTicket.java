package DesignProblems.ParkingLotDesign;

import java.time.LocalDateTime;

public class ParkingTicket {
    private LocalDateTime starDate;
    private LocalDateTime enDate;

    public ParkingTicket(LocalDateTime start){
        this.starDate = start;
        this.enDate = null;
    }

    public void setEndDate(LocalDateTime d){
        this.enDate = d;
    }

    public LocalDateTime getEndDate(){
        return this.enDate;
    }

    public LocalDateTime getStartDate(){
        return this.starDate;
    }

}
