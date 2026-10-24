class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int days[] = {0,31,59,90,120,151,181,212,243,273,304,334};
        int alicearrive = days[Integer.parseInt(arriveAlice.substring(0,2))-1]+Integer.parseInt(arriveAlice.substring(3,5));
        int aliceleave  = days[Integer.parseInt(leaveAlice.substring(0,2))-1]+Integer.parseInt(leaveAlice.substring(3,5));
        int bobarrive   = days[Integer.parseInt(arriveBob.substring(0,2))-1]+Integer.parseInt(arriveBob.substring(3,5));
        int bobleave    = days[Integer.parseInt(leaveBob.substring(0,2))-1]+Integer.parseInt(leaveBob.substring(3,5));
        int start = Math.max(alicearrive,bobarrive);
        int end = Math.min(aliceleave,bobleave);
        int res =  (end-start)+1 ;
        if(res<0){
            return 0;
        }
        return res;
    }
}