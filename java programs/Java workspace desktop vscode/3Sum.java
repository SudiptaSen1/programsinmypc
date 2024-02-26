import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        // Sort the array
        Arrays.sort(nums); //[-1,-1,0,1]

        for (int i = 0; i < nums.length - 2; i++) { // i=0; i<=1; i++
            // Skip duplicate elements for i
            if (i > 0 && nums[i] == nums[i - 1]) {  // true false
                continue;
            }

            int j = i + 1;// j=1
            int k = nums.length - 1; // k=3

            while (j < k) {// 2<3
                int sum = nums[i] + nums[j] + nums[k];//  -1+0+1

                if (sum == 0) { //true
                    // Found a triplet with zero sum
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));//[[-1,0,1]]

                    // Skip duplicate elements for j
                    // while (j < k && nums[j] == nums[j + 1]) {
                    //     j++;
                    // }

                    // // Skip duplicate elements for k
                    // while (j < k && nums[k] == nums[k - 1]) {
                    //     k--;
                    // }

                    // Move the pointers
                    j++;//3
                    k--;//2
                } else if (sum < 0) { //true
                    // Sum is less than zero, increment j to increase the sum
                    j++;// j=2
                } else {
                    // Sum is greater than zero, decrement k to decrease the sum
                    k--;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Solution s=new Solution();
        int[] a = {-1,0,1,2,-1,-4};
        System.out.println(s.threeSum(a));
    }
}