// Last updated: 7/9/2026, 9:49:11 AM
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int c=0;
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0){
                boolean l=(i==0)||(flowerbed[i-1]==0);
                boolean r=(i==flowerbed.length-1)||(flowerbed[i+1]==0);
            if(l && r){
                flowerbed[i]=1;
                n--;
            }
            }

        }
        if(n<=0)
        return true;
        else
        return false;
    }
}