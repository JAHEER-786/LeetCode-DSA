// class Solution {
//     public int sumCounts(List<Integer> nums) {
//         if(nums.size() == 0){
//             return 0;
//         }
//         int res = 0;
//         int n = nums.size();
//         int limit = (1<<n);
//         for(int i=0; i<limit;i++){
//             HashSet<Integer> set = new HashSet<>();
//             for(int j=0;j<n;j++){
//                 if((i & (1<<j)) !=0){
//                     set.add(nums.get(j));
//                 }
//             }
//             res += (set.size() * set.size());
//         }

//         return res;
//     }
// }


class Solution {
    public int sumCounts(List<Integer> nums) {
        int sum = 0;
        int n = nums.size();

        for(int i=0;i<n;i++){
            HashSet<Integer> set = new HashSet<>();
            for(int j=i;j<n;j++){
                set.add(nums.get(j));
                int count = set.size();
                sum += (count*count);
            }
        }

        return sum;
    }
}