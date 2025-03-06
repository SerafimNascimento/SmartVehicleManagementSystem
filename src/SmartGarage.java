
public class SmartGarage {
    public static void main(String[] args) {
        try {
            Owner owner1 = new Owner("Serafim","Rua 123","1234567890");
            Owner owner2 = new Owner("Seraphim","Rua 456","2034567890");

            Car car1 = new Car("Toyota","Corolla",2022,owner1,4);
            Motorcycle mc = new Motorcycle("Yamaha","R1",2021,owner1,true);
            Truck tk = new Truck("Volvo","FH16",2018,owner2,70);

            owner1.addVehicle(car1);
            owner1.addVehicle(mc);
            owner2.addVehicle(tk);

            car1.addServiceRecord(new ServiceRecord("2025-03-05","Oil Change",50.0));
            mc.addServiceRecord(new ServiceRecord("2025-02-06","Tire Replacement",70.0));
            tk.addServiceRecord(new ServiceRecord("2024-12-15","Washing",115.55));

            car1.displayInfo();
            car1.displayServiceHistory();

            mc.displayInfo();
            mc.displayServiceHistory();

            tk.displayInfo();
            tk.displayServiceHistory();

            owner1.displayVehicles();
            owner2.displayVehicles();

        } catch (InvalidYearException e) {
            System.err.println("Exception: "+e.getMessage());
        }
    }
}