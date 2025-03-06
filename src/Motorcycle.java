import java.util.List;

public class Motorcycle extends Vehicle implements Maintanable{
    private boolean hasSidecar;

    Motorcycle(String make, String model, int year, Owner owner, boolean hasSidecar) throws InvalidYearException {
        super(make,model,year,owner);
        setHasSidecar(hasSidecar);
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    public boolean getHasSidecar() {
        return hasSidecar;
    }

    @Override
    public double calculateMaintenanceCost() {
        return 300.0;
    }

    public void performMaintenance(){
        System.out.println("Motorcycle maintenance performed: Chain lubrication, tire check.");
    }

}
