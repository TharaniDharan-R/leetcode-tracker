// Last updated: 7/9/2026, 9:49:32 AM
class Solution {
    public int firstUniqChar(String s) {
        int [] feq=new int[256];
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            feq[c]++;
        }
          for(int j=0;j<s.length();j++){
            char c=s.charAt(j);
            if(feq[c]==1){
                return s.indexOf(c);
            }
          } 
          
        
        return -1;
    }
}