package AirLines;

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
