// Last updated: 7/31/2026, 9:33:39 AM
1class Solution {
2    public int minimumPushes(String word) {
3       int freq[]=new int[26];
4       for(char c:word.toCharArray()){
5        freq[c-'a']++;
6       }
7       Arrays.sort(freq);
8       int push=1;
9       int c=0;
10       int ans=0;
11       for(int i=25;i>=0;i--){
12        if(freq[i]==0)
13        break;
14        ans+=freq[i]*push;
15        c++;
16        if(c==8){
17            push+=1;
18            c=0;
19        }
20
21       }
22       return ans;
23    }
24}