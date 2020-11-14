import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        try {
//            here you must give the complete path with the file name
            File input = new File("G:\\Test\\src\\nums.txt");
            File output = new File("G:\\Test\\src\\multiply10.txt");
            Scanner sc = new Scanner(input);
            PrintWriter printer = new PrintWriter(output);
            while (sc.hasNextLine()) {
                String str_num = sc.nextLine();
//                converting str_num into integer so that i can multiply it by 10
                int data = Integer.parseInt(str_num)*10;
//                again converting data to string so that i can write it into the multiply10.txt file
                String sdata = String.valueOf(data);
                printer.write(sdata+"\n");
            }
            printer.flush();
        }
        catch (FileNotFoundException e) {
            System.err.println("File not found");
        }
    }
}
