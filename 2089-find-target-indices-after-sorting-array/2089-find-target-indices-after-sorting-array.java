class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        if(nums.length == 0){
            return list;
        }
        int less = 0;
        int count = 0;
        for(int n:nums){
            if(n<target){
                less++;
            }
            else if(n==target){
                count++;
            }
        }
        for(int i=0;i<count;i++){
            list.add(less+i);
        }
        return list;
    }
}