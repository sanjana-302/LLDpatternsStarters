package CreationalDesignPatterns.factoryDesignPattern;

public class VehicleFactory {
    public Vehicle creatVehicle(String input){
        if(input==null){
            throw new UnsupportedVehicleException("Please enter a non null value!");
        }
        if(input=="Car"){
            return new Car();
        }else if(input=="Bus"){
            return new Bus();
        }else if(input=="Cycle"){
            return new Cycle();
        }
        throw new UnsupportedVehicleException("Please enter a valid value!");
    }
}
