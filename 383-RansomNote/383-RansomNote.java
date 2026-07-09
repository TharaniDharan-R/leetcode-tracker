// Last updated: 7/9/2026, 9:49:34 AM
class Solution {
    public boolean canConstruct(String a, String b) {
        int arr[]=new int[26];
        for(int i=0;i<b.length();i++){
            char ch=b.charAt(i);
            arr[ch-'a']++;
        }
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            if(arr[ch-'a']==0)
            return false;
        arr[ch-'a']--;
        }
    return true;
    }
}