class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int canditate1= 0;       
        int canditate2= 0;
        int count1 = 0;
        int count2 = 0;
        for(int num:nums){
            if(canditate1==num){
                count1++;
            }else if(canditate2==num){
                count2++;
            }else if(count1==0){
                canditate1 = num;
                count1++;
            }else if(count2==0){
                canditate2 = num;
                count2++;
            }else{
                count1--;
                count2--;
            }
        }     
    count1 = 0;
    count2 = 0;
    for(int num:nums){
        if(num==canditate1){
            count1++;
        }else if(num==canditate2){
            count2++;
        }
    }
    int n = nums.length/3;
    if(count1>n){
        list.add(canditate1);
    }
    if(count2>n){
        list.add(canditate2);
    }
    return list;  
    }
   
}
