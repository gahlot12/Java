public class IncreasingArrOrNot {
    public static boolean IncreasingOrNot(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] > arr[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 10};
        int[] arr2 = {4, 5, 7, 9, 11, 23};
        int[] arr3 = {23, 44, 1, 3, 55, 3, 4};

        System.out.println("Is arr increasing? " + IncreasingOrNot(arr));
        System.out.println("Is arr2 increasing? " + IncreasingOrNot(arr2));
        System.out.println("Is arr3 increasing? " + IncreasingOrNot(arr3));
    }
}
