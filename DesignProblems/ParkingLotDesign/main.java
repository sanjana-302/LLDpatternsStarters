package DesignProblems.ParkingLotDesign;

import DesignProblems.ParkingLotDesign.ParkingSlotModule.ParkingSlot;

public class main {
    public static void main(String[] args) {
        // What does a parking lot system looks like?
        // Rules of system 
        // 1. The parking slot has multiple slots available for parking 
        // 2. Single floor system 
        // 3. Different type of vehicles can  be parked 
        // 4. Vehicles are issues tickets on entry 
        // 5. Price is calculated - Multiple payment methods are supoorted 

        // Maximum 4-5 points - clearing the requirement 
        // 1. Different types of vehicles can be parked in the parking lot - eg Car, Scooter
        // 2. Payment is supported via different methods - Cash UPI 
        // 3. Parking fee calculation - assuming at moment this would be by hours, but this should be  extensible -> different algorithms 
        // 4. The system should handle different vehicle sizes and slot allocations efficiently.

        // Jot down actual requirements - 
        // • A parking lot with multiple slot types.

        // • Support for bikes, cars, and trucks.
        
        // • Dynamic slot allocation based on vehicle size.
        
        // • Payment processing with multiple methods.
        
        // • Entry ticket issuance and exit validation.

        // Key components in system - 
        // 1. Vehicle -> multiple types -> factory pattern to create these vahicles, hide constructor piece from actual client 
        // 2. ParkingSlots -> multiple types, ParkingSpace -> one to many relationship with parking slot
        // 3. ParkingTicket -> fee calculation 
        // 4. Payment Class -> multiple payment types -> Strategy pattern here 

        // Design challenges - 
        // Dynamic enough with the way we are creating vehicles 
        // Assigning them to actual slots -> truck cannot sit in car slot  ??
        // Payment strategy is extensible -> another payment way 
        // Ticket handling 

        // Mitigate challenges 
        // Factory Design to create vehicles 
        // Strategy pattern for payment methods or price algorithms -- 
        // Singleton Pattern for parking lot management 
        // Observer pattern for exit notifications 

        System.out.println("=== INITIALIZING PARKING LOT SYSTEM ===");
        
        // 1. Initialize the ParkingLotManager 
        // (Note: Make sure your ParkingLotManager constructor initializes availableSlots = new ArrayList<>()!)
        ParkingLotManager manager = new ParkingLotManager();

        try {
            // 2. Create Vehicles via the Factory pattern (automatically generates entry timestamps & tickets)
            System.out.println("\n--- 1. Vehicle Entry ---");
            Vehicle car = manager.createVehicle("CAR", "MH-01-AB-1234");
            Vehicle truck = manager.createVehicle("TRUCK", "MH-12-XY-9999");
            Vehicle bike = manager.createVehicle("BIKE", "MH-04-P-5678");

            // 3. Assign Parking Slots
            System.out.println("\n--- 2. Slot Allocation ---");
            ParkingSlot assignedCarSlot = manager.assignParkingLot(car);
            ParkingSlot assignedTruckSlot = manager.assignParkingLot(truck);
            ParkingSlot assignedBikeSlot = manager.assignParkingLot(bike);

            // 4. Simulate Exit and Payment Processing (using Strategy Pattern)
            System.out.println("\n--- 3. Vehicle Exit & Payment ---");
            
            if (car != null && assignedCarSlot != null) {
                System.out.println("\nProcessing exit for Car (" + car.getUniqueId() + "):");
                // Pass payment method ("CASH" or "UPI") and pricing model ("HOURLY" or "DAILY")
                manager.exitVehicle("CASH", car, "HOURLY");
                assignedCarSlot.unparkVehicle(); // Free up the slot
            }

            if (truck != null && assignedTruckSlot != null) {
                System.out.println("\nProcessing exit for Truck (" + truck.getUniqueId() + "):");
                manager.exitVehicle("UPI", truck, "DAILY");
                assignedTruckSlot.unparkVehicle(); // Free up the slot
            }

        } catch (Exception e) {
            System.out.println("An error occurred in the parking lot system: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
