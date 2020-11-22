import java.util.Scanner;

class Solution{
    public int Islands(char[][] grid){

//        as in the problem it is stated that only left, right, top, and bottom adjacent 1s is considered as Island
        int count = 0;
        for(int i=0;i<grid.length;i++){
            for (int j = 0;j<grid[i].length;j++)
            {
//                while traversing if i detect ones then change it to 2 or any other variable other than 0 and 1
//                and then call the BFS algorithm for checking the recursive 1s or for checking adjacent ones recursively

                if (grid[i][j] == '1'){
                    count = count + 1;
                    callBFS(grid, i, j);
                }

            }
        }
        return count;
    }

//    lets implement the BFS
    public void callBFS(char[][] grid, int i, int j) {
//        defining the boundary condition
        if (i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j]!= '1')
            return;

        grid[i][j] = 'x'; // yha kuchh bhi set kr do

//        now recursive call the BFS 4 times
        callBFS(grid, i + 1, j); // up
        callBFS(grid, i - 1, j); // down
        callBFS(grid, i, j - 1); // left
        callBFS(grid, i, j + 1); // right

    }
}


public class NumberOfIslands {
    public static void main(String[] args) {
        Solution solution =  new Solution();
        int row, col;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of the row");
        row  = scanner.nextInt();
        System.out.println("enter the number of column");
        col = scanner.nextInt();
        char[][] land = new char[row][col];
        System.out.println("enter the elements of the array: ");
        for (int i = 0;i<row;i++)
        {
            for (int j = 0;j<col;j++) {
                land[i][j] = scanner.next().charAt(0);
            }
        }

        System.out.println("number of Island is: "+solution.Islands(land));
    }
}
