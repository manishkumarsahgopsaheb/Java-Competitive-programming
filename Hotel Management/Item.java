package Hotel_management;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Item{
    String item_name;
    double price;
    int order_id;
    private static ArrayList<String> item_name_list;
    private static ArrayList<Double> item_price_list;
    private static ArrayList<Integer> order_id_list;

    public  ArrayList<String> getItem_name_list() {
        return item_name_list;
    }

    public  ArrayList<Double> getItem_price_list() {
        return item_price_list;
    }

    public ArrayList<Integer> getOrder_id_list()
    {
        return order_id_list;
    }

    public Item() {}

    public void set_initial_list_value() {
//        retrieving initial data from item.txt file

        try {
            File file = new File("G:\\Hotel_management.Hotel\\src\\item.txt");
            Scanner scanner = new Scanner(file);
            item_name_list = new ArrayList<>();
            item_price_list = new ArrayList<>();
            while (scanner.hasNextLine())
            {
                String data_item = scanner.nextLine();
                List<String> spliting = Arrays.asList(data_item.split(","));
//                index 0 containing the item number
                String spliting_item_name = spliting.get(1);
                double spliting_item_price = Double.valueOf(spliting.get(2));
                item_name_list.add(spliting_item_name);
                item_price_list.add(spliting_item_price);

            }
            scanner.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Error Occurred");
            e.printStackTrace();
        }

        order_id_list = new ArrayList<>();
    }

    public void store_in_file(String str) {
        try {
            String filename = "G:\\Hotel_management.Hotel\\src\\item.txt";
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename, true));
            bufferedWriter.write(str);
            bufferedWriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
        item_name_list.add(item_name);
    }

    public void setPrice(Double price) {
        this.price = price;
        item_price_list.add(price);
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
        order_id_list.add(order_id);
    }

    public void order_details_in_file(String str) {
        try {
            String filename = "G:\\Hotel_management.Hotel\\src\\order.txt";
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename, true));
            bufferedWriter.write(str);
            bufferedWriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
