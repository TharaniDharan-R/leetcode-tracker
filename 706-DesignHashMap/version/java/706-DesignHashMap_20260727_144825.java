// Last updated: 7/27/2026, 2:48:25 PM
1class MyHashMap {
2    int hm[];
3    public MyHashMap() {
4        hm= new int[1000001];
5        Arrays.fill(hm,-1);
6    }
7    
8    public void put(int key, int value) {
9        hm[key]=value;
10    }
11    
12    public int get(int key) {
13        return hm[key];
14        
15    }
16    
17    public void remove(int key) {
18        hm[key]=-1;
19    }
20}
21
22/**
23 * Your MyHashMap object will be instantiated and called as such:
24 * MyHashMap obj = new MyHashMap();
25 * obj.put(key,value);
26 * int param_2 = obj.get(key);
27 * obj.remove(key);
28 */