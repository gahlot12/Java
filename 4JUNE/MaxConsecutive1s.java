public class MaxConsecutive1s{

    public static int consecutiveOnes(int n, int[] arr) {
		int maxCount = 0;
		int currCount = 0;
		for(int i = 0;i<n;i++){
			if(arr[i]==1){
				currCount++;
				maxCount = Math.max(maxCount,currCount);
			}
			else{
				currCount = 0;
			}
		}
		return maxCount;
	}
    public static void main(String[] args) {
        int arr[] = {0,1,1,0,0,1,1,1,0,1};
        int max1s = consecutiveOnes(10, arr);
        System.out.println("Maximum consecutive 1s are : " + max1s);
    }
}