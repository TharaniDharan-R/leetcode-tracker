// Last updated: 7/9/2026, 9:48:45 AM
class Solution {
    public String defangIPaddr(String address) {
    
    String result =address.replace(".","[.]");
       return result;
    }
}