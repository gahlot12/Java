public class getPivotPointInRotatedSortedArrQ4 {
    public static int getpivot(int nums[],int n){
        int s =0 , e = n-1, mid = s + (e-s)/2;
        while (s<e){
            if (nums[mid]>=nums[0])
            {
                s = mid + 1;
            }
            else
            {
                e = mid;
            }
            
            mid = s + (e-s)/2;
        }
        return s;
    } 
    public static void main(String[] args) {
        int nums[] = {7, 8, 1, 3, 5};
        System.out.println(getpivot(nums, nums.length));
    }
}
