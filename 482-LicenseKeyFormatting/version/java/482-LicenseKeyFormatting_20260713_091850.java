// Last updated: 7/13/2026, 9:18:50 AM
1class Solution {
2    public String licenseKeyFormatting(String s, int k) {
3        StringBuilder str = new StringBuilder();
4        StringBuilder ans= new StringBuilder();
5        for(int i=0;i<s.length();i++){
6            if(s.charAt(i)!='-')
7            str.append((Character.toUpperCase(s.charAt(i))));
8            
9        }
10        int c=0;
11        for(int i=str.length()-1;i>=0;i--){   
12         ans.append(str.charAt(i));
13         c++;
14         if(c==k && i!=0){
15            ans.append("-");
16            c=0;
17         }
18        }
19        
20        return ans.reverse().toString();
21    }
22}