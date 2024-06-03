public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 8};
        int sum = 9;
        boolean found = false;
    
        for(int i = 0; i < 6; i++) {
            for(int j = i + 1; j < 6; j++) {
                if(arr[i] + arr[j] == sum) {
                    System.out.println(arr[i] + " " + arr[j]);
                    found = true; 
                }
            }
        }
        
        if (!found) {
            System.out.println("NNF");
        }

    }
}
