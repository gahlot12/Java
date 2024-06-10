import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ques4ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> triplets = new ArrayList<>();
        Arrays.sort(nums);
        int K = 0;
        int n = nums.length;

        for(int i = 0;i<n-2;i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int j = i+1;
            int k = n-1;
            while(j<k){
                if(nums[i]+nums[j]+nums[k]==K){
                    triplets.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1])j++;
                    while(j<k && nums[k]==nums[k+1])k--;
                }
                
                else if(nums[i]+nums[j]+nums[k]<K){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return triplets;
    }

    public static void main(String[] args) {
        int nums[] = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
}
