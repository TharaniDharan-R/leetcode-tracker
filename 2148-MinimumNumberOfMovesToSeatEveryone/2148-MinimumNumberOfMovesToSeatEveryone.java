// Last updated: 7/9/2026, 9:47:37 AM
class Solution {
    public int minMovesToSeat(int[] seats, int[] s) {
        Arrays.sort(seats);
        Arrays.sort(s);
        int sum=0;
        for(int i=0;i<seats.length;i++){
            sum+=Math.abs(seats[i]-s[i]);
        }
        return sum;

    }
}