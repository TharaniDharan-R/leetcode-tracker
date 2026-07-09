// Last updated: 7/9/2026, 9:46:08 AM
class Solution {
    public int maxFreqSum(String s) {
      int amax=0;
      int bmax=0;
      for(int i=0;i<s.length();i++){
        int v=0;
        int c=0;
        for(int j=i;j<s.length();j++){
            if(s.charAt(i)==s.charAt(j)&&(s.charAt(j)=='a'||s.charAt(j)=='e'||s.charAt(j)=='i'||s.charAt(j)=='o'||s.charAt(j)=='u'))
            v++;
            else if(s.charAt(i)==s.charAt(j)&&(s.charAt(j)!='a'||s.charAt(j)!='e'||s.charAt(j)!='i'||s.charAt(j)!='o'||s.charAt(j)!='u'))
            c++;

        }
                    System.out.println(c+" "+v);

        if(amax<v)
        amax=v;
        else if(bmax<c)
        bmax=c;
      }  
      return amax+bmax;
    }
}