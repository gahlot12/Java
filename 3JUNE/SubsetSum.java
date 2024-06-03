import java.util.ArrayList;
import java.util.List;

public class SubsetSum {
    
    public static void subsetSum(int num[],List<Integer> curr,int index,int targetSum,List<List<Integer>> subsets){
        if(targetSum==0){
            subsets.add(new ArrayList<>(curr));
        }
        if(index == num.length || targetSum < 0)return;

        if(targetSum >= num[index]){
            curr.add(num[index]);
            subsetSum(num, curr, index+1, targetSum-num[index],subsets);
            curr.remove(curr.size()-1);
        }
        subsetSum(num, curr, index+1, targetSum,subsets);

    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        List<List<Integer>> subsets = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        subsetSum(nums, curr, 0, 5,subsets);
        System.out.println(subsets);
    }
}