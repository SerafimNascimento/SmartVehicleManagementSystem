public class ServiceRecord {
    // Attributes: date, description, cost.
    private String date;
    private  String description;
    private double cost;

    ServiceRecord(String date, String description, double cost) {
        setDate(date);
        setDescription(description);
        setCost(cost);
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public void displayRecord() {
        System.out.println(getDate()+": "+getDescription()+" ("+getCost()+")");

    }

}
