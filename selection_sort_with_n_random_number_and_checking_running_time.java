import java.util.Random;
import java.util.Scanner;

public class selection_sort_with_n_random_number_and_checking_running_time {

    public static void selectionSort(int[] arr)
    {
        for(int i=0; i<arr.length-1; i++)
        {
            int index = i;
            for(int j = i + 1; j<arr.length; j++)
            {
                if(arr[j]<arr[index])
                {
//                  actually we are searching for the lowest index
                    index = j;
                }
            }
//          lowest number is a temporary number, which are used just for swapping purpose
            int lowest_number = arr[index];
            arr[index] = arr[i];
            arr[i] = lowest_number;
        }
    }


    public static void main(String[] args) {
        boolean flag = true;
        while(flag){
            System.out.println("press 9 to quit: and 1 for next ");
            Scanner cc = new Scanner(System.in);
            int choice = cc.nextInt();
            switch (choice){
                case 1:
                    int n;
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Enter the number of integers, to generate random number: ");
                    n = sc.nextInt();
                    int [] arr = new int[n];
                    Random random = new Random();
//      Storing n random numbers in array
                    for(int i=0; i<n; i++)
                    {
                        arr[i] = random.nextInt();
                    }
                    System.out.print("before sorting, code running time is: ");
                    System.out.println(System.currentTimeMillis());
//      calling selection sort method
                    selectionSort(arr);
                    System.out.print("After implementing selection sort algorithm, code running time is: ");
                    System.out.println(System.currentTimeMillis());
                    break;
                case 9:
                    flag = false;
                    break;
            }
        }

    }
}
