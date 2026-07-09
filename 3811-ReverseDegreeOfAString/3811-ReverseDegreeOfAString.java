// Last updated: 7/9/2026, 9:46:12 AM
class Solution {
    public int reverseDegree(String s) {
       int sum=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int rev=26-(c-'a');
            int pos=i+1;
            sum+=rev*pos;
        }
      return sum;  
    }
    
}