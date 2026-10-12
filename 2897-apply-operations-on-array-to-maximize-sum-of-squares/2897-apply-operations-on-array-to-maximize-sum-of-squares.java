class Solution {
    public int maxSum(List<Integer> nums, int k) {
        long mod = 1_000_000_007L;
        int bits[] = new int[32];
        for(int x:nums){
            for(int i=0;i<32;i++){
                if((x &(1<<i)) != 0){
                    bits[i]++;
                }
            }
        }

        long res = 0;

        while(k>0){
            long x = 0;
            long val = 1;
            for(int i=0;i<32;i++){
                if(bits[i]>0){
                    x += val;
                    bits[i]--;
                }
                val *= 2;
            }
            res = (res+(x*x))%mod;
            k--;
        }
        
        return (int)res;
    }
}