// Last updated: 7/9/2026, 9:47:59 AM
class Solution {
    public String truncateSentence(String s, int k) {
        String a[]=s.split(" ");
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<k;i++){
            if(i!=k-1)
            sb.append(a[i]+" ");
            else
            sb.append(a[i]);
        }
        return sb.toString();
    }
}