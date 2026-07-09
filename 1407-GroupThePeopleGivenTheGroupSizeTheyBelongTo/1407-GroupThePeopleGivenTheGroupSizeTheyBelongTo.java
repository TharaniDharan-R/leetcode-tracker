// Last updated: 7/9/2026, 9:48:35 AM
class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> ans = new ArrayList<>();

HashMap<Integer, List<Integer>> map = new HashMap<>();

for(int i = 0; i < groupSizes.length; i++) {

    int size = groupSizes[i];

    map.putIfAbsent(size, new ArrayList<>());

    map.get(size).add(i);

    if(map.get(size).size() == size) {

        ans.add(new ArrayList<>(map.get(size)));

        map.put(size, new ArrayList<>());
    }
}

return ans;
        
    }
}