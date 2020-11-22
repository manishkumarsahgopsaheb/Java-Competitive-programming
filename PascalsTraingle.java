import java.util.ArrayList;
import java.util.List;

class SolutionForPascalTriangle{
    public List<List<Integer>> generate(int nRows){
        List<List<Integer>> triangle = new ArrayList<>();
        if (nRows == 0)
            return triangle;

        List<Integer> first_row = new ArrayList<>();
        first_row.add(1); // in first we have to add 1
        // inserting first row into the list
        triangle.add(first_row); // then i have added 1 in the list of list

        for (int i = 1; i<nRows;i++)
        {
            List<Integer> prev_row = triangle.get(i-1);
            List<Integer> curr_row = new ArrayList<>();

            curr_row.add(1); // starting of each row is containing 1

            for (int j = 1; j<i; j++)
            {
                curr_row.add(prev_row.get(j-1) + prev_row.get(j));
            }
            curr_row.add(1); // last of each row is containing 1
            triangle.add(curr_row); // finally add the each list into the triangle which is a list of list
        }
        return triangle;
    }
}

public class PascalsTraingle {
    public static void main(String[] args) {
        SolutionForPascalTriangle solutionForPascalTriangle = new SolutionForPascalTriangle();
        System.out.println(solutionForPascalTriangle.generate(5));
    }
}
