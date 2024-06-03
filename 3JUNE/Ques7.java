// Find the row with maximum number of 1s

public class Ques7 {
    public static int maxOnes(int arr[][]){
        int maxCount = 0,rowIndex = -1;
        int row = arr.length;
        int col = arr[0].length;
        for(int i = 0;i < row;i++){
            int count = 0;
            for(int j = 0;j < col; j++){
                if(arr[i][j]==1){
                    count++;
                }
            }
            if (count>maxCount) {
                maxCount = count;
                rowIndex = i;
            }
        }
        return rowIndex;
    }
    public static void main(String[] args) {
        int mat[][] = { {0, 0, 0, 1}, 
                    {0, 1, 1, 1}, 
                    {1, 1, 1, 1}, 
                    {0, 0, 0, 0}};
        System.out.println("Index with maximum 1s is : " + maxOnes(mat));
    }
}
