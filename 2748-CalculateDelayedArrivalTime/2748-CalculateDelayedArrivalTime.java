// Last updated: 7/9/2026, 9:46:55 AM
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int s=arrivalTime+delayedTime;
        // if(s==24)
        // return 0;
        // if(s>24)
        return s%24;
        // return s;
    }
}