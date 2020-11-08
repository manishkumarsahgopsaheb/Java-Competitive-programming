package AirLines;

class AirCraft{
    private String type;
    private int passengers;
    private int crew;
    private double maintCost;
    private double fuelEffic;

    //    constructor
    public AirCraft(String type, int passengers, int crew, double maintCost, double fuelEffic) {
        this.type = type;
        this.passengers = passengers;
        this.crew = crew;
        this.maintCost = maintCost;
        this.fuelEffic = fuelEffic;
    }

    //    getter and setters for getting and setting the private data member of this class
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getCrew() {
        return crew;
    }

    public void setCrew(int crew) {
        this.crew = crew;
    }

    public double getMaintCost() {
        return maintCost;
    }

    public void setMaintCost(double maintCost) {
        this.maintCost = maintCost;
    }

    public double getFuelEffic() {
        return fuelEffic;
    }

    public void setFuelEffic(double fuelEffic) {
        this.fuelEffic = fuelEffic;
    }

    public String toString(){
        String string = type +","+ passengers;
        return string;
    }

    public double calcRunningCosts() {
        double totol_cost;
        int fuel_used = 767;
        int crew_cost = 100;
        int overhead_cost = 8000;
        totol_cost = fuel_used + crew_cost + maintCost + overhead_cost;
        return totol_cost;
    }
}