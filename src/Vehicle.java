import java.util.ArrayList;
import java.util.List;

// TASK 1
abstract class Vehicle {
    //Private attributes: make (brand), model, year, owner (a separate Owner object).
    private String make;
    private String model;
    private int year;
    private Owner owner;
    private List<ServiceRecord> serviceHistory;

    // Constructor to initialize the attributes.
    Vehicle(String make, String model, int year, Owner owner) throws InvalidYearException{
        if (year < 1886) {
            throw new InvalidYearException("Sorry, but you cannot record a vehicle from or before this year " + year + " !");
        }
        setMake(make);
        setModel(model);
        setYear(year);
        setOwner(owner);
        serviceHistory = new ArrayList<>();
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setServiceHistory(List<ServiceRecord> serviceHistory) {
        this.serviceHistory = serviceHistory;
    }

    public List<ServiceRecord> getServiceHistory() {
        return serviceHistory;
    }

    public void displayServiceHistory() {
        System.out.println("Service Records for " + make + " " + model + ":");
        for(ServiceRecord records: getServiceHistory()) {
            //System.out.println(records.displayRecord());
            records.displayRecord();
        }
    }

    // displayInfo() method to show vehicle details.
    public void displayInfo() {
        System.out.println("Vehicle Details:");
        System.out.println("Make: "+getMake()+" | Model: "+getModel()+" | Year: "+getYear()+" | Owner: "+getOwner().getName());
        //Code more here
    }

    // Abstract method calculateMaintenanceCost() (to be implemented by subclasses).
    public abstract double calculateMaintenanceCost();

    public void addServiceRecord(ServiceRecord record) {
        serviceHistory.add(record);
    }
}
