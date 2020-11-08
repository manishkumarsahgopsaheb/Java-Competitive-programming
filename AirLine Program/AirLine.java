package AirLines;

import java.util.ArrayList;

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