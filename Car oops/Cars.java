import java.util.ArrayList;
import java.util.Scanner;

class Car_Details{
    String name;
    int fuel_capacity;
    int MPG;
    int mileage;
    double fuel_level;


//    declaring 5 ArrayList for storing each data of car
    private static ArrayList<String> car_name_list;
    private static ArrayList<Integer> car_fuel_capacity_list;
    private static ArrayList<Integer> car_mpg_list;
    private static ArrayList<Integer> car_mileage_list;
    private static ArrayList<Double> car_fuel_level_list;



//    returning all the list
    public ArrayList<String> get_car_name_list()
    {
        return car_name_list;
    }
    public ArrayList<Integer> get_fuel_capacity_list()
    {
        return car_fuel_capacity_list;
    }
    public ArrayList<Integer> get_mpg_list()
    {
        return car_mpg_list;
    }
    public ArrayList<Integer> get_mileage_list()
    {
        return car_mileage_list;
    }
    public ArrayList<Double> get_fuel_level_list()
    {
        return car_fuel_level_list;
    }


//constructor
    Car_Details() {}
    public void set_list_value()
    {
        //        initialization of cars data
        car_name_list = new ArrayList<>();
        car_name_list.add("Toyota Camry");
        car_name_list.add("Infinity G35X");
        car_name_list.add("Mini Cooper S");
        car_name_list.add("Bentley Continental");

        car_fuel_capacity_list = new ArrayList<>();
        car_fuel_capacity_list.add(21);
        car_fuel_capacity_list.add(18);
        car_fuel_capacity_list.add(15);
        car_fuel_capacity_list.add(20);

        car_mpg_list = new ArrayList<>();
        car_mpg_list.add(28);
        car_mpg_list.add(21);
        car_mpg_list.add(26);
        car_mpg_list.add(18);

        car_mileage_list = new ArrayList<>();
        car_mileage_list.add(120000);
        car_mileage_list.add(85000);
        car_mileage_list.add(10000);
        car_mileage_list.add(50000);

        car_fuel_level_list = new ArrayList<>();
        car_fuel_level_list.add(10.5);
        car_fuel_level_list.add(9.0);
        car_fuel_level_list.add(7.5);
        car_fuel_level_list.add(10.0);
    }

//    setters
    public void setName(String name) {
        if(name.length()>20)
        {
            throw new IllegalArgumentException("car name length should be less than or equal to 20");
        }
        else
        {
            this.name = name;
            car_name_list.add(name);
        }
    }
    public void setFuel_capacity(int fuel_capacity) {
        if(fuel_capacity<0)
        {
            throw new IllegalArgumentException("fuel capacity can not be negative");
        }
        else
        {
            this.fuel_capacity = fuel_capacity;
            car_fuel_capacity_list.add(fuel_capacity);
        }

    }
    public void setMPG(int MPG) {
        if(MPG<0)
        {
            throw new IllegalArgumentException("MPG can not be negative");
        }
        else
        {
            this.MPG = MPG;
            car_mpg_list.add(MPG);
        }
    }
    public void setMileage(int mileage) {
        if(mileage<0)
        {
            throw new IllegalArgumentException("mileage can not be negative");
        }
        else
        {
            this.mileage = mileage;
            car_mileage_list.add(mileage);
        }
    }
    public void setFuel_level(double fuel_level) {
        this.fuel_level = fuel_level;
        car_fuel_level_list.add(fuel_level);
    }

//    printing details
    void print_details(){
        System.out.printf("%-23s %14s %6s %12s %9s\n","     Car Name", "Fuel Capacity", "MPG", "Fuel Level", "Mileage");
        for(int i = 0;i<car_name_list.size();i++)
        {
            System.out.printf((i+1)+".%-23s %14s %6s %12s %9s\n",car_name_list.get(i), car_fuel_capacity_list.get(i), car_mpg_list.get(i), car_fuel_level_list.get(i), car_mileage_list.get(i));
        }
    }
}

public class Cars {
    static void add_car_deatails() {

        String cname;
        int fcapacity;
        int mpg;
        int mileage;
        double flevel;
        boolean flag = true;
        Car_Details car_details = new Car_Details();
        car_details.set_list_value();
        while(flag)
        {

            Scanner scanner = new Scanner(System.in);
            System.out.print("\nYour choice: (1) for adding car details (0) for others: ");
            int ch = scanner.nextInt();

            switch (ch){
                case 1:
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Car Name: ");
                    cname = sc.nextLine();
                    car_details.setName(cname);

                    System.out.print("Fuel Capacity: ");
                    fcapacity = sc.nextInt();
                    car_details.setFuel_capacity(fcapacity);

                    System.out.print("MPG: ");
                    mpg = sc.nextInt();
                    car_details.setMPG(mpg);

                    System.out.print("Mileage: ");
                    mileage = sc.nextInt();
                    car_details.setMileage(mileage);

//                  Setting fuel level
                    flevel = fcapacity/2.0;
                    car_details.setFuel_level(flevel);
                    System.out.println();
                    car_details.print_details();
                    break;
                case 0:
                    car_details.print_details();
                    flag = false;
                    break;
            }
        }
        System.out.println("\n");
        you_want_to();
    }

    static void you_want_to() {
        Car_Details car_details = new Car_Details();
        int list_len = car_details.get_car_name_list().size();
        if(list_len>0)
        {
            boolean flag = true;
            while(flag)
            {
                System.out.print("\nDo you want to: (D)rive or (A)dd gas, (Q)uit? ");
                Scanner scanner = new Scanner(System.in);
                String ch = scanner.next();


                switch (ch){
                    case "D":
                        Scanner scanner1 = new Scanner(System.in);

                        System.out.print("which car (1-"+list_len+")? ");
                        int car_num = scanner1.nextInt();
                        if(car_num>list_len)
                        {
                            throw new IllegalArgumentException("this car number does not exist");
                        }
                        else
                        {
                            System.out.print("How many miles? ");
                            int miles = scanner1.nextInt();
                            if(miles<0)
                            {
                                throw new IllegalArgumentException("miles to drive must be greater than 0");
                            }
                            else
                            {
//                            checking and updating fuel level
                                double fuel_level_in_list = car_details.get_fuel_level_list().get(car_num-1);
                                double fuel_level_need = miles/(car_details.get_mpg_list().get(car_num-1));
                                if (fuel_level_need>fuel_level_in_list)
                                {
                                    throw new IllegalArgumentException("Distance is too far");
                                }
                                else
                                {
                                    int curr_mileage =  car_details.get_mileage_list().get(car_num-1) + miles;
                                    car_details.get_mileage_list().set(car_num-1,curr_mileage);
                                    System.out.println("\n");
                                    car_details.print_details();
                                }
                            }
                        }
                        break;
                    case "A":
                        Scanner scanner2 = new Scanner(System.in);
                        System.out.print("which car (1-"+list_len+")? ");
                        int car_numA = scanner2.nextInt();

                        if(car_numA>list_len)
                        {
                            throw new IllegalArgumentException("this car does not exist");
                        }
                        else
                        {
                            System.out.print("How much gas? ");
                            int gas_quantity = scanner2.nextInt();
                            if (gas_quantity<0)
                            {
                                throw new IllegalArgumentException("gas amount to add must be greater than 0");
                            }
                            else
                            {
                                double curr_fuel_in_list = car_details.get_fuel_level_list().get(car_numA-1);
                                double sum_fuel = gas_quantity + curr_fuel_in_list;
                                if (sum_fuel>car_details.get_fuel_capacity_list().get(car_numA-1))
                                {
                                    throw new IllegalArgumentException("Exceeds fuel capacity");
                                }
                                else
                                {
                                    car_details.get_fuel_level_list().set(car_numA-1, sum_fuel);
                                    System.out.println("\n");
                                    car_details.print_details();
                                }
                            }
                        }

                        break;
                    case "Q":
                        System.out.println("\n");
                        car_details.print_details();
                        System.out.println("You Quit");
                        flag = false;
                        break;
                }
            }
        }
        else
        {
            System.out.println("there is not any car in the list");
        }

    }

    public static void main(String[] args) {
        add_car_deatails();
    }
}
