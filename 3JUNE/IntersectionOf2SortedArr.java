import java.util.ArrayList;

public class IntersectionOf2SortedArr {
    public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m) {
        int i = 0, j = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        while (i < n && j < m) {
            if (arr1.get(i).equals(arr2.get(j))) {
                ans.add(arr1.get(i));
                i++;
                j++;
            } else if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 6};
        int b[] = {2, 2, 4};

        ArrayList<Integer> arr1 = new ArrayList<>();
        for (int num : a) {
            arr1.add(num);
        }

        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int num : b) {
            arr2.add(num);
        }

        ArrayList<Integer> result = findArrayIntersection(arr1, arr1.size(), arr2, arr2.size());
        // Print the result
        System.out.println("Intersection of the two sorted arrays is:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
