// #include <vector>
// #include <algorithm>

// using namespace std;

// class Solution {
// public:
//     int maxProduct(vector<int>& nums) {
//         if (nums.empty()) return 0;
        
//         int max_prod = nums[0];
//         int min_prod = nums[0];
//         int result = nums[0];
        
//         for (int i = 1; i < nums.size(); ++i) {
//             if (nums[i] < 0)
//                 swap(max_prod, min_prod);
            
//             max_prod = max(nums[i], max_prod * nums[i]);
//             min_prod = min(nums[i], min_prod * nums[i]);
            
//             result = max(result, max_prod);
//         }
        
//         return result;
//     }
// };


public class MaxProdSubArrQ6 {
    public static int maxProduct(int[] nums) {
        double pre = 1,suff = 1;
        int ans = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i = 0;i<n;i++){
            if(pre == 0)pre = 1;
            if(suff == 0)suff = 1;

            pre = pre*nums[i];
            suff = suff*nums[n-i-1];
            ans = Math.max((int)ans,Math.max((int)pre,(int)suff));
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {0,10,10,10,10,10,10,10,10,10,-10,10,10,10,10,10,10,10,10,10,0};
        int nums2[] = {2,2,-3,-3,-1,2};
        System.out.println(maxProduct(nums));
        System.out.println(maxProduct(nums2));
    }
}
