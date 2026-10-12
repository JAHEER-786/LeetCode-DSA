class Solution {
    public boolean threeFibonacciSum(int n) {
        int x = 0;
        int y = 1;
        int z = 1;
        while( (x+y+z) <= n){
            if( (x+y+z) ==n ){
                return true;
            }
            x = y;
            y = z;
            z = x+y;
        }

        return false;
    }
}