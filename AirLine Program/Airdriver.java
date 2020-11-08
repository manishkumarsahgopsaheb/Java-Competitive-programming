import java.util.ArrayList;
import java.util.Arrays;

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

class Route{
    private String start = "Kuala Lumpur";
    private String destination;
    private double flyTime;  // hours taken to reach the destination
    private int passenegerVol;  // passenger flying on this route each day
    private double fare;  // all passenger will pay the same fare amount

//    now lets make a array which contains the aircraft objects in this route
//    and also keep in mind that it is restricted that number of aircraft per
//    route is 10
//    private AirCraft[] airCrafts = new AirCraft[10];

//    just for simplicity i am converting the Array airCrafts into air list
//    private ArrayList<AirCraft> air = new ArrayList<>(Arrays.asList(airCrafts));
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

class AirLine{
    private String name;
//    we have to keep in mind that airline can have 10 routes only
//    private Route[] routes = new Route[10];

//    now lets convert this array into the list
    private ArrayList<Route> rot = new ArrayList<>();

//    constructor
    public AirLine(String name) {
        this.name = name;
    }

    public String toString(){
        String format = name+"\n";
        String format2 = "";
        for(int i=0;i<rot.size();i++)
        {
            format2 += rot.get(i).toString()+"\n";
        }

        format = format + format2;
        return format;
    }

    public void addRoute(Route r){
        rot.add(r);
    }

    public double calcDailyProfit(){
        double income_of_each_route = 0;
        double break_even_costs = 0;
        double profit = 0;

        for(int i=0;i<rot.size();i++){
            income_of_each_route += rot.get(i).income();
            break_even_costs += rot.get(i).breakEven();
        }
        profit = income_of_each_route - break_even_costs;
        return profit;
    }
}


public class Airdriver {
    public static void main(String[] args) {
        AirCraft airCraft1 = new AirCraft("Airbus A330", 220, 14, 600, 4.0);
        AirCraft airCraft2 = new AirCraft("Boeing 737", 150, 16, 700, 4.5);
        AirCraft airCraft3 = new AirCraft("Boeing 747", 350, 13, 650,4.1);

        Route route1 = new Route("Hong Kong", 3.85, 350);
        route1.addAirCraft(airCraft1);
        route1.addAirCraft(airCraft2);
        route1.setFare(652.2);


        Route route2 = new Route("Singapore", 1.0, 500);
        route2.addAirCraft(airCraft3);
        route2.addAirCraft(airCraft2);
        route2.setFare(516.13);


        Route route3 = new Route("Melbourne",7.95,400);
        route3.addAirCraft(airCraft1);
        route3.addAirCraft(airCraft1);
        route3.setFare(413.6);


        Route route4 = new Route("Bangkok", 2.0, 270);
        route4.addAirCraft(airCraft2);
        route4.addAirCraft(airCraft2);
        route4.setFare(549.2);


        AirLine airLine = new AirLine("Air Malaysia");
        airLine.addRoute(route1);
        airLine.addRoute(route2);
        airLine.addRoute(route3);
        airLine.addRoute(route4);


        System.out.println(airLine.toString());
        System.out.println("Total Profit per day: $"+airLine.calcDailyProfit());

    }
}
