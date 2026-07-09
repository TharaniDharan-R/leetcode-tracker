// Last updated: 7/9/2026, 9:48:38 AM
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int fre:map.values()){
            if(set.contains(fre))
            return false;
            set.add(fre);
        }
        return true;
    }
}