// Last updated: 7/30/2026, 4:01:43 PM
1class Solution {
2    public int minimumPushes(String word) {
3        HashMap<Character,Integer>hm=new HashMap<>();
4        int co=0;
5        int k=0;
6        char ch[]=word.toCharArray();
7        for(int i=0;i<ch.length;i++){
8            char c=ch[i];
9            if(i<=7){
10                hm.put(c,hm.getOrDefault(c,0)+1);
11                k++;
12            }
13            if(i>7&& i<=15){
14                 hm.put(c,hm.getOrDefault(c,0)+2);
15                k++;
16            }
17            if(i>15 && i<=23){
18                 hm.put(c,hm.getOrDefault(c,0)+3);
19                k++;
20            }
21            if(i>23){
22                 hm.put(c,hm.getOrDefault(c,0)+4);
23                k++;
24            }
25        }
26        for(int i:hm.values()){
27            co+=i;
28        }
29        return co;
30    }
31}