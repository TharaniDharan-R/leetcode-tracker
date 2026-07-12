// Last updated: 7/12/2026, 8:06:19 PM
1class Solution {
2    public int[] arrayRankTransform(int[] arr) {
3       // int ans [] = new int[arr.length];
4        int ans1 [] = new int[arr.length];
5        for(int i=0;i<arr.length;i++){
6            ans1[i]= arr[i];
7            
8        }
9        Arrays.sort(ans1);
10        TreeSet <Integer> ts=new TreeSet<>();
11
12
13        TreeMap<Integer,Integer>hm= new TreeMap<>();
14        for(int i=0;i<ans1.length;i++){
15            ts.add(ans1[i]);
16        }
17        int c=1;
18        for(int i:ts){
19            
20            hm.put(i,c++);
21        }
22        for(int j=0;j<arr.length;j++){
23            if(hm.containsKey(arr[j])){
24                ans1[j]=hm.get(arr[j]);
25            }
26        }
27        return ans1;
28    }
29}