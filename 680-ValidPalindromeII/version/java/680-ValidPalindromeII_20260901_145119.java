// Last updated: 9/1/2026, 2:51:19 PM
1class Solution {
2    public boolean validPalindrome(String s) {
3       int left =0;
4       int right= s.length()-1;
5       while(left< right){
6        if(s.charAt(left)!=s.charAt(right)){
7            return ispalindrome(s,left+1,right)||ispalindrome(s,left,right-1);
8        }
9        left++;
10        right--;
11       }
12       return true;
13    }
14       public boolean ispalindrome(String s,int left,int right){
15        while(left<right){
16            if(s.charAt(left)!=s.charAt(right)){
17                return false;
18            }
19            left++;
20            right--;
21        }
22        return true;
23       }
24    
25}