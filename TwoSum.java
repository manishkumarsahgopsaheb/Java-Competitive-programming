import java.util.Scanner;

class SolutionTwoSum{
    public int[] twoSum(int[] numbers, int target)
    {
        int a_pointer = 0;
        int b_pointer = numbers.length - 1;

        //using of LR(left-right) method
        while(a_pointer <= b_pointer){
            int sum = numbers[a_pointer] + numbers[b_pointer];
            if (sum > target)
            {
                b_pointer -= 1;
            }
            else if (sum < target)
            {
                a_pointer += 1;
            }
            else {
                return new int[] {a_pointer+1, b_pointer+1}; // this array holding the two element
            }
        }
        return new int[] {a_pointer+1, b_pointer+1};
    }
}


public class TwoSum {
    public static void main(String[] args) {

        int size;
        Scanner scanner =  new Scanner(System.in);
        System.out.println("enter the size of the array");
        size = scanner.nextInt();

        int num[] = new int[size];
        System.out.println("enter the element of the array");

        for (int i=0;i<size;i++)
        {
            num[i] = scanner.nextInt();
        }

        System.out.println("enter the target value");
        int target;
        target = scanner.nextInt();

        SolutionTwoSum solutionTwoSum = new SolutionTwoSum();
        int[] output = solutionTwoSum.twoSum(num, target);

        System.out.print("[");
        for (int i=0;i<output.length;i++)
        {
            System.out.print(output[i]);
            if (i<output.length-1)
            {
                System.out.print(",");
            }
        }
        System.out.print("]");


    }
}
