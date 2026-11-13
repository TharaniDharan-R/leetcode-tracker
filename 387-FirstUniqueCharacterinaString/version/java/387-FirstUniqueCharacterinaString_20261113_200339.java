// Last updated: 11/13/2026, 8:03:39 PM
1class Solution {
2    public int firstUniqChar(String s) {
3         LinkedHashMap<Character,Integer>hm= new LinkedHashMap<>();
4      for(int i=0;i<s.length();i++){
5          char c=s.charAt(i);
6        hm.put(c,hm.getOrDefault(c,0)+1);
7      }
8      char copy=0;
9      for(char i:hm.keySet()){
10        if(hm.get(i)==1){
11        copy=i;
12        System.out.print(i);
13        break;
14        }
15      }
16      int ans=0;
17      for(int i=0;i<s.length();i++){
18        if(copy==s.charAt(i)){
19            ans=i;
20     return ans;
21        
22        }
23      }
24      return -1;
25    }
26}