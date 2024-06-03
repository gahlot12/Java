public class FindDuplicates {
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,4,5};
        boolean foundDuplicate = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                    foundDuplicate = true;
                    break;
                }
            }
            if(foundDuplicate)break;
        }
    }
}
