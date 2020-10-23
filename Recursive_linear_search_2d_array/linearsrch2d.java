import java.util.Scanner;

public class linearsrch2d {
    static void srch(int[][] arr, int row, int col, int key, int ir, int jc)
    {
        if(key == arr[ir][jc])
        {
            String str = "element found at "+ir+" and "+jc+" index";
            System.out.println(str);
            return ;
        }
        else if(jc!=col-1)
        {
            jc++;
            srch(arr, row, col, key, ir, jc);
        }
        else if(jc == col-1 && ir!=row-1)
        {
            ir++;
            jc = 0;
            srch(arr, row, col, key, ir, jc);
        }
        else
        {
            System.out.println("element not found");
        }
    }

    public static void main(String[] args) {
        int row;
        int col;
        Scanner scanner = new Scanner(System.in);
        System.out.print("number of row: ");
        row = scanner.nextInt();
        System.out.print("number of column: ");
        col = scanner.nextInt();
        int[][] arr  = new int[row][col];
        System.out.println("enter the elements: ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.print("searching element is: ");
        int key = scanner.nextInt();
        int ir=0;
        int jc=0;
        srch(arr, row, col, key, ir, jc);
    }
}
