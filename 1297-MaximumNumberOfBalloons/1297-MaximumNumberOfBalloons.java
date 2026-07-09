// Last updated: 7/9/2026, 9:48:40 AM
class Solution {
    public int maxNumberOfBalloons(String text) {
       // int c=0;
       int min =0;
       HashMap<Character,Integer> hm = new HashMap<>();
        for( Character ch :text.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        int b=hm.getOrDefault('b',0);
        int a = hm.getOrDefault('a',0);
        int l= hm.getOrDefault('l',0)/2;
        int o=hm.getOrDefault('o',0)/2;
        int n=hm.getOrDefault('n',0);
        min = Math.min(Math.min(Math.min(b,a),Math.min(l,o)),n);
        return min;
            
        
    }
}