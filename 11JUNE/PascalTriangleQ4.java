import java.util.ArrayList;
import java.util.List;

public class PascalTriangleQ4 {
    
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    int val = ans.get(i-1).get(j-1) + ans.get(i-1).get(j);
                    row.add(val);
                }
            }
            ans.add(row);
        }
        return ans;
    }

    public static void main(String[] args) {
        List<List<Integer>> pascalTriangle = generate(5);
    
        for (List<Integer> row : pascalTriangle) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }    
}
