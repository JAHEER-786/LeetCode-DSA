class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(sum > (num*9)){
            return "";
        }

        StringBuilder sb = new StringBuilder();
        while(num>0){
            if(sum>9){
                sb.append("9");
                sum -= 9;
            }else{
                sb.append(String.valueOf(sum));
                sum = 0;
            }
            num--;
        }

        return sb.toString();
    }
}