import java.util.List;

public class Truck extends Vehicle implements Maintanable{
    private double maxLoadCapacity;

    Truck(String make, String model, int year, Owner owner, double maxLoadCapacity) throws InvalidYearException {
        super(make,model,year,owner);
        setMaxLoadCapacity(maxLoadCapacity);
    }

    public void setMaxLoadCapacity(double maxLoadCapacity) {
        this.maxLoadCapacity = maxLoadCapacity;
    }

    public double getMaxLoadCapacity() {
        return maxLoadCapacity;
    }

    @Override
    public double calculateMaintenanceCost() {
        return 100.00;
    }

    public void performMaintenance(){
        System.out.println("Truck maintenance performed: Engine tuning, load check, brake inspection.");
    }

}