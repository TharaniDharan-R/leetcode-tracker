// Last updated: 7/9/2026, 9:46:42 AM
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
     List <Integer> a=new ArrayList<>();
     for(int i=0;i<words.length;i++){
        if(words[i].indexOf(x)!=-1){
            a.add(i);
        }
     }  
     return a;
    }
}