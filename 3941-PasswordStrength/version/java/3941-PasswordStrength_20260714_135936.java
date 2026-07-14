// Last updated: 7/14/2026, 1:59:36 PM
1class Solution {
2    public int passwordStrength(String password) {
3        int s=0;
4        HashSet<Character> hs= new HashSet<>();
5        for(char c:password.toCharArray()){
6            hs.add(c);
7        }
8        for(char c: hs){
9            if(c-'a'>=0 && c-'a'<=25)
10            s+=1;
11            if(c-'A'>=0 && c-'A'<=25)
12            s+=2;
13            if(c-'0'>=0 && c-'0'<=9)
14            s+=3;
15            if(c=='!' || c=='@'|| c=='#'|| c=='$')
16            s+=5;
17        }
18        return s;
19    }
20}