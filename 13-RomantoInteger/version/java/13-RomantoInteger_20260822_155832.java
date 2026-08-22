// Last updated: 8/22/2026, 3:58:32 PM
1class Solution {
2    public int romanToInt(String s) {
3        int a=0;
4        int b=0;
5        for(int i=s.length()-1;i>=0;i--){
6            int n=0;
7            switch(s.charAt(i)){
8            case 'I':
9            n+=1; break;
10            case 'V':
11            n+=5; break;
12            case 'X':
13            n+=10; break;
14            case 'L':
15            n+=50; break;
16            case 'C':
17            n+=100; break;
18            case 'D':
19            n+=500; break;
20            case 'M':
21            n+=1000; break;
22            }
23            if(n<b){
24                a=a-n;
25            }
26            else{
27                a=a+n;
28            }
29            b=n;
30        }
31        return a;
32    }
33}