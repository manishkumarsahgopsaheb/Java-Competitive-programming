package Hotel_management;


import java.util.Scanner;

public class Hotel {

    static void order_menu() {
        Item it_order = new Item();
        System.out.printf("\n%-23s %11s\n","     Hotel_management.Item Name", "Rate");
        int list_len = it_order.getItem_name_list().size();

        for(int i=0; i<list_len;i++)
        {
            System.out.printf((i+1)+". %-23s %11s\n", it_order.getItem_name_list().get(i), it_order.getItem_price_list().get(i));
        }

        System.out.print("\nOrder now! choose the item number: ");
        Scanner scanner = new Scanner(System.in);
        int order_id = scanner.nextInt();

        if(order_id!=0 && order_id<=list_len)
        {
            it_order.setOrder_id(order_id);
            System.out.println("you have Ordered "+it_order.getItem_name_list().get(order_id-1)+" item");
            System.out.print("Do you want to order next item {Y/N}? ");
            Scanner scanner1 = new Scanner(System.in);
            String order_again = scanner1.next();
            if (order_again.equals("Y"))
            {
                order_menu();
            }
            else if(order_again.equals("N"))
            {
                System.out.println("\nyou have ordered: ");
                System.out.printf("%-23s %11s %14s\n","    Hotel_management.Item Name", "   Price", "   item_id");
                for(int i=0;i<it_order.getOrder_id_list().size();i++)
                {
                    int index = it_order.getOrder_id_list().get(i);
                    String item = it_order.getItem_name_list().get(index-1);
                    double price = it_order.getItem_price_list().get(index-1);
                    System.out.printf((i+1)+". %-23s %11s %14s\n", item,price,index);
                    String order_details = (i+1)+"\t"+item+"\t"+price+"\t"+index+"\n";
                    it_order.order_details_in_file(order_details);
                }
                main_menu();
            }
            else {
                System.out.println("wrong input");
            }
        }
        else
        {
            main_menu();
        }
    }

    static void add_new_item() {
        Item it = new Item();
        System.out.print("\nHi Owner! Welcome add the item in your menu");
        String itemName;
        double itemPrice;
        boolean flag = true;
        while (flag)
        {
            Scanner sc1 = new Scanner(System.in);
            System.out.print("\nYou want to A for add or E for exist from this main-menu: ");
            String ch = sc1.next();
            switch (ch)
            {
                case "A":
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Hotel_management.Item Name is: ");
                    itemName = scanner.nextLine();
                    System.out.print("Price of "+itemName+" is: ");
                    itemPrice = scanner.nextDouble();
                    it.setItem_name(itemName);
                    it.setPrice(itemPrice);
//                    now lets storing it to a item.txt file
//                    finding item counter
                    int cnt = it.getItem_name_list().size();
                    String storing_str = "\n"+cnt+","+itemName+","+itemPrice;
                    it.store_in_file(storing_str);

                    break;
                case "E":
                    flag = false;
                    main_menu();
                    break;
            }
        }
    }

    static void main_menu() {
        System.out.println("Lite Lunch Main Menu");
        System.out.println("1) Order Menu");
        System.out.println("2) Add New Hotel_management.Item");
        System.out.println("3) Exit System");

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nPlease enter your opinion: ");
        int choice = scanner.nextInt();
        switch (choice)
        {
            case 1:
                order_menu();
                break;
            case 2:
                add_new_item();
                break;
            case 3:
                System.out.print(" you exist from the program");
                break;

            }

    }

    public static void main(String[] args) {
        Item c = new Item();
        c.set_initial_list_value();
            main_menu();
    }
}
