//largest element goes to right place

public class bubbleSort {
    public static void sort(int arr[]){
        int n = arr.length;
        for(int i = 0;i<n-1;i++){
            boolean swapped = false;
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
        }
    }
    public static void main(String[] args) {
        // int arr[] = {2,4,2,4,5,1};
        int arr[] = {0,2,1};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
