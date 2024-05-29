public class SecondLargestInArr {
    public static int secondLargest(int[] arr) {
        int n = arr.length;

        int maxi = Integer.MIN_VALUE;
        int maxi2 = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > maxi) {
                maxi2 = maxi;
                maxi = arr[i];
            } else if (arr[i] > maxi2 && arr[i] != maxi) {
                maxi2 = arr[i];
            }
        }
        if (maxi2 != Integer.MIN_VALUE) return maxi2;
        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {12, 35, 1, 10, 34, 1};
        int[] arr2 = {10, 5, 10};
        
        System.out.println(secondLargest(arr1)); // Output: 34
        System.out.println(secondLargest(arr2)); // Output: 5
    }
}
