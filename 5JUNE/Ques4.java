import java.util.Map;
import java.util.HashMap;

public class Ques4 {
    public static boolean equalArr(int arr1[], int arr2[]) {
        int n = arr1.length;
        int m = arr2.length;

        if (n != m) return false;

        Map<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            mp.put(arr1[i], mp.getOrDefault(arr1[i], 0) + 1);
            mp.put(arr2[i], mp.getOrDefault(arr2[i], 0) - 1);
        }

        for (int count : mp.values()) {
            if (count != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7};
        int b[] = {2, 3, 4, 5, 6, 7, 1};

        if (equalArr(a, b)) {
            System.out.println("Both arrays are equal");
        } else {
            System.out.println("Both arrays are not equal");
        }
    }
}
