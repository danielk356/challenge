import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        int[][] array2D = {{5, 5, 5},
                          {5, 5, 5}};
        System.out.println("Expected output: true");
        System.out.println("Actual output: " + duplicateInColumn(array2D));

        int[][] moreArray = {{6, 5, 7, 1}, {4, 2, 4, 6}, {2, 3, 4, 8}};
        System.out.println("Expected output: true");
        System.out.println("Actual output: " + duplicateInColumn(moreArray));

        int[][] moreArrayy = {{6, 5, 7, 1}, {4, 2, 4, 6}, {2, 3, 5, 8}};
        System.out.println("Expected output: false");
        System.out.println("Actual output: " + duplicateInColumn(moreArrayy));

    }

    public static boolean duplicateInColumn(int[][] array2D) {
        ArrayList<Integer> column = new ArrayList<Integer>();

        for (int col = 0; col < array2D[0].length; col++)
        {
            for (int row = 0; row < array2D.length; row++)
            {
                column.add(array2D[row][col]);
            }
            for (int i = 0; i < column.size(); i++)
            {
                for (int e = 0; e < column.size(); e++)
                {
                    if (column.get(i) == column.get(e) && e != i)
                    {
                        return true;
                    }
                }
            }
            column.removeAll(column);
        }
        return false;
    }
}
