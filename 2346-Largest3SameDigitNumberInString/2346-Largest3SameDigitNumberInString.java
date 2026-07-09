// Last updated: 7/9/2026, 9:47:22 AM
class Solution {
    public String largestGoodInteger(String num) {
        String l="";
        for(int i=0;i<=num.length()-3;i++)
        {
            String s=num.substring(i,i+3);
            if(s.charAt(0)==s.charAt(1) && s.charAt(1)==s.charAt(2))
            {
                   //if (largest.isEmpty() || sub.compareTo(largest) > 0) {
                if(l.isEmpty() ||s.compareTo(l)>0){
                    l=s;
                }
            }
            }
            return l;
        }
        
    }
