// Last updated: 7/9/2026, 9:45:43 AM
class Solution {
    public int minimumIndex(int[] c, int item) {
        int min =500000000;
        for(int i=0;i<c.length;i++){
            if(item ==c[i])
                return i;
            if(c[i]>item)
                 min=Math.min(c[i],min);
        }
       // System.out.print(min);
        //Arrays.sort(c);
        if(min>item){
        for(int i=0;i<c.length;i++){
            if(c[i]==min)
                // System.out.print(i);
                return i;
        }
        }
        
        return -1;
    }
}