package CreationalDesignPatterns.factoryDesignPattern;

public class main {
    public static void main(String[] args) {
        // this is client code
        Vehicle car = new Car();
        Vehicle bus = new Bus();
        Vehicle cycle = new Cycle();
        // car.start();
        // car.stop();

        bus.start();
        bus.stop();

        cycle.start();
        cycle.stop();

        // // client wants to create vehicle based on input
        // // client code looks messy 
        // String input = "Car";

        // if(input=="car"){

        // }else if(input=="Bus"){

        // }else if(input=="Cycle"){

        // }else{
            
        // }

        // introduce a factory

        VehicleFactory vf = new VehicleFactory();
        car = vf.creatVehicle("Car");
        bus = vf.creatVehicle("Bus");
        try{
            Vehicle unknown = vf.creatVehicle("zyx");
            unknown.start();
        }catch(RuntimeException e){
            System.err.println(e.getMessage());
        }
        cycle = vf.creatVehicle("Cycle");
        car.start();
        
    }
}
