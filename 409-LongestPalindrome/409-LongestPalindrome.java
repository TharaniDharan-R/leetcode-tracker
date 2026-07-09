// Last updated: 7/9/2026, 9:49:30 AM
class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int n=0;
        boolean b= false;
        for(int i:map.values()){
        if(i%2==0)
            n+=i;
            else{
                n+=i-1;
                b=true;  
            }
        }
            if(b)
            return n+=1;
        return n;
    }
}