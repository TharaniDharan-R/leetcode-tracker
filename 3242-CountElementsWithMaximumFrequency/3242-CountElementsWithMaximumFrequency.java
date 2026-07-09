// Last updated: 7/9/2026, 9:46:39 AM
class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer>a=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            a.put(nums[i],a.getOrDefault(nums[i],0)+1);  
        }
        int c=0;
        int max=0;
        for(int i:a.keySet()){
        if(a.get(i)>c){
        c=a.get(i);
        max=c;
        }
        else if(c==a.get(i)){
            max+=c;
            
        }
    }
        //System.out.print(a);

        return max;
    }
}