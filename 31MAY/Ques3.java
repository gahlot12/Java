// Program to print the duplicate elements of an array

public class Ques3 {
    public static void main(String[] args) {
        int arr[] = {1,2,1,3,4,3,6,4,5,6};
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[j]+" ");
                }
            }
        }
    }
}