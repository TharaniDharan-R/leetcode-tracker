// Last updated: 7/14/2026, 12:24:16 PM
1class Solution {
2    public int[] scoreValidator(String[] events) {
3       // HashMap<Integer,Integer> hm= new HashMap<>();
4        int s=0;
5        int c=0;
6        int a[]=new int[2];
7        for(int i=0;i<events.length;i++){
8            
9            if(!events[i].equals("W") && !events[i].equals("WD") && !events[i].equals("NB")){
10                s+=Integer.parseInt(events[i]);
11            }
12            if(events[i].equals("WD")||events[i].equals("NB")){
13                s+=1;
14            }
15            if(events[i].equals("W"))
16            c++;
17            if(c>9)
18            break;
19        }
20        
21        a[0]=s;
22        a[1]=c;
23        return a;
24    }
25}