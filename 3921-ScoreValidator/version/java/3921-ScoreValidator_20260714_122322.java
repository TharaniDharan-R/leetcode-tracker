// Last updated: 7/14/2026, 12:23:22 PM
1class Solution {
2    public int[] scoreValidator(String[] events) {
3       // HashMap<Integer,Integer> hm= new HashMap<>();
4        int s=0;
5        int c=0;
6        int a[]=new int[2];
7        for(int i=0;i<events.length;i++){
8            if(c>9)
9            break;
10            if(!events[i].equals("W") && !events[i].equals("WD") && !events[i].equals("NB")){
11                s+=Integer.parseInt(events[i]);
12            }
13            if(events[i].equals("WD")||events[i].equals("NB")){
14                s+=1;
15            }
16            if(events[i].equals("W"))
17            c++;
18        }
19        
20        a[0]=s;
21        a[1]=c;
22        return a;
23    }
24}