// Last updated: 7/9/2026, 9:47:36 AM
class Solution {
    public long countVowels(String word) {
        long ans=0;
        // for(int i=0;i<word.length();i++){
        //     for(int k=i;k<word.length();k++){
        //         for(int j=i;j<=k;j++){
        //         System.out.print(word.charAt(k));
        //         if(word.charAt(j)=='a'||word.charAt(j)=='e' || word.charAt(j)=='i'||word.charAt(j)=='o'||word.charAt(j)=='u')
        //         ans++;
        //         }
        //         System.out.println();
        //     }
            
        // }
        // return ans;
        for(int j=0;j<word.length();j++){
             if(word.charAt(j)=='a'||word.charAt(j)=='e' || word.charAt(j)=='i'||word.charAt(j)=='o'||word.charAt(j)=='u'){
                ans+=(long)(j+1)*(word.length()-j);
                
             }
        }
        return ans;
    }
}