// it must be used when the array size is small
//smallest element selected from diffrent rounds or passes and placed at right position
//smallest element laake use right place pe rakhna hai

public class SelectionSort{
    public static void sort(int arr[]){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            int min_index = i;
            for(int j = i+1;j<n;j++){
                if(arr[j]<arr[min_index]) min_index = j;
            }
            if(i!=min_index){
                int temp = arr[min_index];
                arr[min_index] = arr[i];
                arr[i] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,2,4,5,1};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}