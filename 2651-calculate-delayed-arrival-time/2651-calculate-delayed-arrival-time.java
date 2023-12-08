class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
      int NAT = arrivalTime + delayedTime;

        if (NAT >= 24) {
            NAT -= 24;
        }

        return NAT;  
    }
}