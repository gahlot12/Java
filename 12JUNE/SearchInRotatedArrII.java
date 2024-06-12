public class SearchInRotatedArrII {
    public static boolean search(int[] nums, int target) {
        int n = nums.length;
        int s = 0;
        int e = n-1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(nums[mid]==target)return true;
            if(nums[s]==nums[mid] && nums[mid]==nums[e]){
                s++;
                e--;
                continue;
            }
            if(nums[s]<=nums[mid]){
                if(nums[s]<=target && target<=nums[mid]) e = mid - 1;
                else s = mid+1;
            }
            else{
                if(nums[e]>=target && target>=nums[mid]) s = mid + 1;
                else e = mid -1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {4,5,6,6,7,0,1,2,4,4};
        System.out.println(search(nums, 5));
    }
}
