package DesignProblems.ParkingLotDesign;

import java.time.LocalDateTime;

public interface Vehicle {
    public String getUniqueId();
    public LocalDateTime getStartTIme();
    public LocalDateTime getEndTime();
    public ParkingTicket getParkingTicket();
}