public class ThirdMinimumInArray {
    public static int thirdMin(int[] arr) {
        int n = arr.length;
        int mini1 = Integer.MAX_VALUE, mini2 = Integer.MAX_VALUE, mini3 = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
        if (arr[i] > mini1) {
            // mini3 = mini2;
            // mini2 = mini1;
            mini1 = arr[i];
        } else if (arr[i] > mini2 && arr[i] != mini1) {
            // mini3 = mini2;
            if(arr[i]!=mini1) mini2 = arr[i];
        } else if (arr[i] > mini3 && arr[i] != mini1 && arr[i] != mini2) {
            if(arr[i]!=mini1 ||arr[i]!=mini2) mini3 = arr[i];
        }
    }
    return (mini3 != Integer.MAX_VALUE) ? mini3 : -1;
    }
    
    public static void main(String[] args) {
        int[] arr = {4, 2, 9, 1, 0, -1, -2, 2, -2};
        int ans = thirdMin(arr);
        System.out.println(ans);
    }
}
