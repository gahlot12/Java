public class SpiralMatrixQ9 {
    public static void main(String[] args) {
        int n = 5;
        int[][] arr = new int[n][n];
        int total = n * n;

        int startingRow = 0;
        int startingCol = 0;
        int endingRow = n - 1;
        int endingCol = n - 1;

        int count = 1;

        while (count <= total) {
            for (int i = startingCol; i <= endingCol && count <= total; i++) {
                arr[startingRow][i] = count++;
            }
            startingRow++;

            for (int i = startingRow; i <= endingRow && count <= total; i++) {
                arr[i][endingCol] = count++;
            }
            endingCol--;

            for (int i = endingCol; i >= startingCol && count <= total; i--) {
                arr[endingRow][i] = count++;
            }
            endingRow--;

            for (int i = endingRow; i >= startingRow && count <= total; i--) {
                arr[i][startingCol] = count++;
            }
            startingCol++;
        }

        // Print the generated spiral matrix
        for (int[] row : arr) {
            for (int num : row) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }
}
