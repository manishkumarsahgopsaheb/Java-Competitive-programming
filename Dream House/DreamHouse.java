import java.util.Scanner;

public class DreamHouse {
    static void user_input(){
        float m_salary;
        int portion_saved;
        float t_cost;
        int a_rate;

        float portion_dp;
        float c_savings = 0;  // initially current saving is $0
        int required_month;

        System.out.println("\nyour initial current saving is: "+c_savings);

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter your monthly salary is: ");
        m_salary = scanner.nextFloat();
        System.out.print("Enter the portion you want to save from your monthly salary (percent): ");
        portion_saved = scanner.nextInt();

        // current saving updated by how many percent of your monthly salary you want to save plus your initial current saving
        c_savings = c_savings + (float)(m_salary*(portion_saved*0.01));

        System.out.println("\nyour current saving is "+c_savings+" after "+portion_saved+" percent saving from your monthly salary");



        System.out.print("\nEnter cost of your dream home: ");
        t_cost = scanner.nextFloat();

        portion_dp = (float) (t_cost*0.1);  // as the downPayment is 10% of our dream home cost
        System.out.print("\nyour down payment will be: "+portion_dp);

        System.out.print("\nEnter annual return rate of investment: ");
        a_rate = scanner.nextInt();

//        after investing my money very wisely

        c_savings = c_savings +  (c_savings*a_rate)/(12*100);  // now this is actual saving of per month

        System.out.println("\nafter investing my saving with annual return rate of "+a_rate+" percent my current saving is: "+c_savings);

        required_month = (int) (portion_dp/c_savings);

        System.out.println("\n"+required_month+" month required for making "+portion_dp+" down payment");

    }
    public static void main(String[] args) {
        user_input();
    }
}
