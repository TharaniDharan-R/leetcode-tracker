// Last updated: 7/9/2026, 9:48:05 AM
class Solution {
    public int minPartitions(String n) {
        int max=0;
        for(int i=0;i<n.length();i++){
            int d= n.charAt(i)-'0';
            if(d>max)
            max=d;
        }
        return max;
    }
}