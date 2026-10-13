import java.util.*;
class Solution {
    public long maxAlternatingSum(int[] nums) {

       for(int i=0;i<nums.length;i++){
        nums[i] = nums[i]*nums[i];
       }

       Arrays.sort(nums);
       long ans = 0;
       int mid = (nums.length)/2;
       int i = 0 ; 
       int j = nums.length/2;

       while(i<mid && j<nums.length){
        ans += (nums[j]-nums[i]);
        i++;
        j++;
       }
       while(j<nums.length){
        ans += (nums[j]);
        j++;
       }

       return ans;
    }
}