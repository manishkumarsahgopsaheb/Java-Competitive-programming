package AirLines;

import java.util.ArrayList;

class Route{
    private String start = "Kuala Lumpur";
    private String destination;
    private double flyTime;  // hours taken to reach the destination
    private int passenegerVol;  // passenger flying on this route each day
    private double fare;  // all passenger will pay the same fare amount

//    now lets make a array which contains the aircraft objects in this route
//    and also keep in mind that it is restricted that number of aircraft per
//    route is 10
//    private AirLines.AirCraft[] airCrafts = new AirLines.AirCraft[10];

    //    just for simplicity i am converting the Array airCrafts into air list
//    private ArrayList<AirLines.AirCraft> air = new ArrayList<>(Arrays.asList(airCrafts));
    private ArrayList<AirCraft> air = new ArrayList<>();



    //    constructor
    public Route(String destination, double flyTime, int passenegerVol) {
        this.destination = destination;
        this.flyTime = flyTime;
        this.passenegerVol = passenegerVol;
    }

//    getters and setters

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getFlyTime() {
        return flyTime;
    }

    public void setFlyTime(double flyTime) {
        this.flyTime = flyTime;
    }

    public int getPassenegerVol() {
        return passenegerVol;
    }

    public void setPassenegerVol(int passenegerVol) {
        this.passenegerVol = passenegerVol;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    public String toString(){
        String format = start+" - "+destination+", "+flyTime+" hours, "+passenegerVol+" passengers\n";
        String format2="";
        for(int i=0;i<air.size();i++)
        {
            format2 += air.get(i).toString()+"\n";
        }

        format = format + format2;
        return format;
    }

    //    total cost of flying of all planes in this route
    public double breakEven() {
        double total_cost_of_flying = 0;

        for(int i=0;i<air.size();i++)
        {
            total_cost_of_flying += air.get(i).calcRunningCosts()*flyTime;
        }
        return total_cost_of_flying;
    }

    //    income generated from this route
    public double income(){
        return passenegerVol*fare;
    }

    public void addAirCraft(AirCraft a) {
        air.add(a);
    }
}