import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Readcsvfile {
    public static void main(String[] args) throws Exception{
        List<String> month_list = new ArrayList<>();
        List<String> year_list = new ArrayList<>();
        int count = 0;
        String each_line;
        File file = new File("C:\\Users\\hp\\Desktop\\chegg account\\risk.csv");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine())
        {
            if (count == 0)
               {
                   count = count + 1;
                   each_line = scanner.nextLine();
               }
            else {
                each_line = scanner.nextLine();
                List<String> data;

                data = Arrays.asList(each_line.split(","));

                month_list.add(data.get(0));
                year_list.add(data.get(2));

            }
        }
        System.out.println(month_list);
        System.out.println(year_list);
    }
}
