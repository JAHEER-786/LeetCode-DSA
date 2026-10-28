class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> list = new ArrayList<>();
        int count = -1;
        for(int i=0;i<operations.length;i++){
            String c = operations[i];
            
            if(c.equals("+")){
                int n = list.get(count) + list.get(count-1);
                list.add(n);
                count++;
            }else if(c.equals("D")){
                int n = list.get(count)*2;
                list.add(n);
                count++;
            }else if(c.equals("C")){
                list.remove(count);
                count--;
            }else{
                list.add(Integer.parseInt(c));
                count++;
            }
        }
        int res = 0;
        for(int i=0;i<list.size();i++){
            res += list.get(i);
        }
        return res;
    }
}