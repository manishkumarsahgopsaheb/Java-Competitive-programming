import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

class SolutionContainsDuplicate{

    // solution 1
    public boolean containsDuplicate(int[] nums){

        for (int i=0;i<nums.length;i++)
        {
            for (int j=i+1;j<nums.length;j++)
            {
                if (nums[i] == nums[j])
                    return true;
            }
        }
        return false;
    }

    // solution 2 using the concept of HashSet , we know that HashSet contains the unique element

    public boolean checkingDuplicate(int[] nums){
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i=0;i<nums.length;i++)
        {
            if (hashSet.contains(nums[i])) return true;
            hashSet.add(nums[i]);
        }
        return false;
    }

    // solution 3 using the concept of sorting, and check the current element to the
    // next element if they are equal then it containing the duplicate

    public boolean duplicate(int[] nums)
    {
        Arrays.sort(nums);

        for (int i=0;i<nums.length-1;i++)
        {
            if (nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }

}

public class ContainsDuplicate {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of the array");
        size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("enter the elements of the array");
        for (int i = 0;i<size; i++)
        {
            arr[i] = scanner.nextInt();
        }

        SolutionContainsDuplicate solutionContainsDuplicate = new SolutionContainsDuplicate();
        System.out.println("Solution 1 using O(n^2) complexity");
        System.out.println(solutionContainsDuplicate.containsDuplicate(arr));
        System.out.println("Solution 2 using HashSet");
        System.out.println(solutionContainsDuplicate.checkingDuplicate(arr));
        System.out.println("Solution 3 using Sorting");
        System.out.println(solutionContainsDuplicate.duplicate(arr));
    }
}
