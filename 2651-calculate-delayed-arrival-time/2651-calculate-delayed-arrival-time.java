class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
      int newArrivalTime = arrivalTime + delayedTime;

        if (newArrivalTime >= 24) {
            newArrivalTime -= 24;
        }

        return newArrivalTime;  
    }
}