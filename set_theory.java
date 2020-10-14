import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class set_theory {

    static void main_menu(){
        System.out.println("0. Properties of set");
        System.out.println("1. Union example");
        System.out.println("2. Intersection example");
        System.out.println("3. Subset example");
        System.out.println("4. Difference example");
        System.out.println("5. Complement example");
        System.out.println("6. Sets equality example");
        System.out.println("9: Quit");
        boolean flag = true;
        while(flag) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Your options: ");
            int input = sc.nextInt();
            switch (input) {
                case 0:
                    System.out.println("Here is an example of set");
                    System.out.println("\t\tA = {Mar, Jun, Sep}");
                    System.out.println("\t\tAll elements in set are distinct and random order");
                    submenu_operation();
                    break;
                case 1:
                    System.out.println("Given sets");
                    System.out.println("\t\tA = {Jan, Jun, Oct, Nov, Feb, Jul}");
                    System.out.println("\t\tB = {Jun, Jul, Apr}");
                    System.out.println("\t\tUnion of A and B = {Jan, Jun, oct, Nov, Feb, Jul, Apr}");
                    break;
                case 2:
                    System.out.println("Given sets");
                    System.out.println("\t\tA = {Dec, Nov, Oct, Jun, Jul, Aug, Mar}");
                    System.out.println("\t\tB = {Aug, Dec, Oct, Nov, Jun}");
                    System.out.println("\t\tIntersection of A and B = {Dec, Nov, Oct, Jun, Aug}");
                    break;
                case 3:
                    System.out.println("Given sets");
                    System.out.println("\t\tA = {Jan, May, Mar, Jul, Feb, Apr, Jun, Oct, Dec}");
                    System.out.println("\t\tB = {Jun, Jul}");
                    System.out.println("Conclusion");
                    System.out.println("\t\tA subset of B: false");
                    System.out.println("\t\tB subset of A: true");
                    break;
                case 4:
                    System.out.println("Given sets");
                    System.out.println("\t\tA = {Jun, Feb, Dec, Mar, Nov, Sep, Jul, Apr, May}");
                    System.out.println("\t\tB = {Sep, Nov, Jan, Aug, Oct, Jun}");
                    System.out.println("\t\tA - B = {Feb, Dec, mar, Jul, Apr, May}");
                    break;
                case 5:
                    System.out.println("Given set");
                    System.out.println("\t\tA = {Mar, Nov, Jan, Jun, Oct, Mar, Feb}");
                    System.out.println("\t\tA' = {Apr, Aug, Sep, Dec}");
                    break;
                case 6:
                    System.out.println("Given sets");
                    System.out.println("\t\tA = {May, MAr, Apr, Feb, Jan}");
                    System.out.println("\t\tB = {Feb, Mar, May, Apr, Jan}");
                    System.out.println("Analysis");
                    System.out.println("\t\tA subset of B: true");
                    System.out.println("\t\tB subset of A: true");
                    System.out.println("Conclusion");
                    System.out.println("\t\tA equals to B: true");
                    break;
                case 9:
                    System.out.println("you existed from main menu");
                    flag = false;
                    break;
            }
        }
    }

    static void submenu_operation()
    {
        System.out.println("Some basic operations in set");
        System.out.println("\t\t1. Add an element");
        System.out.println("\t\t2. Check an element");
        System.out.println("\t\t3. Cardinality");
        System.out.println("\t\t4. Various Displays");
        System.out.println("\t\t9: Quit");
        boolean flag = true;
        Set<String> hash_set = new HashSet<>();
        hash_set.add("Mar");
        hash_set.add("Aug");
        hash_set.add("Nov");
        while(flag)
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("\t\tYour options: ");
            int input = sc.nextInt();
            switch (input)
            {
                case 1:
                    System.out.print("\t\tEnter an element: ");
                    Scanner scanner = new Scanner(System.in);
                    String month = scanner.nextLine();
                    hash_set.add(month);
                    System.out.println("\t\t"+hash_set);
                    break;
                case 2:
                    System.out.print("\t\tEnter an element: ");
                    Scanner sc1 = new Scanner(System.in);
                    String str = sc1.nextLine();
                    if (hash_set.contains(str))
                    {
                        System.out.println("\t\tTrue");
                    }
                    else {
                        System.out.println("\t\tFalse");
                    }
                    break;
                case 3:
                    System.out.println("\t\tset is: "+hash_set);
                    System.out.println("\t\tCardinality is: " +hash_set.size());
                    break;
                case 4:
                    System.out.println("\t\tVarious Displays: ");
                    System.out.print("\t\tfor adding an element, Enter an element: ");
                    Scanner sc2 = new Scanner(System.in);
                    String months = sc2.nextLine();
                    hash_set.add(months);
                    System.out.println("\t\t"+hash_set);
                    System.out.println("\t\tcardinality is: "+hash_set.size());
                    break;
                case 9:
                    System.out.println("\t\tyou Quit! from the submenu");
                    flag = false;
                    break;
            }
        }

    }

    public static void main(String[] args) {
        System.out.println("****************Welcome to SIM Set Theory lesson*************************\n");
        main_menu();
    }
}
