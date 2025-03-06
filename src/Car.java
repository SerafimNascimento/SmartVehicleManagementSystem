import java.util.List;

public class Car extends Vehicle implements Maintanable{
    /*
    Additional attribute: numberOfDoors (int).
    Implements calculateMaintenanceCost(): Cars have a fixed maintenance cost of $500 per year.
    * */
    private int numberOfDoors;

    Car(String make, String model, int year, Owner owner, int numberOfDoors) throws InvalidYearException {
        super(make,model,year,owner);
        setNumberOfDoors(numberOfDoors);
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public double calculateMaintenanceCost() {
        return 500.00;
    }

    public void performMaintenance(){
        System.out.println("Car maintenance performed: Oil change, tire check, engine diagnostics.");
    }
}
