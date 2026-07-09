// Last updated: 7/9/2026, 9:50:01 AM
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character>hm=new HashMap<>();
        HashMap<Character,Character>hm1=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            char b=t.charAt(i);
        if(hm.containsKey(a)){
            if(hm.get(a)!=b)
            return false;
        }
            hm.put(a,b);
         if(hm1.containsKey(b)){
            if(hm1.get(b)!=a)
            return false;
         }
            hm1.put(b,a);
        
        }
        return true;
        
    }
}