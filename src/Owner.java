import java.util.ArrayList;
import java.util.List;

public class Owner {

    /*
    Create an Owner class that represents the vehicle owner.
✔ Attributes: name, address, phoneNumber, List<Vehicle> ownedVehicles.
✔ Constructor to initialize attributes.
✔ Method addVehicle(Vehicle v) to assign vehicles to an owner.
✔ Method displayVehicles() to list all vehicles owned.
    * */

    private String name;
    private String address;
    private String phoneNumber;
    private List<Vehicle> ownedVehicles;

    Owner(String name, String address, String phoneNumber) {
        setName(name);
        setAddress(address);
        setPhoneNumber(phoneNumber);
        ownedVehicles = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setOwnedVehicles(List<Vehicle> ownedVehicles) {
        this.ownedVehicles = ownedVehicles;
    }

    public List<Vehicle> getOwnedVehicles() {
        return ownedVehicles;
    }

    public void addVehicle(Vehicle v) {
        ownedVehicles.add(v);
    }

    public void displayVehicles(){
        if (ownedVehicles.isEmpty()) {
            System.out.println(getName()+" does not have any vehicles yet.");
        } else {
            System.out.println("\n"+getName()+" has "+ownedVehicles.size()+" vehicles:");
            for(Vehicle v: ownedVehicles) {
                System.out.println("-> "+v.getModel());
            }
            System.out.println();
        }
    }

}
