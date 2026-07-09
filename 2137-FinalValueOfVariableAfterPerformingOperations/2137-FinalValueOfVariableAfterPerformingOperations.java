// Last updated: 7/9/2026, 9:47:38 AM
class Solution {
    public int finalValueAfterOperations(String[] operations) {
         int c=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("X++"))
            c++;
            else if( operations[i].equals("++X"))
            c++;
            else if (operations[i].equals("X--"))
            c--;
            else
            c--;
            
            
            
            
        }
        return c;
    }
}